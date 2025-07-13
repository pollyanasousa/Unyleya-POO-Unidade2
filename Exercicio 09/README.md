# 🧮 Exercício 09: Aplicação de Juros em Contas Bancárias

## 📚 Descrição da Questão

Dando continuidade ao exercício 03, em que foi implementada a estrutura básica de contas bancárias (`ContaCorrente` e `ContaPoupanca`), a questão 09 propõe a adição de um método chamado `aplicarJuros()`.

Esse método deve ser sobrescrito em cada uma das subclasses, permitindo que o sistema aplique **juros específicos** dependendo do tipo de conta:

- Para **Conta Corrente**, a taxa de juros é de **15%**.
- Para **Conta Poupança**, a taxa de juros é de **6,5%**.

---

## 📂 Observação Importante

> ⚠️ **Este exercício foi implementado diretamente dentro do código da questão 03, por isso não possui um arquivo separado.**

As modificações solicitadas na questão 09 foram incorporadas nas subclasses `ContaCorrente` e `ContaPoupanca`, por meio da sobrescrita do método `aplicarJuros()`.  
A execução e os testes também foram realizados na mesma classe principal `PrincipalContaBancaria`.

---

## ✅ Funcionalidades Atendidas

- Método `aplicarJuros()` adicionado à superclasse `ContaBancaria` e sobrescrito nas subclasses.
- Implementação distinta para cada tipo de conta, conforme exigido:
  - `ContaCorrente`: soma 15% ao saldo.
  - `ContaPoupanca`: soma 6,5% ao saldo.
- Testes realizados com chamadas diretas ao método `aplicarJuros()` dentro da classe de teste.

---

## 📦 Arquivo Relacionado

- Toda a implementação está localizada no arquivo do **Exercício 03**:  
  `ContaBancaria.java`

---

## 🏫 Faculdade

**Unyleya**

## 👩‍🎓 Aluna

**Pollyana Cassia de Sousa**
