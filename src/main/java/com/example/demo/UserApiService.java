package com.example.demo;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Component
@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)




public class UserApiService {

    private UsuarioService usuarioService;

    public UserApiService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GET
    public Usuario getUsuario() {
        return usuarioService.getUsuarioById(1L).get();
    }

}
