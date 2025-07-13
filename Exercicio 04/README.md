# 🚗 Exercício 04 – Impressão Detalhada de Informações de Veículos (Nova Versão do Exercício 01)

## 📚 Contexto e Descrição

Este exercício corresponde a uma **nova versão do Exercício 01**, no qual as classes básicas para representar veículos foram aprimoradas.  

Nesta versão, foi implementado um método chamado **`imprimirInformacoes`** na superclasse `Veiculo`, que exibe as informações básicas do veículo.  

Além disso, este método foi **sobrescrito** nas subclasses `Carro` e `Moto` para mostrar detalhes específicos de cada tipo de veículo, como o número de portas para carros e a existência de partida elétrica para motos.  

Essa implementação visa fornecer uma maneira mais prática e organizada para os usuários visualizarem informações completas e detalhadas de cada veículo, explorando os conceitos de herança e polimorfismo.

## ✅ Funcionalidades Implementadas

- **Superclasse `Veiculo`**  
  - Atributos: `marca`, `modelo` e `ano`  
  - Método `imprimirInformacoes()` que exibe os dados básicos do veículo.  
  - Métodos auxiliares como getters, setters e `acelerar()`.

- **Subclasse `Carro`**  
  - Atributo específico: `numeroDePortas`  
  - Sobrescrita do método `imprimirInformacoes()` para incluir o número de portas.  
  - Método adicional: `limparParabrisa()`.

- **Subclasse `Moto`**  
  - Atributo específico: `temPartidaEletrica` (booleano)  
  - Sobrescrita do método `imprimirInformacoes()` para indicar se a moto possui partida elétrica.

- **Classe Principal `PrincipalVeiculoInfo`**  
  - Criação de objetos `Carro` e `Moto`.  
  - Demonstração do uso do método `imprimirInformacoes()` para cada veículo.  
  - Uso dos métodos específicos das subclasses, como `limparParabrisa()` e `acelerar()`.

## 🏫 Faculdade

**Unyleya**

## 👩‍🎓 Aluna

**Pollyana Cassia de Sousa**



