package com.Daniel.activdad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaproductos = new ArrayList<>();
        object precio;
        listaproductos.add(new Productos("Acer Aspire 5", R.drawable_foreground,precio: 16,000, Oferta_false);

        ProductosAdapter productosAdapter = new ProductosAdapter(getApplicationContext(), resource 0, listaproductos);
        ListView listView= findViewById(R.id.listViewProductos);
        
    }
}