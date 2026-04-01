# 🦸‍♀️ Marvel Switch Evolution: Do Clássico ao Moderno

Este projeto demonstra a evolução da estrutura de controle `switch` na linguagem Java, utilizando o arco de desenvolvimento da personagem **Wanda Maximoff (Feiticeira Escarlate)** como contexto prático para ilustrar as mudanças de sintaxe entre as versões do JDK.

---

## 🔍 O que foi explorado?

O objetivo deste laboratório foi comparar a legibilidade, a segurança e a concisão do código ao transicionar do modelo tradicional para as novas **Switch Expressions** (introduzidas no Java 12 e consolidadas no Java 14).

### 1. Switch Clássico (`WandaSwitchAntigo.java`)
Nesta versão, observamos o padrão que foi soberano por décadas no Java:
* **Verbosidade:** É necessário declarar a variável antes do bloco e atribuir valores dentro de cada `case`.
* **Controle de Fluxo Manual:** Uso obrigatório do `break` para evitar o *fall-through* (quando o código executa os casos abaixo indevidamente).
* **Escopo:** Um código mais longo e suscetível a erros de esquecimento de palavras-chave.

### 2. Switch Expressions (`MarvelSwitch.java`)
Nesta versão moderna, aplicamos as melhorias recentes da linguagem:
* **Operador Arrow (`->`):** Elimina a necessidade do `break` e do uso repetitivo da palavra `case`.
* **Retorno Direto:** O `switch` passa a ser uma expressão que retorna um valor, permitindo inicializar uma variável diretamente: `String status = switch(fase) { ... };`.
* **Imutabilidade:** Facilita o uso de variáveis `final`, já que a atribuição ocorre em um único passo.

---

## 💻 Comparativo de Código

### Antigo (Versão WandaVision)
```java
switch(faseWanda){
    case "WandaVision":
        status = "Criação do Hex";
        break;
    default:
        status = "Desconhecida";
}
```

### Novo (Versão Multiverso)
```java
String status = switch(faseWanda){
    case "WandaVision" -> "Criação de realidade alternativa (Hex) por luto";
    default -> "Fase não identificada no Multiverso";
};
```

---

## 🛠️ Tecnologias
* **Linguagem:** Java (JDK 14 ou superior recomendado para suporte total às Switch Expressions).
* **Paradigma:** Programação Estruturada e Funcional.

---
**Desenvolvido por Lucas Nery Miranda**
*Estudante de Ciência da Computação - UNA*
