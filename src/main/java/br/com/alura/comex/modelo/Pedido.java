package br.com.alura.comex.modelo;

import java.math.BigDecimal;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private BigDecimal preco;
    private Integer quantidade;

    public Pedido(Cliente cliente, BigDecimal preco, Integer quantidade) {
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public boolean isMaisBaratoQue(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal()) == -1;
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal()) == 1;
    }

    public BigDecimal getValorTotal() {
        return this.preco.multiply(new BigDecimal(this.quantidade));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }



}
