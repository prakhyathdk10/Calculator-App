package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1;
    AppCompatButton b2;
    AppCompatButton b3;
    AppCompatButton b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(AppCompatButton)findViewById(R.id.add);
        b2=(AppCompatButton)findViewById(R.id.sub);
        b3=(AppCompatButton)findViewById(R.id.mul);
        b4=(AppCompatButton)findViewById(R.id.div);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ADDITION",Toast.LENGTH_LONG).show();
                Intent i=new Intent(getApplicationContext(),Addition.class);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SUBSTRACTION",Toast.LENGTH_LONG).show();
                Intent j=new Intent(getApplicationContext(),Substract.class);
                startActivity(j);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"MULTIPLICATION",Toast.LENGTH_LONG).show();
                Intent k=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(k);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"DIVISION",Toast.LENGTH_LONG).show();
                Intent g=new Intent(getApplicationContext(),Division.class);
                startActivity(g);
            }
        });




    }
}