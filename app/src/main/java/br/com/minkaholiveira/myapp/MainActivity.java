package br.com.minkaholiveira.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] alunos = {"Minkah Oliveira", "Matheus Henrique", "Rafael Xavier", "Johnny Santos",
                "Matheus Siquera","Luiz Eduardo","Antony Rafael", "Victor Alves","Rodrigo Arico",
                "Rodrigo Bertagnoli","Denise Lourenço","Jessica Teixeira","Marina Assef",
                "Lucas Dias","Ewerton Zago","Gabriel Daud", "Sergio Pereira", "Victor Medeiros"};

        ListView listaAlunos = (ListView) findViewById(R.id.listaAlunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        Button adicionaAluno = (Button) findViewById(R.id.lista_button_novo_aluno);
        adicionaAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentFormulario = new Intent(MainActivity.this, FormActivity.class);
                startActivity(IntentFormulario);
            }
        });


    }
}
