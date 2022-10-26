package com.example.apppastillero.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.apppastillero.Clases.Dosis;
import com.example.apppastillero.R;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private List<Dosis> listaDosis;

    public ListViewAdapter(List<Dosis> listaDosis) {
        this.listaDosis = listaDosis;
    }

    @Override
    public int getCount() {
        return this.listaDosis.size();
    }

    @Override
    public Dosis getItem(int position) {
        return this.listaDosis.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout;

        if(convertView==null){
            layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lv_dosis2,null);
        }else{
            layout=convertView;
        }

        Dosis item = getItem(position);

        TextView nombreProducto = layout.findViewById(R.id.info_Nombre_Dosis);
        TextView Periodo = layout.findViewById(R.id.info_Periodo);
        TextView Proxima = layout.findViewById(R.id.info_Proxima);

        nombreProducto.setText(item.getNombreProducto());
        Periodo.setText(item.getPeriodo());
        Proxima.setText(item.getProxima());


        return layout;
    }
}