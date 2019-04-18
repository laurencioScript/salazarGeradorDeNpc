package com.example.salazar_geradordenpc;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
        public void gerarFicha(View view) {
        Intent intent = new Intent(this, GerarActivity.class);
        startActivity(intent);
            }

        public void configFicha(View view) {
        Intent intent = new Intent(this, config.class);
        startActivity(intent);
            }
        public void manualFicha(View view) {
        Intent intent = new Intent(this, manual.class);
        startActivity(intent);}

        public void favoritosFicha(View view) {
        Intent intent = new Intent(this, favoritos.class);
        startActivity(intent);
    }

}
