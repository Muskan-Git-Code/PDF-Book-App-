package com.example.new_pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf1 extends AppCompatActivity {
    PDFView pd1;
    String n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf1);

        Intent i=getIntent();
        n=i.getStringExtra("name");
        pd1= (PDFView)findViewById(R.id.pdfView1);
        pd1.fromAsset(n).load();
    }
}