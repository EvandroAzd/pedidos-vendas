package br.com.procerpedidos.procerpedidosvendas.service;

import br.com.procerpedidos.procerpedidosvendas.model.Produto;

import java.util.List;

public class CalcularPrecoVendaProdutoService {
    //custo material - esta em Produto
    //frete - esta no pedido de compra
    //taxas/impostos - usuario cria
    //sacaria - usuario cria
    //mao de obra - usuario cria
    // = (custoTotal * margemEsperadaLucro) / imposto = precoVenda - sistema calcula

    public void calcularPrecoVendaProduto(Produto produtos) {
        //regra de negocio
    }
}
