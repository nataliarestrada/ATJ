package com.example.ejemplo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.localidadView> implements View.OnClickListener{
    private List<String> localidades = new ArrayList<>();
    private Context context;
    private View.OnClickListener listener;

    public RecyclerViewAdapter(Context context, List<String> localidades) {
        this.localidades = localidades;
        this.context = context;
    }

    @Override
    public void onClick(View v) {

    }

    @NonNull
    @Override
    public RecyclerViewAdapter.localidadView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_localidad,parent,false);
        view.setOnClickListener(this);
        return new localidadView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.localidadView holder, int position) {
        String localidad = localidades.get(position);
        if (localidad == "TILCARA") {
            holder.relative.setBackgroundResource(R.drawable.fondo1);
        }
        if (localidad == "HUMAHUACA") {
            holder.relative.setBackgroundResource(R.drawable.fondo_lisandro);
        }
        if (localidad == "UQUIA") {
            holder.relative.setBackgroundResource(R.drawable.fondo2);
        }
        if (localidad == "MAIMARA") {
            holder.relative.setBackgroundResource(R.drawable.fondo_liso);
        }
        if (localidad == "VOLCAN") {
            holder.relative.setBackgroundResource(R.drawable.fondo_verde);
        }
        if (localidad == "TUMBAYA") {
            holder.relative.setBackgroundResource(R.drawable.fondo_villarrubia);
        }
        holder.nombre.setText(localidad);
    }

    @Override
    public int getItemCount() {
        return localidades.size();
    }
    public void agregarLocalidad(String localidad){
        localidades.add(localidad);
        this.notifyDataSetChanged();

    }
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;

    }
    public class localidadView extends RecyclerView.ViewHolder{
        private TextView nombre;
        private LinearLayout relative;
        public localidadView(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tv_localidad);
            relative = (LinearLayout) itemView.findViewById(R.id.relative);
        }
    }
}
