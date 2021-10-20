package com.example.ejemplo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class LocalidadesActivity extends AppCompatActivity {
    private RecyclerView rv_localidades;
    private RecyclerViewAdapter localidadAdapter;
    private ArrayList<String> localidadArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localidades);
        rv_localidades = (RecyclerView) findViewById(R.id.rv_localidades);
        localidadArrayList = new ArrayList<>();
        localidadAdapter = new RecyclerViewAdapter(this, localidadArrayList);
        rv_localidades.setLayoutManager(new GridLayoutManager(this, 1));
        localidadAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre;
                nombre = localidadArrayList.get(rv_localidades.getChildAdapterPosition(v));
            }
        });
        rv_localidades.setAdapter(localidadAdapter);
        mostrarClientes();
    }
    public void mostrarClientes(){
        localidadAdapter.agregarLocalidad("PURMAMARCA");
        localidadAdapter.agregarLocalidad("TILCARA");
        localidadAdapter.agregarLocalidad("HUMAHUACA");
        localidadAdapter.agregarLocalidad("UQUIA");
        localidadAdapter.agregarLocalidad("MAIMARA");
        localidadAdapter.agregarLocalidad("VOLCAN");
        localidadAdapter.agregarLocalidad("TUMBAYA");
    }
}
