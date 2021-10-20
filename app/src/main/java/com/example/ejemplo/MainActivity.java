package com.example.ejemplo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView rvInf;
private AdaptadorInf adaptadorInf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        rvInf = (RecyclerView) findViewById(R.id.recycler_inf);
        rvInf.setLayoutManager( new LinearLayoutManager(this));

        adaptadorInf = new AdaptadorInf(getInf());
        rvInf.setAdapter(adaptadorInf);
    }
    public List<InformacionActivity> getInf(){
        List <InformacionActivity> inf = new ArrayList<>();
        inf.add(new InformacionActivity("INFORMACION","Descripcion",R.drawable.fondo_lisandro));
        inf.add(new InformacionActivity("INFORMACION","Descripcion",R.drawable.fondo2));
        inf.add(new InformacionActivity("INFORMACION","Descripcion",R.drawable.fondo_lisandro));
        inf.add(new InformacionActivity("INFORMACION","Descripcion",R.drawable.fondo2));
   return inf;
    }
}