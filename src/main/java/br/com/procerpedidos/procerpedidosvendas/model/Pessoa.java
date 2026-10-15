package br.com.procerpedidos.procerpedidosvendas.model;

import lombok.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pessoa {
    private String nome;
    @Setter(AccessLevel.NONE)
    private String cpf;
    private List<Contato> contatos;
    private List<Endereco> enderecos;
}
