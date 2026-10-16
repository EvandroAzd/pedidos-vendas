# Procer Pedidos de Vendas

Sistema de gestão de pedidos de vendas.

## Diagrama de Classes

```mermaid
classDiagram

    %% Pessoa e subclasses
    class Pessoa {
        <<abstract>>
        - String nome
        - String cpf
        - List~Contato~ contatos
        - List~Endereco~ enderecos
    }

    class Representante {
        - String cargo
    }

    class Operador {
        - String funcao
        - Usuario usuario
    }

    Pessoa <|-- Representante
    Pessoa <|-- Operador
    Operador --> Usuario

    %% Usuario
    class Usuario {
        - String username
        - String senha_hash
        - boolean ativo
        - Pessoa pessoa
    }

    Usuario --> Pessoa

    %% Cliente (interface)
    class Cliente {
        <<interface>>
    }

    class ClientePF {
    }

    class ClientePJ {
        - Empresa empresa
    }

    Cliente <|.. ClientePF
    Cliente <|.. ClientePJ
    ClientePF --|> Pessoa
    ClientePJ --> Empresa

    %% Empresa
    class Empresa {
        - String cnpj
        - String razao_social
        - String inscricaoEstadual
        - String inscricaoMunicipal
        - String nomeFantasia
        - List~Endereco~ enderecos
        - List~Contato~ contatos
        - List~Representante~ representantes
    }

    Empresa "1" --> "*" Representante
    Empresa "1" --> "*" Contato
    Empresa "1" --> "*" Endereco

    %% Contato
    class Contato {
        - String nome_contato
        - String email
        - String telefone
    }

    Pessoa "1" --> "*" Contato
    Pessoa "1" --> "*" Endereco

    %% Endereco
    class Endereco {
        - String descricao
        - boolean isEnderecoPrincipal
        - String logradouro
        - String numero
        - String complemento
        - String cidade
        - String estado
        - String cep
    }

    %% Produto e UnidadeMedida
    class Produto {
        - String descricao
        - double precoCusto
        - UnidadeMedida unidadeMedida
        - double quantidade
        - double estoqueMinimo
        - double estoqueMaximo
    }

    class UnidadeMedida {
        - String codigo
        - String descricao
        - double valor
        - UnidadeMedida unidadeReferencia
    }

    Produto --> UnidadeMedida
    UnidadeMedida --> UnidadeMedida : unidadeReferencia

    %% Venda e PedidoVenda
    class Venda {
        <<abstract>>
        - List~Produto~ produtos
    }

    class PedidoVenda {
        - LocalDate dataPedido
        - Cliente cliente
        - Pagamento pagamento
    }

    Venda <|-- PedidoVenda
    Venda "1" --> "*" Produto
    PedidoVenda --> Cliente
    PedidoVenda --> Pagamento

    %% Compra e PedidoCompra
    class Compra {
        <<abstract>>
    }

    class PedidoCompra {
        - Fornecedor fornecedor
        - List~Produto~ produtos
        - Pagamento pagamento
    }

    class Fornecedor {
    }

    Compra <|-- PedidoCompra
    PedidoCompra --> Fornecedor
    PedidoCompra "1" --> "*" Produto
    PedidoCompra --> Pagamento

    %% Pagamento
    class Pagamento {
        - String naturezaOperacao
        - MetodoPagamento metodoPagamento
    }

    class MetodoPagamento {
        <<enum>>
        PIX
        BOLETO
        DINHEIRO
        CARTAO_CREDITO
        CARTAO_DEBITO
        CHEQUE
        OUTRO
    }

    Pagamento --> MetodoPagamento
```

## Estrutura do Projeto

```
model/
├── Pessoa.java          (abstract) — base para pessoas físicas
├── Representante.java   — estende Pessoa, representa empresa
├── Operador.java        — estende Pessoa, usuário interno do sistema
├── Usuario.java         — credenciais de acesso
├── Cliente.java         (interface) — base para clientes PF e PJ
├── ClientePF.java       — cliente pessoa física (extends Pessoa, implements Cliente)
├── ClientePJ.java       — cliente pessoa jurídica (implements Cliente)
├── Empresa.java         — empresa com CNPJ e representantes
├── Contato.java         — email e/ou telefone de contato
├── Endereco.java        — endereço completo
├── Produto.java         — produto com preço de custo, estoque e unidade de medida
├── UnidadeMedida.java   — unidade de medida com suporte a conversão (auto-referência)
├── Venda.java           (abstract) — base para operações de venda
├── PedidoVenda.java     — estende Venda, pedido com produtos e cliente
├── Compra.java          (abstract) — base para operações de compra
├── PedidoCompra.java    — estende Compra, pedido com fornecedores e produtos
├── Fornecedor.java      — fornecedor de produtos
├── Pagamento.java       — natureza e método de pagamento
└── MetodoPagamento.java (enum) — PIX, BOLETO, DINHEIRO, CARTÃO, CHEQUE, OUTRO

service/
└── CalcularPrecoVendaProdutoService.java — calcula o preço de venda de um produto
```