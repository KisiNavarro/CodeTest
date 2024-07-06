package com.example.demo;

import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario guardarUsuario(Usuario usuario){

        return usuarioRepository.save(usuario);


    }

    public List<Usuario> getAllUsuarios(){

        return usuarioRepository.findAll();

    }

    public Optional<Usuario> getUsuarioById(Long id){

        return usuarioRepository.findById(id);


    }

    public Usuario updateUsuario(Long id, Usuario updatedUsuario) {
        Optional<Usuario> existingUsuario = usuarioRepository.findById(id);
        if (existingUsuario.isPresent()) {
            Usuario usuario = existingUsuario.get();
            usuario.setUsuarioId(updatedUsuario.getUsuarioId());
            usuario.setApellido(updatedUsuario.getApellido());
            usuario.setEdad(updatedUsuario.getEdad());
            usuario.setId(updatedUsuario.getId());
            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("User not found");
        }
    }

   public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);

   }

}
