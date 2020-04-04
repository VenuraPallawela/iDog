package com.venurapallawela.idog;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Random;


public class IdentifyDog extends MainActivity{

    private ImageView imageView;
    private Button button;
    private Spinner dropdownList;
    private String spinnerText;
    private ArrayList<String> dogBread = new ArrayList<>();
    private String breedName;
    private String breedName1;
    private int resID;
    private int resID1;
    private String randomImageName;
    private String randomImageName1;

    public void updateDogBreed() {
        dogBread.add("borderterrier");
        dogBread.add("englishfoxhound");
        dogBread.add("eskimodog");
        dogBread.add("germanshepherd");
        dogBread.add("goldenretriever");
        dogBread.add("labradorretriever");
        dogBread.add("miniaturepoodle");
        dogBread.add("rottweiler");
        dogBread.add("silkyterrier");
        dogBread.add("toypoodle");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identify_dog_menu);
        updateDogBreed();

        imageView = (ImageView) findViewById(R.id.doggyImage1);
        button = (Button) findViewById(R.id.button);
        dropdownList = (Spinner) findViewById(R.id.dogBreeds);
        //variable assigned
        firstRandomImage();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomisedImages();


                /** After Selecting the Dog Breed from the dropdown menu, this method assigns the image selected as a text to a variable**/
                dropdownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        spinnerText = (String) parent.getItemAtPosition(position);
                        System.out.println(breedName);
                        System.out.println(breedName1);
                        if (breedName1.equals(spinnerText)) {
                            Toast toast = Toast.makeText(IdentifyDog.this, "CORRECT!", Toast.LENGTH_SHORT);
                            view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                            button.setText("Next");
                        }
                        else {
                            Toast toast = Toast.makeText(IdentifyDog.this, "WRONG!", Toast.LENGTH_SHORT);
                            view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#FF0000"));
                            toast.show();

                            Toast toast1 = Toast.makeText(IdentifyDog.this, "CORRECT BREED IS " + breedName1, Toast.LENGTH_SHORT);
                            view = toast1.getView();
                            TextView text1 = view.findViewById(android.R.id.message);
                            text1.setTextColor(Color.parseColor("#0000FF"));
                            toast1.show();
                            openIdentifyDogWindow();
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                /** Up until Here**/
            }
        });
    }

    private void randomisedImages() {
        breedName1 = getRandomDogBreed();
        System.out.println(breedName1);
        randomImageName1 = breedName1 + getRandomNumberInRange(1, 10);
        resID1 = getResources().getIdentifier(randomImageName1, "drawable", "com.venurapallawela.idog");
        imageView.setImageResource(resID1);
        button.setText("SUBMIT");
    }

    private void firstRandomImage() {
        breedName = getRandomDogBreed();
        randomImageName = breedName + getRandomNumberInRange(1, 10);
        resID = getResources().getIdentifier(randomImageName, "drawable", "com.venurapallawela.idog");
        this.imageView.setImageDrawable(getResources().getDrawable(resID));
        System.out.println(breedName);
    }


    //Gets the Random Number from getRandomNumberInRange() and finds a image in the array of Dog Images relevant to that Number.(with that index).
    public String getRandomDogBreed() {
        return dogBread.get(getRandomNumberInRange(1, (dogBread.size() - 1)));
    }


    //Gets a random number, a Minimum and Maximum.
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //Opens up the Identify Breed Window
    public void openIdentifyDogWindow() {
        Intent intent = new Intent(IdentifyDog.this, MainActivity.class);
        startActivity(intent);
        //Assigning the XML File to the Relevant Class associated with it
        //setContentView(R.layout.identify_dog_menu);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("BREEDNAME", breedName);
        outState.putString("BREEDNAME1", breedName1);
        outState.putInt("RESID", resID);
        outState.putInt("RESID1", resID1);
        outState.putString("RANDOMIMAGENAME", randomImageName);
        outState.putString("RANDOMIMAGENAME1", randomImageName1);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        breedName = savedInstanceState.getString("BREEDNAME");
        breedName1 = savedInstanceState.getString("BREEDNAME1");
        resID = savedInstanceState.getInt("RESID");
        resID1 = savedInstanceState.getInt("RESID1");
        randomImageName = savedInstanceState.getString("RANDOMIMAGENAME");
        randomImageName1 = savedInstanceState.getString("RANDOMIMAGENAME1");
        firstRandomImage();
        getRandomDogBreed();
        randomisedImages();
        updateDogBreed();
    }
}

