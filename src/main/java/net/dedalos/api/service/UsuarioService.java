package net.dedalos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dedalos.api.model.Usuario;
import net.dedalos.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmailService emailService;

    public Usuario salvarUsuario (Usuario usuario){
        
        usuarioRepository.save(usuario);

        emailService.enviarEmailTexto(usuario.getEmail(), 
        "Novo usuario cadastrado", 
        "Você foi cadastrado no Dedalos!");
        
        return usuario;

    }

    public List<Usuario> listarUsuario(){

        return usuarioRepository.findAll();
    }
}
