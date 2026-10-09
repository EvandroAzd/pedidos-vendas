package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private List<Contato> contatos;

    public Pessoa(String nome, String cpf, List<Contato> contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
    }

    public Pessoa(String nome, String cpf) {
        this(nome, cpf, new ArrayList<>());
    }

    public Pessoa(String nome){
        this(nome, null, new ArrayList<>());
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public List<Contato> getContatos(){
        return contatos;
    }


}
