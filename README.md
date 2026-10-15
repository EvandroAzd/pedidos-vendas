# Procer Pedidos de Vendas

Sistema de gestão de pedidos de vendas.

## Diagrama de Classes

```mermaid
classDiagram

    %% Herança de Pessoa
    class Pessoa {
        <<abstract>>
        - String nome
        - String cpf
        - List~Contato~ contatos
    }

    class Representante {
        - String cargo
    }

    class Operador {
        - String funcao
    }

    Pessoa <|-- Representante
    Pessoa <|-- Operador

    %% Usuario
    class Usuario {
        - String username
        - String senha_hash
        - boolean ativo
        - Pessoa pessoa
    }

    Usuario --> Pessoa

    %% Cliente
    class Cliente {
        <<abstract>>
    }

    class ClientePF {
        - Pessoa pessoa
    }

    class ClientePJ {
        - Empresa empresa
    }

    Cliente <|-- ClientePF
    Cliente <|-- ClientePJ
    ClientePF --> Pessoa
    ClientePJ --> Empresa

    %% Empresa
    class Empresa {
        - String cnpj
        - String razao_social
        - List~Contato~ contatos
        - List~Representante~ representantes
    }

    Empresa "1" --> "*" Representante
    Empresa "1" --> "*" Contato

    %% Contato
    class Contato {
        - String nome_contato
        - String email
        - String telefone
    }

    Pessoa "1" --> "*" Contato

    %% Endereco
    class Endereco {
        - String logradouro
        - String numero
        - String complemento
        - String cidade
        - String estado
        - String cep
    }

    %% Produto
    class Produto {
        - String descricao
        - double preco
        - double custo
        - double quantidade
        - double estoqueMinimo
        - double estoqueMaximo
    }

    %% Pedido
    class Pedido {
    }

    %% Pagamento
    class Pagamento {
        - String condicao_pagamento
        - String metodo_pagamento
    }
```

## Estrutura do Projeto

```
model/
├── Pessoa.java          (abstract) — base para pessoas físicas
├── Representante.java   — representa empresa no sistema
├── Operador.java        — usuário interno do sistema
├── Usuario.java         — credenciais de acesso
├── Cliente.java         (abstract) — base para clientes PF e PJ
├── ClientePF.java       — cliente pessoa física
├── ClientePJ.java       — cliente pessoa jurídica
├── Empresa.java         — empresa com CNPJ e representantes
├── Contato.java         — email e/ou telefone de contato
├── Endereco.java        — endereço completo
├── Produto.java         — produto com preço, custo e estoque
├── Pedido.java          — pedido de venda
└── Pagamento.java       — condição e método de pagamento
```