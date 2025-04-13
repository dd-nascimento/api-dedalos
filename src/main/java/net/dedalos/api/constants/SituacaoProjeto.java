package net.dedalos.api.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SituacaoProjeto {
    NAO_INICIADO("NI", "Não Iniciado"),
    EM_ANDAMENTO("EA", "Em Andamento"),
    EMPEDIDO("EP", "Empedido"),
    CONCLUIDO("CN", "Concluído");

    private String codigo;
    private String situacao;

    SituacaoProjeto(String codigo, String situacao) {

        this.codigo = codigo;
        this.situacao = situacao;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @JsonCreator
    public static SituacaoProjeto doValor(String codigo, String situacao) {

        if (codigo.equals("NI")) {
            return NAO_INICIADO;
        } else if (codigo.equals("EA")) {
            return EM_ANDAMENTO;
        } else if (codigo.equals("EP")) {
            return EMPEDIDO;
        } else if (codigo.equals("CN")) {
            return CONCLUIDO;
        } else {
            return null;
        }
    }
}
