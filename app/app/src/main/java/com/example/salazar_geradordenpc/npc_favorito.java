package com.example.salazar_geradordenpc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class npc_favorito extends AppCompatActivity {
    ListView listDetalhes;
    BancoFIcha  atributos = new BancoFIcha(this);
    ArrayList<String> arrayDetalhe ;
    modeloFicha modelo = new modeloFicha();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npc_favorito);
        listDetalhes = findViewById(R.id.listDetalhes);

        preenchaDetalhes();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,arrayDetalhe);
        listDetalhes.setAdapter(arrayAdapter);

    }
    public void apagarNPC(View view){


        atributos.apagaFicha(modelo);
        Toast.makeText(npc_favorito.this,"NPC Apagado com sucesso",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(npc_favorito.this, MainActivity.class);
        startActivity(intent);
    }

   public void preenchaDetalhes()
   {
       Intent it = getIntent();
       String NomeCompleto = it.getStringExtra("nome");
       String Raca = it.getStringExtra("raça");
       String Genero = it.getStringExtra("genero");
       String Aparencia = it.getStringExtra("aparencia");
       String Habilidade = it.getStringExtra("habilidade");
       String Dom = it.getStringExtra("dom");
       String Traco = it.getStringExtra("traço");
       String Maneirismo = it.getStringExtra("maneiro");
       String Ideal = it.getStringExtra("ideal");
       String Vinculo = it.getStringExtra("vinculo");
       String Segredo = it.getStringExtra("segredo");


       String codigo = it.getStringExtra("codigo");
       modelo.setCodigo(Integer .parseInt(codigo));

       ArrayList<String> dados = new ArrayList<>();
       dados.add("Nome: " + NomeCompleto);
       dados.add("Raça: " + Raca);
       dados.add("Genero: " + Genero);
       dados.add("Aparencia: " + Aparencia);
       dados.add("Habilidade: " + Habilidade);
       dados.add("Dom: " + Dom);
       dados.add("Traço de Interaçao: " + Traco);
       dados.add("Maneirismo: " + Maneirismo);
       dados.add("Ideal: " + Ideal);
       dados.add("Vinculo: " + Vinculo);
       dados.add("Segredo ou Defeito: " + Segredo);

       arrayDetalhe = dados;

   }
}
