package com.venurapallawela.idog;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class IdentifyBreed extends MainActivity {
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private TextView textView;
    private Button button;

    /**Assigning of variables for the Initial Output when the Screen Loads**/
    private String firstDogBreed1;
    private String firstDogBreed2;
    private String firstDogBreed3;
    private int firstDogImage1;
    private int firstDogImage2;
    private int firstDogImage3;
    private ArrayList<String> firstRandomlySelectedDogList;
    /**Until Here **/

    /****/
    private ArrayList<String> randomlySelectedDogList;
    private String dogBreed1;
    private String dogBreed2;
    private String dogBreed3;
    private int dogImage1;
    private int dogImage2;
    private int dogImage3;
    private String dogInputImage1;
    private String dogInputImage2;
    private String dogInputImage3;
    private String setTextInTextView;
    /****/

    private ArrayList<String> dogBreed = new ArrayList<>();

    //making of the dogbreed() array. for the use of the methods below.
    public void updateDogBreed(){
        dogBreed.add("borderterrier");
        dogBreed.add("englishfoxhound");
        dogBreed.add("eskimodog");
        dogBreed.add("germanshepherd");
        dogBreed.add("goldenretriever");
        dogBreed.add("labradorretriever");
        dogBreed.add("miniaturepoodle");
        dogBreed.add("rottweiler");
        dogBreed.add("silkyterrier");
        dogBreed.add("toypoodle");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        updateDogBreed();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identify_breed_menu);

        imageView1 = findViewById(R.id.doggyImage1);
        imageView2 = findViewById(R.id.doggyImage2);
        imageView3 = findViewById(R.id.doggyImage3);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        //firstRandomlySelectedDogList gets 3 Breeds from the getRandomBreed() method
        firstRandomlySelectedDogList = getRandomDogBreed();

        //assings a number infront on the image from getRandomNumberinRange() method, so it turns to the filetype.
        firstDogBreed1 = firstRandomlySelectedDogList.get(0)+getRandomNumberInRange(1,10);
        firstDogBreed2 = firstRandomlySelectedDogList.get(1)+getRandomNumberInRange(1,10);
        firstDogBreed3 = firstRandomlySelectedDogList.get(2)+getRandomNumberInRange(1,10);


        //Gets the relevant image from the drawable folder and assigns it to another variable
        firstDogImage1 = getResources().getIdentifier(firstDogBreed1, "drawable", "com.venurapallawela.idog");
        firstDogImage2 = getResources().getIdentifier(firstDogBreed2, "drawable", "com.venurapallawela.idog");
        firstDogImage3 = getResources().getIdentifier(firstDogBreed3, "drawable", "com.venurapallawela.idog");

        //Finally assings the resource to the ImageView
        this.imageView1.setImageDrawable(getResources().getDrawable(firstDogImage1));
        this.imageView2.setImageDrawable(getResources().getDrawable(firstDogImage2));
        this.imageView3.setImageDrawable(getResources().getDrawable(firstDogImage3));

        //Gets a Random Breed Name from the Dogbreed array, finds a random position of a breed and displays it on the TextView.
        textView.setText(firstRandomlySelectedDogList.get(getRandomNumberInRange(0,2)));

        System.out.println(firstDogBreed1);
        System.out.println(firstDogBreed2);
        System.out.println(firstDogBreed3);
        System.out.println(firstDogImage1);
        System.out.println(firstDogImage2);
        System.out.println(firstDogImage3);
        System.out.println(firstRandomlySelectedDogList);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //firstRandomlySelectedDogList gets 3 Breeds from the getRandomBreed() method
                randomlySelectedDogList = getRandomDogBreed();

                //assings a position in the array for the inputImages respectively
                dogInputImage1 = randomlySelectedDogList.get(0);
                dogInputImage2 = randomlySelectedDogList.get(1);
                dogInputImage3 = randomlySelectedDogList.get(2);

                //assigns a random number between 1-10 infront of the string text so it matches with the filename in drawable
                dogBreed1 = dogInputImage1+getRandomNumberInRange(1,10);
                dogBreed2 = dogInputImage2+getRandomNumberInRange(1,10);
                dogBreed3 = dogInputImage3+getRandomNumberInRange(1,10);

                //finally assigns the image to the imageview after recalling the image from the drawable folder.
                dogImage1 = getResources().getIdentifier(dogBreed1, "drawable", "com.venurapallawela.idog");
                imageView1.setImageResource(dogImage1);
                imageView1.setTag(dogImage1);

                dogImage2 = getResources().getIdentifier(dogBreed2, "drawable", "com.venurapallawela.idog");
                imageView2.setImageResource(dogImage2);
                imageView2.setTag(dogImage2);

                dogImage3 = getResources().getIdentifier(dogBreed3, "drawable", "com.venurapallawela.idog");
                imageView3.setImageResource(dogImage3);
                imageView3.setTag(dogImage3);

                //sets text into the TextView from a randomly obtained dogbreed.
                setTextInTextView = randomlySelectedDogList.get(getRandomNumberInRange(0,2));
                textView.setText(setTextInTextView);

                //assiging the image Tag(filename) ""come.venurapallawela.idog/drawable/breedname1" to a string
                final String clickedImage1 = getResources().getResourceName((Integer)imageView1.getTag());
                final String clickedImage2 = getResources().getResourceName((Integer)imageView2.getTag());
                final String clickedImage3 = getResources().getResourceName((Integer)imageView3.getTag());
                button.setVisibility(View.GONE);

                //Validating The onClick of the Image with ImageView1
                imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println(clickedImage1);
                        System.out.println(setTextInTextView);
                        //contains checks if the text has the relevant specified keywords.
                        if (clickedImage1.contains("borderterrier") && setTextInTextView.equals("borderterrier")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("englishfoxhound") && setTextInTextView.equals("englishfoxhound")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("eskimodog") && setTextInTextView.equals("eskimodog")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("germanshepherd") && setTextInTextView.equals("germanshepherd")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("goldenretriever") && setTextInTextView.equals("goldenretriever")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("labradorretriever") && setTextInTextView.equals("labradorretriever")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("miniaturepoodle") && setTextInTextView.equals("miniaturepoodle")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("rottweiler") && setTextInTextView.equals("rottweiler")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("silkyterrier") && setTextInTextView.equals("silkyterrier")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage1.contains("toypoodle") && setTextInTextView.equals("toypoodle")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else {
                            Toast toast = Toast.makeText(IdentifyBreed.this, "WRONG", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#FF0000"));
                            toast.show();
                            openIdentifyDogWindow();
                            Toast toast1 = Toast.makeText(IdentifyBreed.this, "Redirected to Main Menu", Toast.LENGTH_SHORT);
                            view = toast1.getView();
                            TextView text1 = view.findViewById(android.R.id.message);
                            text1.setTextColor(Color.parseColor("#0000FF"));
                            toast1.show();
                            openIdentifyDogWindow();
                        }
                    }
                });
                //Validating The onClick of the Image with ImageView2
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println(clickedImage2);
                        System.out.println(setTextInTextView);
                        if (clickedImage2.contains("borderterrier") && setTextInTextView.equals("borderterrier")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("englishfoxhound") && setTextInTextView.equals("englishfoxhound")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("eskimodog") && setTextInTextView.equals("eskimodog")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("germanshepherd") && setTextInTextView.equals("germanshepherd")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("goldenretriever") && setTextInTextView.equals("goldenretriever")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("labradorretriever") && setTextInTextView.equals("labradorretriever")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("miniaturepoodle") && setTextInTextView.equals("miniaturepoodle")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("rottweiler") && setTextInTextView.equals("rottweiler")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("silkyterrier") && setTextInTextView.equals("silkyterrier")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage2.contains("toypoodle") && setTextInTextView.equals("toypoodle")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else {
                            Toast toast = Toast.makeText(IdentifyBreed.this, "WRONG", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#FF0000"));
                            toast.show();
                            openIdentifyDogWindow();
                            Toast toast1 = Toast.makeText(IdentifyBreed.this, "Redirected to Main Menu", Toast.LENGTH_SHORT);
                            view = toast1.getView();
                            TextView text1 = view.findViewById(android.R.id.message);
                            text1.setTextColor(Color.parseColor("#0000FF"));
                            toast1.show();
                            openIdentifyDogWindow();
                        }
                    }
                });
                //Validating The onClick of the Image with ImageView3
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println(clickedImage3);
                        System.out.println(setTextInTextView);
                        if (clickedImage3.contains("borderterrier") && setTextInTextView.equals("borderterrier")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("englishfoxhound") && setTextInTextView.equals("englishfoxhound")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("eskimodog") && setTextInTextView.equals("eskimodog")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("germanshepherd") && setTextInTextView.equals("germanshepherd")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("goldenretriever") && setTextInTextView.equals("goldenretriever")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("labradorretriever") && setTextInTextView.equals("labradorretriever")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("miniaturepoodle") && setTextInTextView.equals("miniaturepoodle")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("rottweiler") && setTextInTextView.equals("rottweiler")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("silkyterrier") && setTextInTextView.equals("silkyterrier")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else if (clickedImage3.contains("toypoodle") && setTextInTextView.equals("toypoodle")){
                            button.setVisibility(View.VISIBLE);
                            Toast toast = Toast.makeText(IdentifyBreed.this, "CORRECT", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#008000"));
                            toast.show();
                        }
                        else {
                            Toast toast = Toast.makeText(IdentifyBreed.this, "WRONG", Toast.LENGTH_SHORT);
                            View view = toast.getView();
                            TextView text = view.findViewById(android.R.id.message);
                            text.setTextColor(Color.parseColor("#FF0000"));
                            toast.show();
                            openIdentifyDogWindow();
                            Toast toast1 = Toast.makeText(IdentifyBreed.this, "Redirected to Main Menu", Toast.LENGTH_SHORT);
                            view = toast1.getView();
                            TextView text1 = view.findViewById(android.R.id.message);
                            text1.setTextColor(Color.parseColor("#0000FF"));
                            toast1.show();
                            openIdentifyDogWindow();
                        }
                    }
                });
            }
        });
    }

    public ArrayList<String> getRandomDogBreed(){
        ArrayList<String> imagesArray = new ArrayList<>();
        do{
            if(imagesArray.size()==0){
                imagesArray.add(dogBreed.get(getRandomNumberInRange(0,(dogBreed.size()-1))));
            }else{
                String randomImage = dogBreed.get(getRandomNumberInRange(0,(dogBreed.size()-1)));
                if(imagesArray.indexOf(randomImage)==-1){
                    imagesArray.add(randomImage);
                }
            }
        }
        while(imagesArray.size()!=3);
        return imagesArray;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    //Opens up the Identify Breed Window
    public void openIdentifyDogWindow() {
        Intent intent = new Intent(IdentifyBreed.this, MainActivity.class);
        startActivity(intent);
        //Assigning the XML File to the Relevant Class associated with it
        //setContentView(R.layout.identify_dog_menu);
    }

}
