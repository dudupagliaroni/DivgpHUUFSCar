package com.eduardopagliaroni.divgphu_ufscar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PagePDFDevCapPessoas extends AppCompatActivity {

    PDFView pdf1dcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_dev_cap_pessoal);

        if (PageDevCapPessoas.btnId == R.id.btnPDF1dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("POP PA1110-02 Avaliar desempenho do empregado em período de experiência.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF2dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("POP PA1109-01 Contratar capacitação para colaboradores.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF3dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("Descrição das atribuições dos cargos do HU-UFSCar.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF4dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("POP PA1113-01 - Elaborar PDC.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF5dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("POP PA1105-01 Participar de evento externo.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF6dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("Programa de desenvolvimento dos empregados.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF7dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("POP PA1108-01 Prover capacitação interna.pdf").load();
        }

        if (PageDevCapPessoas.btnId == R.id.btnPDF8dcp) {
            pdf1dcp = (PDFView) findViewById(R.id.pdf1dcp);
            pdf1dcp.fromAsset("POP PA1107-01 Submeter e aprovar projetos de capacitação sem custos para o HU-UFSCar.pdf").load();
        }

    }
}