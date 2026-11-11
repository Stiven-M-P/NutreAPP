package com.example.NutreApp.models;

import java.util.UUID;

import com.example.NutreApp.models.helpers.Departamento;
import com.example.NutreApp.models.helpers.Rol;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table  (name="usuarios")
public class Usuario {

@Id 
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;

@Column(name = "nombre", nullable = false, unique = false, length = 100)
private String nombre;

@Column(name = "correo", nullable = false, unique = true, length = 80)
private String correo;

@Column(name = "rol", nullable = false, unique = false)
private Rol rol;


private Departamento departamento;
private String contrasena_hash;



public Usuario() {
}



public Usuario(UUID id, String nombre, String correo, Rol rol, Departamento departamento) {
    this.id = id;
    this.nombre = nombre;
    this.correo = correo;
    this.rol = rol;
    this.departamento = departamento;
}



public UUID getId() {
    return id;
}



public String getNombre() {
    return nombre;
}



public String getCorreo() {
    return correo;
}



public Rol getRol() {
    return rol;
}



public Departamento getDepartamento() {
    return departamento;
}



public void setId(UUID id) {
    this.id = id;
}



public void setNombre(String nombre) {
    this.nombre = nombre;
}



public void setCorreo(String correo) {
    this.correo = correo;
}



public void setRol(Rol rol) {
    this.rol = rol;
}



public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
}



}