package com.example.salazar_geradordenpc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class favoritos extends AppCompatActivity {

        BancoFIcha db = new BancoFIcha(this);
        ListView lista;
        ArrayList<String> lista_ArrayX;
        ArrayAdapter<String> arrayAdapterLista;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_favoritos);
            lista = findViewById(R.id.listaFicha);
            lista_ArrayX = listarFichas();
            arrayAdapterLista   = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, lista_ArrayX);
            lista.setAdapter(arrayAdapterLista);


            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String conteudo = (String) lista.getItemAtPosition(position);
                    String codigo = conteudo.substring(0, conteudo.indexOf(" - "));

                    modeloFicha modeloFicha = db.selecionarFicha(Integer.parseInt(codigo));


                    Intent intent = new Intent(favoritos.this, npc_favorito.class);
                    intent.putExtra("codigo",codigo);
                    intent.putExtra("nome",modeloFicha.getNome());
                    intent.putExtra("raça",modeloFicha.getRaça());
                    intent.putExtra("genero",modeloFicha.getGenero());
                    intent.putExtra("aparencia",modeloFicha.getAperencia());
                    intent.putExtra("habilidade",modeloFicha.getHabilidade());
                    intent.putExtra("dom",modeloFicha.getDom());
                    intent.putExtra("traço",modeloFicha.getTraço());
                    intent.putExtra("maneiro",modeloFicha.getManeiro());
                    intent.putExtra("ideal",modeloFicha.getIdeal());
                    intent.putExtra("vinculo",modeloFicha.getVinculo());
                    intent.putExtra("segredo",modeloFicha.getSegredo());

                    startActivity(intent);



                }

            });

        }

    public void gerarFicha(View view) {

    }


        public  ArrayList<String>listarFichas()
        {

            List<modeloFicha> modeloFichaList = db.listaFichas();
            ArrayList<String> dados = new ArrayList<>();

            for (modeloFicha c : modeloFichaList)
            {

                dados.add(c.getCodigo() + " - " + c.getNome() + " / " + c.getRaça() + " / " + c.getGenero() );


            }
            return dados;
        }



    }







