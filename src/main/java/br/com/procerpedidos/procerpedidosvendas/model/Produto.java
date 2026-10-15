package br.com.procerpedidos.procerpedidosvendas.model;

public class Produto {
    private String descricao;
    private double preco; //valor vendido para cliente
    private double custo; //valor do fornecedor

    //estoque, modelar classe a parte
    private double quantidade;
    private double estoqueMinimo;
    private double estoqueMaximo;
}
