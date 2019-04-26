package com.example.joaopbsousa.cursosenac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSAGEMTITULO";
    public String tituloDaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tecnologia(View view){
        tituloDaActivity = "Tecnologia";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void administracao(View view){
        tituloDaActivity = "Administração";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void design(View view){
        tituloDaActivity = "Design";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void comunicacao(View view){
        tituloDaActivity = "Comunicação";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void moda(View view){
        tituloDaActivity = "Moda";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void gastronomia(View view){
        tituloDaActivity = "Gastronomia";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
}
