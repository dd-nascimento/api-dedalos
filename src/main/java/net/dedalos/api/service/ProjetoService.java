package net.dedalos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dedalos.api.model.Projeto;
import net.dedalos.api.repository.ProjetoRepository;

@Service
public class ProjetoService {
    
    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto salvarProjeto (Projeto projeto){

        return projetoRepository.save(projeto);
    }

    public List <Projeto> listarProjetos(){

        return projetoRepository.findAll();
    }
}
