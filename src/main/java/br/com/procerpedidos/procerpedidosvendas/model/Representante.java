package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.List;

public class Representante extends Pessoa{
    private String cargo;

    public Representante(String nome, String cpf, List<Contato> contatos, String cargo) {
        super(nome, cpf, contatos);
        this.cargo = cargo;
    }

    public Representante(String nome, String cpf, List<Contato> contatos) {
        super(nome, cpf, contatos);
    }

    public Representante(String nome, String cpf) {
        super(nome, cpf);
    }

    public Representante(String nome) {
        super(nome);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
