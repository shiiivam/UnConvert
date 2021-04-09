 package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Thanks for using UnConvert", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205*kg;
//                textView.setText("The corresponding value in pound is "+pound);
//            }
//        });
    }
    public void calculate(View view){
        if(editText.getText().toString().length()>0){
            String s = editText.getText().toString();
            int kg = Integer.parseInt(s);
            double pound = 2.205*kg;
            Toast.makeText(MainActivity.this, "Thanks for using UnConvert", Toast.LENGTH_SHORT).show();
            textView.setText("The corresponding value in pound is "+pound);
        }else {
            Toast.makeText(MainActivity.this, "Please enter some value!", Toast.LENGTH_SHORT).show();
        }
    }
}