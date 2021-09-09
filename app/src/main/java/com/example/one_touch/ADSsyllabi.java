package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ADSsyllabi extends AppCompatActivity {
    PDFView printedPdfDocument2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adssyllabi);


        getSupportActionBar().setTitle("Syllabi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        printedPdfDocument2=(PDFView) findViewById(R.id.ADSsyllabi);

        printedPdfDocument2.fromAsset("ADS.pdf").load();
    }
}
