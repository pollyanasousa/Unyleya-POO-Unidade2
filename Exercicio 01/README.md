# 🚗 Exercício 1: Veículos e Herança

## 📖 Descrição da Atividade

Você foi contratado(a) por uma empresa automobilística para desenvolver um sistema que organize informações de veículos. Para isso, é necessário utilizar os conceitos de herança e especialização em Programação Orientada a Objetos (POO).

O sistema deve conter:
- Uma **superclasse `Veiculo`**, com atributos comuns como marca, modelo e ano.
- Duas **subclasses especializadas**, `Carro` e `Moto`, cada uma com atributos e métodos específicos.
- Uma **classe principal (`PrincipalVeiculo`)** responsável por testar o funcionamento das classes criadas.

---

## ✅ O que foi implementado

- **Superclasse `Veiculo`**
  - Atributos: `marca`, `modelo`, `ano`
  - Métodos: getters, setters e o método `acelerar()`

- **Subclasse `Carro`**
  - Atributo adicional: `numeroDePortas`
  - Método específico: `limparParabrisa()`

- **Subclasse `Moto`**
  - Atributo adicional: `temPartidaEletrica`
  - Método específico: `partidaEletrica()` que retorna o estado da partida

- **Classe `PrincipalVeiculo`**
  - Instancia objetos das classes `Carro` e `Moto`
  - Executa métodos específicos e herdados para demonstrar o uso da herança

---

## 🛠️ Conceitos Trabalhados

- Herança e reutilização de código
- Encapsulamento com getters e setters
- Especialização de classes
- Organização de classes com responsabilidades distintas

---

## 👩‍🎓 Aluna  
**Pollyana Cassia de Sousa**  

## 🏫 Faculdade  
**Unyleya**
