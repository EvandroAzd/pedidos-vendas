package br.com.procerpedidos.procerpedidosvendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String descricao;
    private double preco;  // valor vendido para cliente
    private double custo;  // valor do fornecedor
    private UnidadeMedida unidadeMedida;

    // estoque, modelar classe a parte
    private double quantidade;
    private double estoqueMinimo;
    private double estoqueMaximo;
}