package com.eduardopagliaroni.divgphu_ufscar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PagePDFSauSegOcupacional extends AppCompatActivity {

    PDFView pdf1sau_seg_oc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_pdf_sau_seg_ocupacional);

        if (PageSauSegOcupacional.btnId == R.id.btnPDF1sau_seg_oc) {
            pdf1sau_seg_oc = (PDFView) findViewById(R.id.pdf1sau_seg_oc);
            pdf1sau_seg_oc.fromAsset("PCMSO 2019-2020.pdf").load();
        }

        if (PageSauSegOcupacional.btnId == R.id.btnPDF2sau_seg_oc) {
            pdf1sau_seg_oc = (PDFView) findViewById(R.id.pdf1sau_seg_oc);
            pdf1sau_seg_oc.fromAsset("PPRA 2019-2020.pdf").load();
        }

        if (PageSauSegOcupacional.btnId == R.id.btnPDF3sau_seg_oc) {
            pdf1sau_seg_oc = (PDFView) findViewById(R.id.pdf1sau_seg_oc);
            pdf1sau_seg_oc.fromAsset("POP Receber atestados médicos.pdf").load();
        }
    }
}