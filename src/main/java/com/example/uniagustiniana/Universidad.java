package com.example.uniagustiniana;

import java.io.Serializable;

public class Universidad implements Serializable {

    public String nombre;
    public String apellido;
    public String direccion;
    public String cedula;
    public String telefono;
    public String credito;
    int resultado;

    //,int cedula,int credito,int telefono

    public Universidad(String nombre, String apellido, String direccion, String cedula, String telefono, String credito) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cedula = cedula;
        this.credito = credito;
        this.telefono = telefono;
    }

    public Universidad(String nombre, String apellido, String direccion, int cedula, int credito, int telefono) {

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public double operacion(double costocreditouni, double numerocreditos) {

        if (numerocreditos == 1) {

            return costocreditouni;
        }else {

            return costocreditouni + operacion(costocreditouni, numerocreditos - 1);
        }


    }

}