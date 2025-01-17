# Exercícios em Java - Projeto Simples

Este é um projeto em Java com exercícios educativos que podem ser executados diretamente pelo terminal. Os exercícios abordam diversos conceitos de programação, como manipulação de strings, estruturas de repetição, e interação com o usuário.

Cada exercício foi implementado em um arquivo separado para facilitar a organização e a execução individual.

---

## Estrutura do Projeto

```
exerciciosEmJava/
|-- src/
    |-- exerciciosEmJava/
        |-- Anagrama.java
        |-- ContadorDePalavras.java
        |-- Fibonacci.java
        |-- JogoDeAdivinhacao.java
        |-- NumerosInvertidos.java
        |-- Palindromo.java
```

### Descrição dos Exercícios

1. **Anagrama.java**
   - Recebe duas palavras e verifica se são anagramas (possuem as mesmas letras em ordem diferente).

2. **ContadorDePalavras.java**
   - Lê uma frase e conta o número de palavras nela, considerando espaços em branco.

3. **Fibonacci.java**
   - Calcula e exibe os primeiros `n` números da sequência de Fibonacci. O valor de `n` é fornecido pelo usuário.

4. **JogoDeAdivinhacao.java**
   - Um jogo em que o programa escolhe um número entre 1 e 50, e o usuário tenta adivinhar. O programa fornece dicas se o número é maior ou menor.

5. **NumerosInvertidos.java**
   - Lê um número inteiro e exibe o número invertido (ex.: entrada `1234` resulta em `4321`).

6. **Palindromo.java**
   - Verifica se uma palavra é um palíndromo (se pode ser lida da mesma forma de trás para frente), ignorando maiúsculas e minúsculas.

---

## Como Executar os Exercícios

### Requisitos

- **Java 17** ou superior
- **IntelliJ IDEA** (ou outro IDE de sua preferência)

### Passos para Executar

1. **Clone o repositório ou copie os arquivos para o seu ambiente local**.

2. Abra o projeto em sua IDE.

3. Para executar um exercício:
   - Navegue até o arquivo desejado (por exemplo, `Anagrama.java`).
   - Clique com o botão direito no arquivo e selecione `Run` (Executar) ou utilize o atalho **Shift + F10**.

4. Interaja com o programa diretamente no terminal integrado da IDE.

---

## Exemplos de Execução

### Exemplo 1: Anagrama

#### Entrada:
```
Digite a primeira palavra: amor
Digite a segunda palavra: roma
```
#### Saída:
```
As palavras "amor" e "roma" são anagramas!
```

### Exemplo 2: Contador de Palavras

#### Entrada:
```
Digite uma frase: Este é um teste
```
#### Saída:
```
A frase contém 4 palavra(s).
```

### Exemplo 3: Jogo de Adivinhação

#### Entrada:
```
Adivinhe o número (entre 1 e 50): 25
Dica: O número é maior.
Adivinhe o número (entre 1 e 50): 40
Parabéns! Você acertou o número.
```

---

## Melhorias Futuras

- Implementar uma interface gráfica para interagir com os exercícios.
- Transformar os exercícios em um sistema de APIs REST para serem consumidos por um frontend.
- Adicionar testes automatizados para validação das soluções.

---

## Autor
Projeto criado com o objetivo de aprendizado e prática da linguagem Java. Para dúvidas ou sugestões, sinta-se à vontade para entrar em contato!

