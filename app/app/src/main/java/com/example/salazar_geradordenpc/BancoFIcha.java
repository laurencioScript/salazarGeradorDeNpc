package com.example.salazar_geradordenpc;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class BancoFIcha extends SQLiteOpenHelper
{
    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_FICHA = "bd_ficha";

    private static final String TABELA_FICHA = "tb_ficha";

    private static final String COLUNA_CODIGO = "codigo";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_RACA = "raca";
    private static final String COLUNA_GENERO = "genero";
    private static final String COLUNA_APARENCIA = "aparencia";
    private static final String COLUNA_HABILIDADE = "habilidade";
    private static final String COLUNA_DOM = "dom";
    private static final String COLUNA_TRACO = "traco";
    private static final String COLUNA_MANEIRO = "maneiro";
    private static final String COLUNA_IDEAL = "ideal";
    private static final String COLUNA_VINCULO = "vinculo";
    private static final String COLUNA_SEGREDO = "segredo";


    public BancoFIcha(Context context) {
        super(context, BANCO_FICHA, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QUERY_COLUNA = " CREATE TABLE " + TABELA_FICHA + " ( " + COLUNA_CODIGO + " INTEGER PRIMARY KEY, " +
                COLUNA_NOME + " TEXT, " + COLUNA_RACA + " TEXT, " + COLUNA_GENERO + " TEXT, " + COLUNA_APARENCIA + " TEXT, " + COLUNA_HABILIDADE
                + " TEXT, " + COLUNA_DOM + " TEXT, " + COLUNA_TRACO + " TEXT, " + COLUNA_MANEIRO + " TEXT, " + COLUNA_IDEAL + " TEXT, " + COLUNA_VINCULO
                + " TEXT, " + COLUNA_SEGREDO + " TEXT ) ";

        db.execSQL(QUERY_COLUNA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    void addFicha(modeloFicha modeloFicha)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_NOME, modeloFicha.getNome());
        values.put(COLUNA_RACA, modeloFicha.getRaça());
        values.put(COLUNA_GENERO, modeloFicha.getGenero());
        values.put(COLUNA_APARENCIA, modeloFicha.getAperencia());
        values.put(COLUNA_HABILIDADE, modeloFicha.getHabilidade());
        values.put(COLUNA_DOM, modeloFicha.getDom());
        values.put(COLUNA_TRACO, modeloFicha.getTraço());
        values.put(COLUNA_MANEIRO, modeloFicha.getManeiro());
        values.put(COLUNA_IDEAL, modeloFicha.getIdeal());
        values.put(COLUNA_VINCULO, modeloFicha.getVinculo());
        values.put(COLUNA_SEGREDO, modeloFicha.getSegredo());

        db.insert(TABELA_FICHA,null,values);

        db.close();
    }

    void apagaFicha(modeloFicha modeloFicha)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABELA_FICHA,COLUNA_CODIGO + " = ? ", new String[] {String.valueOf(modeloFicha.getCodigo())});

        db.close();

    }

    modeloFicha selecionarFicha (int codigo)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABELA_FICHA, new String[] {COLUNA_CODIGO,COLUNA_NOME,COLUNA_RACA,COLUNA_GENERO,COLUNA_APARENCIA,COLUNA_HABILIDADE,COLUNA_DOM,COLUNA_TRACO,COLUNA_MANEIRO,COLUNA_IDEAL,COLUNA_VINCULO,COLUNA_SEGREDO},COLUNA_CODIGO + " = ? " ,
                new String[]{String.valueOf(codigo)},null,null,null,null);

        if(cursor!=null)
        {
             cursor.moveToFirst();
        }


        modeloFicha modeloFicha = new modeloFicha(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7)
                ,cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11));

        return modeloFicha;

    }

    public List<modeloFicha> listaFichas(){

        List<modeloFicha> Listafichas = new ArrayList<modeloFicha>();

        String query = " SELECT * FROM " + TABELA_FICHA;

        SQLiteDatabase db =  this.getWritableDatabase();
        @SuppressLint("Recycle") Cursor c = db.rawQuery(query,null);

        if (c.moveToFirst())
        {
            do {
                modeloFicha modeloFicha = new modeloFicha();
                modeloFicha.setCodigo(Integer .parseInt(c.getString(0)));
                modeloFicha.setNome(c.getString(1));
                modeloFicha.setRaça(c.getString(2));
                modeloFicha.setGenero(c.getString(3));
                modeloFicha.setAperencia(c.getString(4));
                modeloFicha.setHabilidade(c.getString(5));
                modeloFicha.setDom(c.getString(6));
                modeloFicha.setTraço(c.getString(7));
                modeloFicha.setManeiro(c.getString(8));
                modeloFicha.setIdeal(c.getString(9));
                modeloFicha.setVinculo(c.getString(10));
                modeloFicha.setSegredo(c.getString(11));

                Listafichas.add(modeloFicha);
            }while (c.moveToNext());
        }
            return Listafichas;
    }
}
