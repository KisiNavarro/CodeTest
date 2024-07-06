package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Override
    List<Usuario> findAll();
}