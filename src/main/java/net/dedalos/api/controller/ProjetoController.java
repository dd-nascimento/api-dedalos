package net.dedalos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import net.dedalos.api.model.Projeto;
import net.dedalos.api.service.ProjetoService;

@Controller
@RequestMapping("/api/projetos")
public class ProjetoController {
    
    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity <Projeto> salvarProjeto(@Valid @RequestBody Projeto projeto){

        return ResponseEntity.status(HttpStatus.CREATED).body(projetoService.salvarProjeto(projeto));
    }

    @GetMapping
    public List<Projeto> listarProjetos (){
        return projetoService.listarProjetos();
    }
}
