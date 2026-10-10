package br.com.procerpedidos.procerpedidosvendas.model;

public class Usuario{
    private String username;
    private String senha_hash;
    private boolean ativo;
    private Pessoa pessoa;

    public Usuario(String username, String senhaHash) {
        this.username = username;
        this.senha_hash = senhaHash;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha_hash() {
        return senha_hash;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
