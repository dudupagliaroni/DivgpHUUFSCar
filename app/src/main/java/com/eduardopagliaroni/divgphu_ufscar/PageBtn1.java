package com.eduardopagliaroni.divgphu_ufscar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PageBtn1 extends AppCompatActivity {

    PDFView pdf1adm_pes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_btn1);

        if (PageAdmPessoal.btnId == R.id.btnPDF1adm_pes) {
            pdf1adm_pes = (PDFView) findViewById(R.id.pdf1adm_pes);
            pdf1adm_pes.fromAsset("POP 1114-01 Gerir ponto eletrônico.pdf").load();
        }

        if (PageAdmPessoal.btnId == R.id.btnPDF2adm_pes) {
            pdf1adm_pes = (PDFView) findViewById(R.id.pdf1adm_pes);
            pdf1adm_pes.fromAsset("POP 1118-01 Programar ou alterar férias.pdf").load();
        }

        if (PageAdmPessoal.btnId == R.id.btnPDF3adm_pes) {
            pdf1adm_pes = (PDFView) findViewById(R.id.pdf1adm_pes);
            pdf1adm_pes.fromAsset("POP PA1102-01 Convocar, contratar e admitir pessoal.pdf").load();
        }

        if (PageAdmPessoal.btnId == R.id.btnPDF4adm_pes) {
            pdf1adm_pes = (PDFView) findViewById(R.id.pdf1adm_pes);
            pdf1adm_pes.fromAsset("POP PA1106-01 Desligar pessoal.pdf").load();
        }

        if (PageAdmPessoal.btnId == R.id.btnPDF5adm_pes) {
            pdf1adm_pes = (PDFView) findViewById(R.id.pdf1adm_pes);
            pdf1adm_pes.fromAsset("POP PA1112-01 Designar substituto de cargo ou função.pdf").load();
        }
    }
}