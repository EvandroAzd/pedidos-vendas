package br.com.procerpedidos.procerpedidosvendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
    private String nome_contato;
    private String email;
    private String telefone;

//    public Contato(String nome_contato, String email, String telefone) {
//        this.nome_contato = nome_contato;
//        this.email = email;
//        this.telefone = telefone;
//    }

    // O java da erro antes de compilar, pois identifica construtores por tipo e quantidade de parametros
    //neste caso temos ambiguidades = String, String
    //por vou utilizar o padrão Builder para resolver este problema
 /*   public Contato(String nome_contato, String email) {
        this(nome_contato, email, null);
    }

    public Contato(String nome_contato, String telefone) {
        this(nome_contato, null, telefone);
    }*/

}
