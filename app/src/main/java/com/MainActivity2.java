package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.example.class_236_shared_preference.R;

public class MainActivity2 extends AppCompatActivity {

    TextView textview;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview = findViewById(R.id.textview);
        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);

        String myString = sharedPreferences.getString("name", "");
        int myAge = sharedPreferences.getInt("Age", 0);
        textview.setText(myString);
        textview.append("\nMy age is: "+myAge);


    }
}