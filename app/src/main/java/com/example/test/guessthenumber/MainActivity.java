package com.example.test.guessthenumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randNum;

    public void generateRandNum(){
        Random rand = new Random();
        randNum = rand.nextInt(10)+1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandNum();
    }

    protected void checkTheNumber(View view){

        EditText guessNum = (EditText) findViewById(R.id.editText);

        int userInput = Integer.parseInt(guessNum.getText().toString());

        if(userInput > randNum){
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        } else if(userInput < randNum) {
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Great Job!. Try Again", Toast.LENGTH_SHORT).show();
            generateRandNum();
        }
    }

}
