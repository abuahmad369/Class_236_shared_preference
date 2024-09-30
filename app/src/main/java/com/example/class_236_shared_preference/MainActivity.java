package com.example.class_236_shared_preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.MainActivity2;

public class MainActivity extends AppCompatActivity {

    EditText edName;
    Button btnSave, btnNext;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.edName);
        btnSave = findViewById(R.id.btnSave);
        btnNext = findViewById(R.id.btnNext);

        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edName.getText().toString();

                editor.putString("name", ""+name);
                editor.putInt("Age", 23);
                editor.apply();

            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, MainActivity2.class));

//                String name = sharedPreferences.getString("name", "Default");
//                btnNext.setText(name);
            }
        });
    }
}