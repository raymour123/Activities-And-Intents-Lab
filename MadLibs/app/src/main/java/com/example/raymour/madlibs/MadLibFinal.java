package com.example.raymour.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibFinal extends AppCompatActivity {
    TextView mInsertedAdjectiveOne;
    TextView mInsertedAdjectiveTwo;
    TextView mInsertedNounOne;
    TextView mInsertedNounTwo;
    TextView mInsertedAnimal;
    TextView mInsertedGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib_final);

        Intent intent = getIntent();
        String firstAdjective = intent.getStringExtra("FirstAdjective");

        mInsertedAdjectiveOne = (TextView) findViewById(R.id.inserted_adjective_one);
        mInsertedAdjectiveOne.setText("A great party begins when you serve some " + firstAdjective);
        String secondAdjective = intent.getStringExtra("SecondAdjective");

        mInsertedAdjectiveTwo = (TextView) findViewById(R.id.inserted_adjective_two);
        mInsertedAdjectiveTwo.setText(" food and drink and invite your " + secondAdjective + " friends. ");

        String firstNoun = intent.getStringExtra("FirstNoun");

        mInsertedNounOne = (TextView) findViewById(R.id.inserted_noun_one);
        mInsertedNounOne.setText("Usually, you stay up late drinking and pass out on the closest " + firstNoun);

        String secondNoun = intent.getStringExtra("SecondNoun");

        mInsertedNounTwo = (TextView) findViewById(R.id.inserted_noun_two);
        mInsertedNounTwo.setText(" or go outside and find a " + secondNoun + ". ");

        String animal = intent.getStringExtra("Animal");

        mInsertedAnimal = (TextView) findViewById(R.id.animal);
        mInsertedAnimal.setText("The best thing to do when you wake up is to go hang out with some " + animal);

        String game = intent.getStringExtra("Game");

        mInsertedGame = (TextView) findViewById(R.id.game);
        mInsertedGame.setText(" or play " + game + " .");


    }
}
