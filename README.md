A atividade consistiu em refatorar o código original para atender ao Princípio Aberto-Fechado (OCP), que determina que uma classe deve estar aberta para extensão, mas fechada para modificação.

No código inicial, a classe CalculadoraDeDesconto utilizava estruturas condicionais (if/else) para aplicar diferentes tipos de desconto. Isso obrigava a modificação da classe sempre que um novo tipo de desconto fosse criado, caracterizando uma violação do OCP.

Para resolver o problema, aplicamos o padrão de projeto Strategy, criando a interface EstrategiaDeDesconto, que define o contrato para o cálculo de desconto.

Cada tipo de desconto (Cupom, VIP, Sazonal e Aniversário) foi implementado em uma classe concreta no pacote service, todas implementando a interface EstrategiaDeDesconto. Dessa forma, cada regra de negócio ficou encapsulada em sua própria classe, reduzindo o acoplamento e aumentando a flexibilidade do sistema.

A classe CalculadoraDeDesconto foi refatorada para receber uma estratégia como parâmetro, eliminando completamente as estruturas condicionais internas.

Na classe principal (main), criamos o objeto Pedido, instanciamos a calculadora e definimos dinamicamente a estratégia de desconto desejada. Em seguida, aplicamos o desconto e armazenamos o resultado na variável valorFinal.

Com essa abordagem, o sistema agora permite adicionar novos tipos de desconto apenas criando novas classes que implementem a interface, sem necessidade de alterar a classe CalculadoraDeDesconto, garantindo assim conformidade com o OCP.
