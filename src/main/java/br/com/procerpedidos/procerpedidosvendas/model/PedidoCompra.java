package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.List;

public class PedidoCompra extends Compra {
    private Fornecedor fornecedores;
    private List<Produto> produtos;
    private Pagamento pagamento;
}
