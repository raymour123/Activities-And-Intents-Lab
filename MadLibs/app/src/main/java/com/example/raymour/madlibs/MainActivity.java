package com.example.raymour.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button mButtonSubmit;
    EditText mAdjectiveOne;
    EditText mAdjectiveTwo;
    EditText mNounOne;
    EditText mNounTwo;
    EditText mAnimal;
    EditText mGame;


    List<EditText> words = new ArrayList<EditText>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdjectiveOne = (EditText) findViewById(R.id.text_adjective_one);
        mAdjectiveTwo = (EditText) findViewById(R.id.text_adjective_two);
        mNounOne = (EditText) findViewById(R.id.text_noun_one);
        mNounTwo = (EditText) findViewById(R.id.text_noun_two);
        mAnimal = (EditText) findViewById(R.id.animal);
        mGame = (EditText) findViewById(R.id.game);

        words.add(mAdjectiveOne);
        words.add(mAdjectiveTwo);
        words.add(mNounOne);
        words.add(mNounTwo);
        words.add(mAnimal);
        words.add(mGame);

        mButtonSubmit = (Button) findViewById(R.id.submit_button);
        View.OnClickListener buttonOnClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MadLibFinal.class);
                int i =0;
                for (EditText editText : words) {
                    if (editText.getText().toString().length() == 0) {
                        editText.setError("Must Enter Text!");
                        i = i+1;
                    }
                }
                if (i ==0) {
                    intent.putExtra("FirstAdjective", mAdjectiveOne.getText().toString());
                    intent.putExtra("SecondAdjective", mAdjectiveTwo.getText().toString());
                    intent.putExtra("FirstNoun", mNounOne.getText().toString());
                    intent.putExtra("SecondNoun", mNounTwo.getText().toString());
                    intent.putExtra("Animal", mAnimal.getText().toString());
                    intent.putExtra("Game", mGame.getText().toString());
                    startActivity(intent);
                }





            }

        };
        mButtonSubmit.setOnClickListener(buttonOnClickListener);
    }
}


