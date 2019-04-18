package com.example.salazar_geradordenpc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;


public class GerarActivity extends AppCompatActivity {
    bancoDados thanatos = new bancoDados();
    BancoFIcha  atributos = new BancoFIcha(this);
    modeloArray modArray = new modeloArray();
    ListView ficha ;
    ArrayList<String> dadosLimpos;
    ArrayList<String> Fichas ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar);

        ficha = findViewById(R.id.listFicha);
        prenchaCampos();

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,Fichas);
        ficha.setAdapter(arrayAdapter);

        for(int i = 0; i < dadosLimpos.size(); i++)
        {
           if (i==0) {
               modArray.setNome(dadosLimpos.get(i));
           }
            if (i==1) {
                modArray.setRaca(dadosLimpos.get(i));
            }
            if (i==2) {
                modArray.setGenero(dadosLimpos.get(i));
            }
            if (i==3) {
                modArray.setAparencia(dadosLimpos.get(i));
            }
            if (i==4) {
                modArray.setHabilidade(dadosLimpos.get(i));
            }
            if (i==5) {
                modArray.setDom(dadosLimpos.get(i));
            }
            if (i==6) {
                modArray.setTraco(dadosLimpos.get(i));
            }
            if (i==7) {
                modArray.setManeiro(dadosLimpos.get(i));
            }
            if (i==8) {
                modArray.setIdeal(dadosLimpos.get(i));
            }
            if (i==9) {
                modArray.setVinculo(dadosLimpos.get(i));
            }
            if (i==10) {
                modArray.setSegredo(dadosLimpos.get(i));
            }


        }




    }



    public void salvarFicha(View view){
        atributos.addFicha(new modeloFicha(modArray.getNome(),modArray.getRaca(),modArray.getGenero(),modArray.getAparencia(),modArray.getHabilidade(),
                modArray.getDom(),modArray.getTraco(),modArray.getManeiro(),modArray.getIdeal(),modArray.getVinculo(),modArray.getSegredo()));

        Toast.makeText(GerarActivity.this,"NPC Adicionada com sucesso",Toast.LENGTH_LONG).show();
    }
    public void gerarNovamente(View view){
        prenchaCampos();

    }


    public  void prenchaCampos(){



        String nome = ""; String sobrenome = "";
        Intent it = getIntent();
        String Genero = it.getStringExtra("genero");
        String Raca = it.getStringExtra("raca");


        if (Objects.equals(Genero, "Aleatorio") || Genero == null)
        {
             Genero = thanatos.pegaGenero(thanatos.getNumGenero());
        }
        if (Objects.equals(Raca, "Aleatorio") || Raca == null )
        {
            Raca = thanatos.pegaRaca(thanatos.getNumRaca());
        }


        if (Genero.equals("Masculino"))
        {

            if(Raca.equals("Anão da Colina") || Raca.equals("Anão da Montanha"))
            {
                nome = thanatos.pegaNomeAnaoH(thanatos.getNumNomeAnaoM());
                sobrenome = thanatos.pegaSobreNomeAnao(thanatos.getNumSobreNomeAnao());
            }
            if(Raca.equals("Alto Elfo") || Raca.equals("Elfo da Floresta") || Raca.equals("Elfo Negro"))
            {
                nome = thanatos.pegaNomeElfoH(thanatos.getNumNomeElfoM());
                sobrenome = thanatos.pegaSobreNomeElfo(thanatos.getNumSobreNomeElfo());
            }
            if(Raca.equals("Halfling Pés Leve") || Raca.equals("Halfling Robusto") )
            {
                nome = thanatos.pegaNomeHalfH(thanatos.getNumNomeHalfM());
                sobrenome = thanatos.pegaSobreNomeHalf(thanatos.getNumSobreNomeHalf());
            }
            if(Raca.equals("Humano"))
            {
                nome = thanatos.pegaNomeHumaH(thanatos.getNumNomeHumM());
                sobrenome = thanatos.pegaSobreNomeHuma(thanatos.getNumSobreNomeHum());
            }
            if(Raca.equals("Draconato"))
            {
                nome = thanatos.pegaNomeDracH(thanatos.getNumNomeDraM());
                sobrenome = thanatos.pegaSobreNomeDrac(thanatos.getNumSobreNomeDra());
            }
            if(Raca.equals("Gnomo da Floresta") || Raca.equals("Gnomo da Rocha"))
            {
                nome = thanatos.pegaNomeGnomH(thanatos.getNumNomeGnoM());
                sobrenome = thanatos.pegaSobreNomeGnom(thanatos.getNumSobreNomeGno());
            }
            if(Raca.equals("Meio Elfo"))
            {
                nome = thanatos.pegaNomeMeioEH(thanatos.getNumNomeMelfoM());
                sobrenome = thanatos.pegaSobreNomeMeioE(thanatos.getNumSobreNomeMelfo());
            }
            if(Raca.equals("Meio Orc"))
            {
                nome = thanatos.pegaNomeMeioOH(thanatos.getNumNomeMorcM());
            }
            if(Raca.equals("Tiefling"))
            {
                nome = thanatos.pegaNomeTiefH(thanatos.getNumNomeTiefM());
                sobrenome = thanatos.pegaSobreNomeTief(thanatos.getNumSobreNomeTief());
            }
        }
        else
        {

            if(Raca.equals("Anão da Colina") || Raca.equals("Anão da Montanha"))
            {
                nome = thanatos.pegaNomeAnaoF(thanatos.getNumNomeAnaoF());
                sobrenome = thanatos.pegaSobreNomeAnao(thanatos.getNumSobreNomeAnao());
            }
            if(Raca.equals("Alto Elfo") || Raca.equals("Elfo da Floresta") || Raca.equals("Elfo Negro"))
            {
                nome = thanatos.pegaNomeElfoF(thanatos.getNumNomeElfoF());
                sobrenome = thanatos.pegaSobreNomeElfo(thanatos.getNumSobreNomeElfo());
            }
            if(Raca.equals("Halfling Pés Leve") || Raca.equals("Halfling Robusto") )
            {
                nome = thanatos.pegaNomeHalfF(thanatos.getNumNomeHalfF());
                sobrenome = thanatos.pegaSobreNomeHalf(thanatos.getNumSobreNomeHalf());
            }
            if(Raca.equals("Humano"))
            {
                nome = thanatos.pegaNomeHumaF(thanatos.getNumNomeHumF());
                sobrenome = thanatos.pegaSobreNomeHuma(thanatos.getNumSobreNomeHum());
            }
            if(Raca.equals("Draconatos"))
            {
                nome = thanatos.pegaNomeDracF(thanatos.getNumNomeDraF());
                sobrenome = thanatos.pegaSobreNomeDrac(thanatos.getNumSobreNomeDra());
            }
            if(Raca.equals("Gnomo da Floresta") || Raca.equals("Gnomo da Rocha"))
            {
                nome = thanatos.pegaNomeGnomF(thanatos.getNumNomeGnoF());
                sobrenome = thanatos.pegaSobreNomeGnom(thanatos.getNumSobreNomeGno());
            }
            if(Raca.equals("Meio Elfo"))
            {
                nome = thanatos.pegaNomeMeioEF(thanatos.getNumNomeMelfoF());
                sobrenome = thanatos.pegaSobreNomeMeioE(thanatos.getNumSobreNomeMelfo());
            }
            if(Raca.equals("Meio Orc"))
            {
                nome = thanatos.pegaNomeMeioOF(thanatos.getNumNomeMorcF());
            }
            if(Raca.equals("Tiefling") )
            {
                nome = thanatos.pegaNomeTiefF(thanatos.getNumNomeTiefF());
                sobrenome = thanatos.pegaSobreNomeTief(thanatos.getNumSobreNomeTief());
            }

        }

        String NomeCompleto = nome + " " + sobrenome;
        String Aparencia = thanatos.pegaAparencia(thanatos.getNumAparencia());
        String Habilidade = thanatos.pegaCaract(thanatos.getNumCaract());
        String Dom = thanatos.pegaDom(thanatos.getNumDons());
        String Traco = thanatos.pegaTraco(thanatos.getNumTraco());
        String Maneirismo = thanatos.pegaManeiro(thanatos.getNumManeiro());
        String Ideal = thanatos.pegaIdeal(thanatos.getNumIdeal());
        String Vinculo = thanatos.pegaVinculo(thanatos.getNumVinculo());
        String Segredo = thanatos.pegaSegredo(thanatos.getNumSegredo());



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

        Fichas = dados;

        dadosLimpos  = new ArrayList<>();
        dadosLimpos.add(NomeCompleto);
        dadosLimpos.add(Raca);
        dadosLimpos.add(Genero);
        dadosLimpos.add(Aparencia);
        dadosLimpos.add(Habilidade);
        dadosLimpos.add(Dom);
        dadosLimpos.add(Traco);
        dadosLimpos.add(Maneirismo);
        dadosLimpos.add(Ideal);
        dadosLimpos.add(Vinculo);
        dadosLimpos.add(Segredo);


    }




}


