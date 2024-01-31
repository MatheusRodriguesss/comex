package br.com.alura.comex;

import static br.com.alura.comex.Comparar.testeCompara;

public class Produto {
   private String nome;

    private String descricao;

    private double preco;

    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto" +
                "Nome: " + nome +
                "\nDescricao: " + descricao +
                "\nPreço: " + preco +
                "\nQuantidade: " + quantidade
                ;
    }
}
