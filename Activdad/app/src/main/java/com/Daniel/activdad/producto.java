package com.Daniel.activdad;

public class producto {

    private String nombre;
    private int imagen;
    private float precio;
    private boolean oferta;

    public producto(String nombre, int imagen, float precio, boolean oferta){

        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.oferta = oferta;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }
}

