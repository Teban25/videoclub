package com.co.videoclub.persistencia.dto;

import java.util.Date;

/**
 *
 * @author davigofr
 */
public class Cliente {
    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int id, String nombre, Date fechaNacimiento, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + '}';
    }
}
