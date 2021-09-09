package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.print.pdf.PrintedPdfDocument;

import com.github.barteksc.pdfviewer.PDFView;

public class MPLsyllabi extends AppCompatActivity {
    PDFView printedPdfDocument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mplsyllabi);
        getSupportActionBar().setTitle("Syllabi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        printedPdfDocument=(PDFView) findViewById(R.id.MPLsyllabi);

        printedPdfDocument.fromAsset("mpl.pdf").load();
    }
}
