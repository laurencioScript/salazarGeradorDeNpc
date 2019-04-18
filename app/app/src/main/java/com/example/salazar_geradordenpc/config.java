package com.example.salazar_geradordenpc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class config extends AppCompatActivity {

    Spinner Genero,Fichas,Raca;
    modeloArray modArray = new modeloArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        Genero = findViewById(R.id.spinnerGenero);
        ArrayAdapter adapterGenero = ArrayAdapter.createFromResource(this, R.array.opçãoGenero, android.R.layout.simple_spinner_item);
        Genero.setAdapter(adapterGenero);

        Fichas =  findViewById(R.id.spinnerFichas);
        ArrayAdapter adapterFichas = ArrayAdapter.createFromResource(this, R.array.opçãoFicha, android.R.layout.simple_spinner_item);
        Fichas.setAdapter(adapterFichas);

        Raca =  findViewById(R.id.spinnerRacas);
        ArrayAdapter adapterRacas = ArrayAdapter.createFromResource(this, R.array.opçãoRaça, android.R.layout.simple_spinner_item);
        Raca.setAdapter(adapterRacas);

    }

        public void gerarFiltro(View view) {
            Intent intent = new Intent(this, GerarActivity.class);
            String genero = Genero.getSelectedItem().toString();
            String ficha = Fichas.getSelectedItem().toString();
            String raca = Raca.getSelectedItem().toString();
            intent.putExtra("genero",Genero.getSelectedItem().toString());
            intent.putExtra("ficha",Fichas.getSelectedItem().toString());
            intent.putExtra("raca",Raca.getSelectedItem().toString());
            startActivity(intent);
        }

}
