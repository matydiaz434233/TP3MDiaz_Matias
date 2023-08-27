package com.matisoft.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble> lista = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();

    }
    private void generarListView(){
        ArrayAdapter<Inmueble> adapter = new listaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView listaItem = findViewById(R.id.milista);
        listaItem.setAdapter(adapter);



    }
    private  void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"Villa Mercedes",50000 ));
        lista.add(new Inmueble(R.drawable.casa2,"Merlo",30000 ));
        lista.add(new Inmueble(R.drawable.casa3,"San Luis",25000 ));

    }
}