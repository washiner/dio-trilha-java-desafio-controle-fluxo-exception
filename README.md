# Desafio Controle de Fluxo - Java Básico

Este é um exercício proposto como parte do curso de Java Básico oferecido pela plataforma [Digital Innovation One (DIO)](https://www.digitalinnovation.one/).

## Descrição do Exercício

O objetivo deste desafio é criar um programa em Java que recebe dois números inteiros como entrada e imprime os números incrementados entre esses dois valores. O programa também deve lidar com uma exceção personalizada se o segundo parâmetro for menor ou igual ao primeiro.

### Funcionalidades:

- O programa solicita ao usuário que insira dois números inteiros.
- Em seguida, imprime todos os números entre esses dois números, incluindo-os.
- Se o segundo parâmetro for menor ou igual ao primeiro, o programa lança uma exceção personalizada `ParametrosInvalidosException`.

## Como Executar o Programa

Para executar o programa, siga estas etapas:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Baixe ou clone este repositório em sua máquina local.
3. Navegue até o diretório onde o código-fonte está localizado.
4. Compile o código-fonte executando `javac Contador.java`.
5. Execute o programa com `java Contador`.

## Detalhes da Implementação

- O código-fonte está organizado em duas classes principais: `Contador` e `ParametrosInvalidosException`.
- A classe `Contador` contém o método `main` que inicia o programa, além de métodos para obter os parâmetros do usuário e realizar a contagem.
- A classe `ParametrosInvalidosException` é uma exceção personalizada lançada se o segundo parâmetro for menor ou igual ao primeiro.

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir um problema ou enviar uma solicitação de pull request para melhorias ou correções.
