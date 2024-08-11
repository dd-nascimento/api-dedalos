package net.dedalos.api.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import net.dedalos.api.constants.StatusUsuario;

@Data
@Entity(name = "dd_usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_USUARIO")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome; 

    @Column(name = "SOBRENOME", nullable = false)
    private String sobrenome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataDeNascimento;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Column(name = "STATUS_USUARIO", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusUsuario status;
}
