package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Substract extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1,e2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_substract);
        b1=(AppCompatButton)findViewById(R.id.subi);
        b2=(AppCompatButton)findViewById(R.id.menu);
        e1=(EditText)findViewById(R.id.num1);
        e2=(EditText)findViewById(R.id.num2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String num1=e1.getText().toString();
                String num2=e2.getText().toString();
                int n1=Integer.parseInt(num1);
                int n2=Integer.parseInt(num2);
                int n3=n1-n2;
                Toast.makeText(getApplicationContext(),String.valueOf(n3),Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);

            }
        });




    }
}