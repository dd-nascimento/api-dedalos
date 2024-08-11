package net.dedalos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dedalos.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
}
