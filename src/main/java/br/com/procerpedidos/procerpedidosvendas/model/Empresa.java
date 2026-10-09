package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.List;

public class Empresa {
    private String cnpj;
    private String razao_social;
    private List<Contato> contato;
    private List<Cliente> clientes;
    private List<Representante> representantes;
}
