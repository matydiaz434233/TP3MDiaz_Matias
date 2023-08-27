package com.matisoft.listadeinmuebles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class listaAdapter extends ArrayAdapter<Inmueble> {
    private Context context;
    private List<Inmueble> lista;
    private  LayoutInflater li;

    public listaAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects , LayoutInflater inflador) {
        super(context, resource, objects);
        this.context= context;
        this.lista= objects;
        this.li= inflador;

    }

    //metodo que se va a ejecutar por cada elemento de la lista que yo le paso
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView= convertView;
        if (itemView == null){
            itemView=li.inflate(R.layout.item,parent , false);
        }
        Inmueble inmueble = lista.get(position);
        ImageView foto= itemView.findViewById(R.id.foto);
        foto.setImageResource(inmueble.getFoto());
        TextView direccion = itemView.findViewById(R.id.direccion);
        direccion.setText(inmueble.getDireccion());
        TextView precio = itemView.findViewById(R.id.precio);
        precio.setText(inmueble.getPrecio()+" USD");// le agrego +"" para convertir a string para evitar error
        return  itemView;
    }
}
