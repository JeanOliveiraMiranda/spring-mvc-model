package br.com.fapen.estoque.domain.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Produto
 */
@Entity(name = "t_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "custo_unitario")
    private BigDecimal custoUnitario;

    @Column(name = "preco_venda")
    private BigDecimal precoVenda;

    @Column(name = "categoria", length = 10)
    private String categoria;

    @Column(name = "saldo_atual")
    private Double saldoAtual;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getCustoUnitario() {
        return this.custoUnitario;
    }

    public void setCustoUnitario(BigDecimal custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public BigDecimal getPrecoVenda() {
        return this.precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getSaldoAtual() {
        return this.saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

}