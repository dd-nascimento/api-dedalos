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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.dedalos.api.constants.StatusProjeto;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "dd_projetos")
public class Projeto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_PROJETO")
    private Long idProjeto;

    @Column(name = "CODIGO_PROJETO", nullable = false)
    private String codigoProjeto;

    @Column(name = "TITULO_PROJETO", nullable = false)
    private String titulo;

    @Column(name = "AREA_PROJETO", nullable = false)
    private String area;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_INICIO")
    private LocalDate dataDeInicio;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_TERMINO")
    private LocalDate dataDeTermino;

    @Column(name = "DURACAO_PROJETO", nullable = false)
    private int duracaoDoProjeto;

    @Column(name = "VALOR_SOLICITADO", nullable = false)
    private Float valorSolicitado;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_CRIACAO_PROJETO", nullable = false)
    private LocalDate dataDeCriacao;

    @Column(name = "STATUS_PROJETO", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusProjeto statusProjeto;

    @ManyToOne
    @JoinColumn(name = "USUARIO_PROPONENTE")
    private Usuario proponenteUsuario;

}
