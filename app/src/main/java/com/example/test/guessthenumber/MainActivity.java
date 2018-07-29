package com.example.test.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void checkTheNumber(View view){


        EditText userInput = (EditText) findViewById(R.id.editText);
        Random rand = new Random();
        int randNum = rand.nextInt(10)+1;
        int input = Integer.parseInt(userInput.getText().toString());

        if (userInput.getText().toString().isEmpty()){
            return;
        } else {
            if(randNum > input){
                Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
            } else if(randNum < input) {
                Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Great Job!", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
