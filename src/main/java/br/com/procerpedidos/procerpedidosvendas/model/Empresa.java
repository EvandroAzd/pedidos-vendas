package br.com.procerpedidos.procerpedidosvendas.model;

import lombok.*;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    // codigo bd
    private String cnpj;
    private String razao_social;
    private String inscricaoEstadual;
    @Setter
    private String inscricaoMunicipal;
    @Setter
    private String nomeFantasia;
    @Setter
    private List<Endereco> enderecos;
    @Setter
    private List<Contato> contatos;
    @Setter
    private List<Representante> representantes;
}
