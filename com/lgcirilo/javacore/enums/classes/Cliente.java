package com.lgcirilo.javacore.enums.classes;

public class Cliente {
    // enums podem ser declaradas em arquivos separados ou diretamente na classe que as utilizarah (da mesma forma que se faz com inner classes)
    public enum TipoPagamento {
        AA_VISTA, AA_PRAZO
    }

    private String nome;
    private Personalidade tipo;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, Personalidade tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(Personalidade tipo) {
        this.tipo = tipo;
    }

    public Personalidade getTipo() {
        return this.tipo;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
               "{nome=" + this.nome +
               ", personalidade=" + this.tipo +
               ", pagamento=" + this.tipoPagamento +
               ", valor numerico de personalidade= " + tipo.getPersonalidade() +
               "}";
    }
} 
