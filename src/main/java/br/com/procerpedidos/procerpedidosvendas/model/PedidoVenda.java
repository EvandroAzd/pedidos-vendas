package br.com.procerpedidos.procerpedidosvendas.model;

import java.time.LocalDate;
import java.util.List;

public class PedidoVenda extends Venda{
    //numero
    private List<Produto> produtos;
    private LocalDate dataPedido;
    private Cliente cliente;
    private Pagamento pagamento;
    //metodoPagamento
    //prazoPagamento
}
