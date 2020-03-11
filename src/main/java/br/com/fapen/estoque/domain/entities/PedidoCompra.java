package br.com.fapen.estoque.domain.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * PedidoCompra
 */
@Entity(name = "tb_pedido_compra")
public class PedidoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Long idPedido;

    // O tipo desse cara vai ser com a entidade Login
    @Column(name = "id_login", nullable = false)
    private Long idLogin;

    @Column(name = "dt_pedido", nullable = false)
    private Date dtPedido;

    @Column(name = "situacao_pedido", nullable = false)
    private Integer situacaoPedido;

    @Column(name = "valor_final", nullable = false)
    private BigDecimal valorFinal;

    @Column(name = "inativo", nullable = false)
    private boolean inativo;

    public Long getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdLogin() {
        return this.idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public Date getDtPedido() {
        return this.dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Integer getSituacaoPedido() {
        return this.situacaoPedido;
    }

    public void setSituacaoPedido(Integer situacaoPedido) {
        this.situacaoPedido = situacaoPedido;
    }

    public BigDecimal getValorFinal() {
        return this.valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }

    public boolean isInativo() {
        return this.inativo;
    }

    public boolean getInativo() {
        return this.inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

}