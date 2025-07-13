# 💰 Exercício 03: Sistema de Contas Bancárias

## 📚 Descrição da Questão

Você foi contratado por um banco que está em processo de modernização do seu sistema de contas bancárias.  
O objetivo é implementar uma estrutura orientada a objetos com uma superclasse `ContaBancaria` e duas subclasses específicas: `ContaCorrente` e `ContaPoupanca`.

Cada tipo de conta possui suas próprias regras de funcionamento, como limites de saque, rendimentos e taxas de juros, permitindo que o banco tenha mais controle sobre as operações realizadas por seus clientes.

---

## 🔁 Expansão com a Questão 09: Aplicação de Juros

Este exercício foi **ampliado** conforme solicitado na **questão 09**, com a adição do método `aplicarJuros()`.  
Esse método é sobrescrito em cada subclasse, permitindo que o sistema aplique **taxas de juros específicas** de acordo com o tipo da conta:

- `ContaCorrente`: juros de **15%**
- `ContaPoupanca`: juros de **6,5%**

---

## ✅ Funcionalidades Implementadas

### 🏦 Superclasse `ContaBancaria`
- Atributos:
  - `saldo` (double)
  - `numeroConta` (String)
- Métodos:
  - `depositar(double valor)`
  - `sacar(double valor)`
  - `aplicarJuros()` (método genérico a ser sobrescrito)

---

### 💳 Subclasse `ContaCorrente`
- Atributo adicional:
  - `limiteChequeEspecial` (double)
- Comportamentos:
  - Permite saques além do saldo, respeitando o limite do cheque especial
  - `aplicarJuros()`: adiciona 15% ao saldo total

---

### 🏦 Subclasse `ContaPoupanca`
- Atributo adicional:
  - `taxaRendimentoAnual` (double)
- Comportamentos:
  - `aplicarRendimentoMensal()`: aplica rendimento proporcional à taxa anual
  - `aplicarJuros()`: aplica 6,5% sobre o saldo da poupança

---

### 🧪 Classe de Teste `PrincipalContaBancaria`
- Demonstra criação e uso de contas correntes e poupanças
- Executa:
  - depósitos
  - saques
  - aplicação de rendimento mensal
  - aplicação de juros conforme regras do exercício 09

---

## 💡 Conceitos Aplicados

- Herança e especialização de classes
- Sobrescrita de métodos (`aplicarJuros`)
- Encapsulamento com uso de getters e setters
- Simulação de operações bancárias com diferentes regras por tipo de conta
- Polimorfismo em métodos de comportamento financeiro

---

## 🏫 Faculdade

**Unyleya**

## 👩‍🎓 Aluna

**Pollyana Cassia de Sousa**


