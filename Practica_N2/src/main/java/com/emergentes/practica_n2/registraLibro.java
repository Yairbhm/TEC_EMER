package com.emergentes.practica_n2;

public class registraLibro {
    private String nombre;
    private String autor;
    private String resumen;
    private String[] tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "registraLibro{" + "nombre=" + nombre + ", autor=" + autor + ", resumen=" + resumen + ", tipo=" + tipo + '}';
    }
    
    
}
