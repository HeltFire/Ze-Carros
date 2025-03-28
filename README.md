# Ze-Carros

```bash
## README - ZeCarros: Sistema de Gerenciamento de Vagas de Estacionamento
```

## Descrição do Projeto

O ZeCarros é um sistema de gerenciamento de vagas de estacionamento desenvolvido em Java utilizando a biblioteca Swing para interface gráfica. O sistema simula um estacionamento com 10 vagas, representadas por JComboBoxes, permitindo o cadastro e seleção de placas de veículos.

## Funcionalidades Atuais

Visualização de Vagas:
10 vagas de estacionamento representadas por JComboBoxes.
Cadastro de Placas:
Campo de texto (JTextField) para inserir a placa do veículo.
Botão "Enviar" para adicionar a placa à lista de opções dos JComboBoxes.
Seleção de Placas:
Cada JComboBox permite selecionar uma placa cadastrada, simulando a ocupação da vaga.

## Tecnologias Utilizadas

Java,
Swing (javax.swing)

## Como Executar o Projeto

-Pré-requisitos:
Java Development Kit (JDK) instalado.
-Compilação:
Utilize um ambiente de desenvolvimento integrado (IDE) como Eclipse, IntelliJ IDEA ou NetBeans para compilar o código-fonte Java.
Alternativamente, compile via linha de comando utilizando o javac.
-Execução:
Execute a classe principal do projeto a partir da IDE ou via linha de comando utilizando o java.

## Estrutura do Código

ZeCarros.java: Classe principal que contém a lógica da interface gráfica e funcionalidades do sistema.
Componentes Swing:
JComboBox: Para representar as vagas de estacionamento.
JTextField: Para entrada de placas.
JButton: Para adicionar placas.
JPanel: Para organizar os componentes na tela.
JFrame: Para gerar a tela da aplicação.

## Instruções de Uso

Ao iniciar o sistema, a interface gráfica exibirá as 10 vagas representadas por JComboBoxes.
No campo de texto, insira a placa do veículo que deseja cadastrar.
Clique no botão "Enviar" para adicionar a placa à lista de opções dos JComboBoxes.
Selecione a placa desejada em cada JComboBox para simular a ocupação das vagas.
