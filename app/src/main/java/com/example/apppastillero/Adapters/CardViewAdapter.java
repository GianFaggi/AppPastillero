package com.example.apppastillero.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.apppastillero.Clases.Dosis;
import com.example.apppastillero.R;

import java.util.List;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

    private List<Dosis> dosis;
    private LayoutInflater mInflater;
    private Context context;

    public CardViewAdapter(List<Dosis> itemList, Context context){

        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.dosis = itemList;
    }

    @Override
    public int getItemCount() {
        return dosis.size();
    }

    @Override
    public CardViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType ) {
        View view = mInflater.inflate(R.layout.adapter_cv_dosis, null);
        return new CardViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CardViewAdapter.ViewHolder holder, final int position) {
        holder.bindData(dosis.get(position));
    }

    public void setItems (List<Dosis> items) {
        dosis = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nombreDosis, periodo, proxima;

        ViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imagenGrande);
            nombreDosis = itemView.findViewById(R.id.info_Nombre_Dosis);
            periodo = itemView.findViewById(R.id.info_Periodo);
            proxima = itemView.findViewById(R.id.info_Proxima);
        }

        void bindData(final Dosis item) {
            imageView.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombreDosis.setText(item.getNombreProducto());
            periodo.setText(item.getPeriodo());
            proxima.setText(item.getProxima());
        }
    }

}