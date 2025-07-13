# 📐 Exercício 07: Formas Geométricas e Cálculo de Áreas

## 📚 Descrição da Questão

Desenvolva uma ferramenta para auxiliar engenheiros e arquitetos a calcular área e perímetro de diferentes formas geométricas.  
Comece com uma superclasse `FormaGeometrica` que define métodos para cálculo de área e perímetro.  
Depois, implemente subclasses específicas como `Circulo`, `Retangulo` e `Triangulo`, cada uma com suas fórmulas próprias para esses cálculos.

## ✅ Funcionalidades Implementadas

- **Superclasse `FormaGeometrica`**  
  - Métodos `calcularArea()` e `calcularPerimetro()` que retornam 0 por padrão.  
  - Método `imprimirResultados()` que exibe área e perímetro calculados.

- **Subclasse `Circulo`**  
  - Atributo: `raio`  
  - Sobrescrita dos métodos para cálculo de área (π * raio²) e perímetro (2 * π * raio).

- **Subclasse `Retangulo`**  
  - Atributos: `largura` e `altura`  
  - Sobrescrita dos métodos para cálculo de área (largura * altura) e perímetro (2 * (largura + altura)).

- **Subclasse `Triangulo`**  
  - Atributos: `ladoA`, `ladoB` e `ladoC`  
  - Cálculo do perímetro como soma dos lados.  
  - Cálculo da área pela fórmula de Herão.

- **Classe `TesteFormasGeometricas`**  
  - Instancia objetos das subclasses e imprime os resultados dos cálculos.

## 🏫 Faculdade

**Unyleya**

## 👩‍🎓 Aluna

**Pollyana Cassia de Sousa**

