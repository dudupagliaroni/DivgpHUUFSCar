package com.eduardopagliaroni.divgphu_ufscar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class PageDevCapPessoas extends AppCompatActivity {

    public static int btnId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_dev_cap_pessoas);

        Button btnPDF1;
        Button btnPDF2;
        Button btnPDF3;
        Button btnPDF4;
        Button btnPDF5;
        Button btnPDF6;
        Button btnPDF7;
        Button btnPDF8;


        btnPDF1 = findViewById(R.id.btnPDF1dcp);
        btnPDF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }

        });

        btnPDF2 = findViewById(R.id.btnPDF2dcp);
        btnPDF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }
        });

        btnPDF3 = findViewById(R.id.btnPDF3dcp);
        btnPDF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }
        });

        btnPDF4 = findViewById(R.id.btnPDF4dcp);
        btnPDF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }
        });

        btnPDF5 = findViewById(R.id.btnPDF5dcp);
        btnPDF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }

        });

        btnPDF6 = findViewById(R.id.btnPDF6dcp);
        btnPDF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }

        });

        btnPDF7 = findViewById(R.id.btnPDF7dcp);
        btnPDF7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }

        });

        btnPDF8 = findViewById(R.id.btnPDF8dcp);
        btnPDF8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFDevCapPessoas.class);
                startActivity(i);
            }

        });

    }
}