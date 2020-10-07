package com.eduardopagliaroni.divgphu_ufscar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageSauSegOcupacional extends AppCompatActivity {

    public static int btnId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_sau_seg_ocupacional);

        Button btnPDF1;
        Button btnPDF2;
        Button btnPDF3;

        btnPDF1 = findViewById(R.id.btnPDF1sau_seg_oc);
        btnPDF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFSauSegOcupacional.class);
                startActivity(i);
            }

        });

        btnPDF2 = findViewById(R.id.btnPDF2sau_seg_oc);
        btnPDF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFSauSegOcupacional.class);
                startActivity(i);
            }
        });

        btnPDF3 = findViewById(R.id.btnPDF3sau_seg_oc);
        btnPDF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFSauSegOcupacional.class);
                startActivity(i);
            }
        });


    }
}