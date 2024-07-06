package com.example.demo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(schema ="basedemo", name = "Usuarios")

public class Usuario  {

    @Id
    private Long id;
    @Column(name = "usuarioId")
    private Integer usuarioId;
    @Column
    private String apellido;
    @Column
    private Integer edad;


    public Usuario() {
    }

    public Usuario(Long id, Integer usuarioId, String apellido, Integer edad) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.apellido = apellido;
        this.edad = edad;
    }




    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
