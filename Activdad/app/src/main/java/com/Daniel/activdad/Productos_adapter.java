package com.Daniel.activdad;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Productos_adapter extends ArrayAdapter<producto> {

    ArrayList<producto> listaproductos; //Declaracion

    public Productos_adapter(@NonNull Context context, int resource, @NonNull ArrayList<producto> objects) {
        super(context, resource, objects);

        this.listaproductos = objects;
    }
    //getView
    //@Overrider

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View vista= convertView;
        producto productoActual = listaproductos.get(position);

        //view es null
        if(vista == null){
            vista= WebSettings.LayoutInflater.from(getContext()).ilflate(R.listaproductos,parent)_attachToRood_false);
        }
        ImageView nombrePruducto = convertView.findViewById(R.id.imagen_producto);
        Imagen.setImagenResource(productoActual.getImagen());

        TextView nombreProducto = convertView.findViewById(R.id.textViewTitulo);
        nombreProducto.setText(productoActual.getNombre());

        TextView nombreProducto = convertView.findViewById(R.id.textViewPrecio);
        nombreProducto.setText(productoActual.getNombre());

        TextView nombreProducto = convertView.findViewById(R.id.textViewOferta);
        nombreProducto.setText(productoActual.getNombre);


        return super.getView(position, convertView, parent)}


}
