package com.example.new_pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1= (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, pdf1.class);
                i.putExtra("name", "algorithm book.pdf");
                startActivity(i);
            }
        });

        bt2= (Button)findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                Intent i=new Intent(MainActivity.this, pdf1.class);
                i.putExtra("name", "Algorithm.pdf");
                startActivity(i);
            }
        });
    }
}