
package com.emergentes.practica_n2;

public class registraUsuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "registraUsuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", contra=" + contra + '}';
    }
    
    
}
