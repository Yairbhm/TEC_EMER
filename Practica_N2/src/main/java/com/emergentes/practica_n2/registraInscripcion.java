
package com.emergentes.practica_n2;

public class registraInscripcion {
    private String fecha;
    private String nombre;
    private String apellido;
    private String turno;
    private String[] seminarios;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String Turno) {
        this.turno = Turno;
    }

    public String[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(String[] seminarios) {
        this.seminarios = seminarios;
    }

    @Override
    public String toString() {
        return "registraInscripcion{" + "fecha=" + fecha + ", nombre=" + nombre + ", apellido=" + apellido + ", Turno=" + turno + ", seminarios=" + seminarios + '}';
    }
    
    
}
