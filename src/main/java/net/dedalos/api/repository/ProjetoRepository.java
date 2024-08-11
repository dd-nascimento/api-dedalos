package net.dedalos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dedalos.api.model.Projeto;

public interface ProjetoRepository extends JpaRepository <Projeto, Long>{
    
}
