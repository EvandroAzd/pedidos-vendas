package br.com.procerpedidos.procerpedidosvendas.model;

import java.util.List;

public class Empresa {
    // codigo bd
    private String cnpj;
    private String razao_social;
    private List<Contato> contatos;
    private List<Representante> representantes;

    public Empresa(String cnpj, String razao_social, List<Contato> contatos, List<Representante> representantes) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.contatos = contatos;
        this.representantes = representantes;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void  setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
}
