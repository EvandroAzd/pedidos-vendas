package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.List;

public class Cliente extends Pessoa {
    //no bd teremos codigo cliente
    private Endereco endereco;
    private boolean ativo;

    public Cliente(String nome, String cpf, List<Contato> contatos, Endereco endereco, boolean ativo) {
        super(nome, cpf, contatos);
        this.endereco = endereco;
        this.ativo = ativo;
    }

}
