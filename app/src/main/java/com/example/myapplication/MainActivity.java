package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void ConvertValue(View view){
         double valueDolar = 5.11 ;
         EditText inputNumber = findViewById(R.id.editTextNumber);
         double inputValue = Double.valueOf(String.valueOf(inputNumber.getText()));
         TextView result = findViewById(R.id.result);
         result.setText("R$ "+String.valueOf(inputValue * valueDolar));

    }
}