# ☕ Desafios de Lógica, Matemática e Estruturas de Controle em Java

Este repositório consolida uma série de exercícios práticos desenvolvidos em Java. O escopo abrange desde algoritmos matemáticos e manipulação de entrada de dados até o estudo comparativo da evolução das estruturas de controle da linguagem (Switch Clássico vs. Switch Expression).

---

## 📂 Parte 1: Algoritmos e Geometria (Lista de Exercícios)

Esta seção contém seis algoritmos focados em lógica de programação e uso da biblioteca `java.lang.Math`.

* **`Exercicio_01.java` (Análise de Números):** Lê três valores do teclado e determina o maior, o menor e a média aritmética entre eles utilizando `Math.max` e `Math.min`.
* **`Exercicio_02.java` (Máquina de Troco):** Algoritmo de caixa que calcula a quantidade ideal de notas (R$ 50, 20, 10, 5, 2, 1) a serem devolvidas como troco após uma compra.
* **`Exercicio_03.java` (Equação de 2º Grau):** Resolve equações quadráticas calculando o Delta e as raízes reais utilizando a fórmula de Bhaskara (`Math.sqrt`), incluindo validações para equações de 1º grau.
* **`Exercicio_04.java` (Cálculos Geométricos):** Um menu interativo para calcular o perímetro de um círculo, a área de um círculo ou o volume de uma esfera com base no raio informado, utilizando a constante `Math.PI`.
* **`Exercicio_05.java` (Calculadora Básica):** Calculadora via terminal com menu numérico para executar operações de soma, subtração, multiplicação e divisão (com tratamento para divisão por zero).
* **`Exercicio_06.java` (Sorteio Inteligente):** Utiliza a classe `java.util.Random` para gerar um número aleatório dentro de um intervalo definido pelo usuário. O algoritmo identifica automaticamente qual é o limite mínimo e máximo informados.

---

## 🦸‍♀️ Parte 2: A Evolução do `Switch` em Java (Estudo de Caso Marvel)

Esta seção demonstra a modernização da sintaxe da linguagem Java utilizando um contexto do universo Marvel (Feiticeira Escarlate) para comparar diferentes abordagens.

* **`WandaSwitchAntigo.java` (A Abordagem Clássica):** Demonstra o uso tradicional da estrutura `switch-case`. Exige a declaração prévia da variável, o uso repetitivo da palavra-chave `case`, e a quebra manual de fluxo com `break` para evitar vazamento de escopo (fall-through).

* **`MarvelSwitch.java` (A Abordagem Moderna - *Switch Expressions*):** Utiliza a sintaxe atualizada do Java (introduzida a partir do Java 12/14) com o operador *arrow* (`->`). Essa abordagem permite que o próprio `switch` retorne um valor diretamente para a variável de forma limpa, eliminando a necessidade do `break` e tornando o código muito mais conciso e seguro.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java.
* **Recursos Nativos:** `java.util.Scanner`, `java.lang.Math`, `java.util.Random`.
* **Conceitos:** Operadores Matemáticos, Estruturas Condicionais (`if/else`), Loops (`for`), Arrays, e Switch Expressions.

---

## 🚀 Como Executar

1. Certifique-se de que o **JDK (Java Development Kit)** está instalado na sua máquina.
2. Abra o terminal na pasta dos arquivos.
3. Compile o arquivo desejado. Exemplo:
   ```bash
   javac MarvelSwitch.java
   ```
4. Execute o programa:
   ```bash
   java MarvelSwitch
   ```

---
**Desenvolvido por Lucas Nery Miranda**
*Estudante de Ciência da Computação - UNA*
