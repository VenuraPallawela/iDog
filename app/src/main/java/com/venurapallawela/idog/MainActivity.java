package com.venurapallawela.idog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Switch gameMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intitiating the switch
        gameMode = (Switch) findViewById(R.id.switch_game_mode);
//        switchButtonTimer();
        //Setting up the OnClickListeners for the buttons to redirect to that Intent
        button1 = findViewById(R.id.identifyBreed); //assigning the buttonID to the button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIdentifyDogWindow();
            }
        });

        //Setting up the OnClickListeners for the buttons to redirect to that Intent
        button2 = findViewById(R.id.identifyDog); //assigning the buttonID to the button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIdentifyBreedWindow();
            }
        });

        //Setting up the OnClickListeners for the buttons to redirect to that Intent
        button3 = findViewById(R.id.searchDogBreed); //assigning the buttonID to the button
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchDogBreedWindow();
            }
        });
    }

    //Opens up the Identify Breed Window
    public void openIdentifyDogWindow() {
        Intent intent = new Intent(MainActivity.this, IdentifyDog.class);
        startActivity(intent);
        //Assigning the XML File to the Relevant Class associated with it
        //setContentView(R.layout.identify_dog_menu);
    }

    //Opens up the Identify Dog Window
    public void openIdentifyBreedWindow() {
        Intent intent = new Intent(MainActivity.this, IdentifyBreed.class);
        startActivity(intent);
        //Assigning the XML File to the Relevant Class associated with it
        //setContentView(R.layout.identify_breed_menu);
    }

    //Opens up the Search Dog Breed Window
    public void openSearchDogBreedWindow() {
        Intent intent = new Intent(MainActivity.this, SearchDogBreed.class);
        startActivity(intent);
        //Assigning the XML File to the Relevant Class associated with it
        //setContentView(R.layout.search_dog_breed_menu);
    }

//    public void switchButtonTimer() {
//        gameMode = (Switch) findViewById(R.id.switch_game_mode);
//        final Timer timer = new Timer();
//        gameMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    //Setting up the OnClickListeners for the buttons to redirect to that Intent
//                    button1 = findViewById(R.id.identifyBreed); //assigning the buttonID to the button
//                    button1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            //Set the schedule function
//                            timer.scheduleAtFixedRate(new TimerTask() {
//                                @Override
//                                public void run() {
//                                    openIdentifyDogWindow();
//                                    if(timer.){}
//                                }
//                            }, 1000, 11000);
//                        }
//                    });
//                    //Setting up the OnClickListeners for the buttons to redirect to that Intent
//                    button2 = findViewById(R.id.identifyDog); //assigning the buttonID to the button
//                    button2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            //Set the schedule function
//                            timer.scheduleAtFixedRate(new TimerTask() {
//                                @Override
//                                public void run() {
//                                    openIdentifyBreedWindow();
//                                }
//                            }, 1000, 11000);
//                        }
//                    });
//                }
//            }
//        });
//    }
}
