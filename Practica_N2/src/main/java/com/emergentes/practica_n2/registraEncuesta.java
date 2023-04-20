
package com.emergentes.practica_n2;


public class registraEncuesta {
    private String nombre;
    private String[] sistemasOperativos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getSistemasOperativos() {
        return sistemasOperativos;
    }

    public void setSistemasOperativos(String[] sistemasOperativos) {
        this.sistemasOperativos = sistemasOperativos;
    }

    @Override
    public String toString() {
        return "procesaEncuesta{" + "nombre=" + nombre + ", sistemasOperativos=" + sistemasOperativos + '}';
    }
    
}
