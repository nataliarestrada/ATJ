package com.example.ejemplo;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorInf extends RecyclerView.Adapter<AdaptadorInf.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView text1,text2;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1=(TextView)itemView.findViewById(R.id.tvInf1);
            text2=(TextView)itemView.findViewById(R.id.tvInf2);
            image=(ImageView)itemView.findViewById(R.id.image_inf);


        }
    }
    public List<InformacionActivity> listaInf;

    public AdaptadorInf(List<InformacionActivity> listaInf) {

        this.listaInf = listaInf;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inf,parent,false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text1.setText(listaInf.get(position).getText1());
        holder.text2.setText(listaInf.get(position).getText2());
        holder.image.setImageResource(listaInf.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return listaInf.size();
    }
}

