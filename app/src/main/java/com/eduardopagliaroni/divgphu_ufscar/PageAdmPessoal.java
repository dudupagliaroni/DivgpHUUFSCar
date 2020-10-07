package com.eduardopagliaroni.divgphu_ufscar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageAdmPessoal extends AppCompatActivity {

    public static int btnId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_adm_pessoal);

        Button btnPDF1;
        Button btnPDF2;
        Button btnPDF3;
        Button btnPDF4;
        Button btnPDF5;


        btnPDF1 = findViewById(R.id.btnPDF1adm_pes);
        btnPDF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFAdmPessoal.class);
                startActivity(i);
            }

        });

        btnPDF2 = findViewById(R.id.btnPDF2adm_pes);
        btnPDF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFAdmPessoal.class);
                startActivity(i);
            }
        });

        btnPDF3 = findViewById(R.id.btnPDF3adm_pes);
        btnPDF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFAdmPessoal.class);
                startActivity(i);
            }
        });

        btnPDF4 = findViewById(R.id.btnPDF4adm_pes);
        btnPDF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFAdmPessoal.class);
                startActivity(i);
            }
        });

        btnPDF5 = findViewById(R.id.btnPDF5adm_pes);
        btnPDF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnId = v.getId();
                Intent i = new Intent(getApplicationContext(), PagePDFAdmPessoal.class);
                startActivity(i);
            }

        });
    }
}