
package com.emergentes.practica_n2;


public class registraContacto {
    private String nombre;
    private String correo;
    private String mensaje;
    private String[] envia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String[] getEnvia() {
        return envia;
    }

    public void setEnvia(String[] envia) {
        this.envia = envia;
    }

    @Override
    public String toString() {
        return "registraContacto{" + "nombre=" + nombre + ", correo=" + correo + ", mensaje=" + mensaje + ", envia=" + envia + '}';
    }
    
}
