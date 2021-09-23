package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionx(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        int result = number1*number2;
        goToActivity2(result);
    }

    public void clickFunctionSum(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        int result = number1+number2;
        goToActivity2(result);
    }

    public void clickFunctionMinus(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        int result = number1-number2;
        goToActivity2(result);
    }

    public void clickFunctionDivide(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        int result = number1/number2;
        System.out.println(result); // this works
        goToActivity2(result);
    }


    public void goToActivity2(int result){
       String s = String.valueOf(result);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}