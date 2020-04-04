package com.venurapallawela.idog;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Random;

public class SearchDogBreed extends MainActivity {

    private ImageView imageView1;
    private TextInputEditText searchText;
    private Button submitButton;
    private Button stopButton;
    private String userInputString;
    private ArrayList<String> dogBreed = new ArrayList<>();

    public void updateDogBreed() {
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_dog_breed_menu);
        updateDogBreed();
        imageView1 = (ImageView) findViewById(R.id.doggyImageSlideshow);
        searchText = (TextInputEditText) findViewById(R.id.doggySearch);
        submitButton = (Button) findViewById(R.id.buttonSubmit);
        stopButton = (Button) findViewById(R.id.buttonStop);
        imageView1.setImageResource(R.drawable.enterdogimage);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInputString = String.valueOf(searchText.getText());
                if (dogBreed.contains(userInputString)) {
                    if (userInputString.equals("borderterrier")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "borderterrier" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("englishfoxhound")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "englishfoxhound" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("eskimodog")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "eskimodog" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("germanshepherd")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "germanshepherd" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("goldenretriever")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "goldenretriever" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("labradorretriever")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "labradorretriever" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("miniaturepoodle")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "miniaturepoodle" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("rottweiler")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "rottweiler" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("silkyterrier")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "silkyterrier" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if (userInputString.equals("toypoodle")) {
                        Toast toast = Toast.makeText(SearchDogBreed.this, "Slideshow in progress.....", Toast.LENGTH_SHORT);
                        View view = toast.getView();
                        TextView text = view.findViewById(android.R.id.message);
                        text.setTextColor(Color.parseColor("#008000"));
                        toast.show();
                        final CountDownTimer t = new CountDownTimer(250000000, 5000) {

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String randomImageName2 = "toypoodle" + getRandomNumberInRange(1, 10);
                                int resID1 = getResources().getIdentifier(randomImageName2, "drawable", "com.venurapallawela.idog");
                                imageView1.setImageResource(resID1);
                                stopButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.GONE);
                                submitButton.setVisibility(View.GONE);
                            }

                            @Override
                            public void onFinish() {

                            }
                        }.start();
                        stopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t.cancel();
                                imageView1.setImageResource(R.drawable.enterdogimage);
                                stopButton.setVisibility(View.GONE);
                                submitButton.setVisibility(View.VISIBLE);
                                searchText.setVisibility(View.VISIBLE);
                            }
                        });
                    }

                } else if (userInputString.isEmpty()) {
                    Toast toast = Toast.makeText(SearchDogBreed.this, "Please Enter a Breed", Toast.LENGTH_SHORT);
                    View view = toast.getView();
                    TextView text = view.findViewById(android.R.id.message);
                    text.setTextColor(Color.parseColor("#FF0000"));
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(SearchDogBreed.this, "Dog Breed Not Found!", Toast.LENGTH_SHORT);
                    View view = toast.getView();
                    TextView text = view.findViewById(android.R.id.message);
                    text.setTextColor(Color.parseColor("#FF0000"));
                    toast.show();
                }
            }
        });

    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
