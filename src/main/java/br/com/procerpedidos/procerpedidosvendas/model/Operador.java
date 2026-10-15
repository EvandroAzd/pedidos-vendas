package br.com.procerpedidos.procerpedidosvendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Operador extends Pessoa{
    //codigo no bd
    private String funcao;
    private Usuario usuario;
    //podera conter roles ATENDENTE, SUPERVISOR, ADMIN
}
