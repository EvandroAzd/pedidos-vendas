package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.List;

public class Operador extends Pessoa{
    //codigo no bd
    private String funcao;

    public Operador(String nome, String cpf, List<Contato> contatos, String funcao) {
        super(nome, cpf, contatos);
        this.funcao = funcao;
    }

    public Operador(String nome, String cpf, String funcao) {
        super(nome, cpf);
        this.funcao = funcao;
    }


}
