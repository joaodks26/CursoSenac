package com.example.joaopbsousa.cursosenac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.joaopbsousa.cursosenac.modelo.Curso;

import java.util.ArrayList;

public class SegundaActivity extends AppCompatActivity {

    public ArrayList<Curso> cursos = new ArrayList<>();
    public LinearLayout layoutLinear ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);
        TextView textViewTitulo = findViewById(R.id.tvGrade);
        textViewTitulo.setText(titulo);

        if (titulo.equals("Tecnologia")){
        cursos.add(new Curso("Computação grafica", 1500.0,"Tecnologia", "A computação gráfica é a área da computação destinada à geração de imagens em geral"));
        cursos.add(new Curso("Densenvolvimento de sistemas", 1699.0, "Tecnologia", "O tecnólogo com esta formação desenvolve, analisa, projeta, implementa e atualiza sistemas de informação."));
        cursos.add(new Curso("Gestão em TI", 5000.0, "Tecnologia","Gestão de TI significa gerir todas atividades e soluções providas por recursos computacionais que têm como objetivo possibilitar a obtenção, o armazenamento, o acesso de informações para você usar no dia a dia da sua empresa."));
    }

        else if (titulo.equals("Moda")){
            cursos.add(new Curso("Criação de produtos", 999.0, "Moda", "Cria e Desenvolve produtos"));
            cursos.add(new Curso("Modelagem",898.90, "Moda", "Modela algo"));
            cursos.add(new Curso("Negocios da moda", 678.80, "Moda", "negocios da moda"));
        }

        else if (titulo.equals("Gastronomia")){
            cursos.add(new Curso("Confeitaria",2499.0, "Gastronomia", "Confeitar bolos e doces"));
            cursos.add(new Curso("Panificação", 2989.0, "Gastronomia", "Sei la o que faz"));
            cursos.add(new Curso("Cozinha", 5000.0, "Gastronomia", "Acho que cuida da cozinha"));
        }

        else if (titulo.equals("Design")){
            cursos.add(new Curso("Design digital", 3099.0, "Design", "nao sei o que faz tambem"));
            cursos.add(new Curso("Design Grafico", 599.90, "Design", "esse muito menos"));
            cursos.add(new Curso("Design de produtos", 299.00, "Design", "Faz alguma coisa ai"));
        }

        else if (titulo.equals("Comunicação")){
            cursos.add(new Curso("Arte e cultura", 100.00, "Comunicação","fazer desenho"));
            cursos.add(new Curso("Audiovisual", 599.00, "Comunicação", "Tem a ver com radio"));
            cursos.add(new Curso("Fotografia", 1000.00, "Comunicação","tira foto"));
        }

        else if (titulo.equals("Administração")){
            cursos.add(new Curso("Logística", 799.00, "Administração", "nao faço ideia"));
            cursos.add(new Curso("Contabilidade", 5000.00, "Administração","Nao faço ideia tambem"));
            cursos.add(new Curso("Vendas", 989.00, "Administração", "Nao faço ideia tambem"));
        }
        listaCurso(cursos);

    }

    public void listaCurso(ArrayList<Curso> lista) {

        layoutLinear = findViewById(R.id.lVertical);
        for (int i = 0; i < lista.size(); i++) {
            TextView textViewItem1 = new TextView(this);
            TextView textViewDesc1 = new TextView(this);
            TextView textViewPreco1 = new TextView(this);

            textViewItem1.setText(lista.get(i).getNome());
            textViewItem1.setTextSize(18);
            textViewDesc1.setText(lista.get(i).getDescricao());
            textViewPreco1.setText("R$" + lista.get(i).getPreco().toString());

            layoutLinear.addView(textViewItem1);
            layoutLinear.addView(textViewDesc1);
            layoutLinear.addView(textViewPreco1);
        }
    }
}






