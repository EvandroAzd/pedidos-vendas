package br.com.procerpedidos.procerpedidosvendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnidadeMedida {
    private String codigo;    // ex: UN, KG, G, LT, ML, CX, PCT, M, M2, M3
    private String descricao; // ex: "Unidade", "Quilograma", "Caixa"
    private double valor;
    private UnidadeMedida unidadeReferencia; //vou utilizar para conversao de und, exemplo: 1 tambor = 300 kg
}