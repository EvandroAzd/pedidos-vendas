package br.com.procerpedidos.procerpedidosvendas.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido extends Venda{
    //numero
    private List<Produto> produtos;
    private LocalDate dataPedido;
    private Cliente cliente;
    //metodoPagamento
    //prazoPagamento
}
