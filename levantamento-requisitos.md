Como funciona hoje em dia a rotina hoje em relação a geração de pedidos?
    1. O pedido chega através de WhatsApp, telefone fixo ou atendimento direto no balcão;
    2. O atendente recebe o pedido, confirma e gera no sistema (feito em outra máquina);
    3. Gera NF com base no pedido (existe exceções que não é gerado);
    4. Se caso o método de pagamento for boleto, ele gera no banco (Bradesco) e anexa junto ao pedido + NF (caso tenha);
    5. Esse pedido completo é entregue para os auxiliares de estoque separar e fazer a entrega ao clinte;
    6. O pedido volta assinado para o atendente, que levará para o chefe no final do dia;
    7. Caso o pedido tenha sido pago o chefe arquiva (fisico), caso contrário retorna no outro dia para o atendente conferir o pagamento;
    8. O pedido acabará com o chefe depois de pago e arquivado;

Como podemos melhorar o fluxo, agrupando todos os dados necessários antes da geração do pedido?
    1. O pedido poderia ser realizado pelo cliente atráves de um link para uma aplicação web;
        1.1. Sendo assim, o cliente escreve o nome do pedido sempre igual;
        1.2. Corantes, de exemplo, podem ser visualizados diretamente pela aplicação, auxiliando além do código de referência de cor;
        1.3. Clientes podem se cadastrar, assim podemos atribuir preços unitários de produtos diretamente por acesso;
        1.4. Orçamentos gerados em tempo real pelo próprio cliente;
        1.5. Códigos de produtos não precisam ser decorados e valores unit não precisam de cálculos constantes;
    
-> parei nos construtores da classe Cliente

```mermaid                                                                                                                                                                 
  flowchart LR    
      A([Início]) --> B[Recebe pedido]                                                                                                                                       
      B --> C{Estoque ok?}                                                                                                                                                   
      C -- Sim --> D[Processa]                                                                                                                                               
      C -- Não --> E[Notifica cliente]                                                                                                                                       
      D --> F([Fim])                                                                                                                                                         
      E --> F                                                                                                                                                                
  ```    