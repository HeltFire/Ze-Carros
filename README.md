#  ZeCarros – Sistema de Gerenciamento de Estacionamento


```bash
## README - ZeCarros: Sistema de Gerenciamento de Vagas de Estacionamento
```

##  Descrição do Projeto

**ZeCarros** é um sistema de gerenciamento de vagas de estacionamento com autenticação de usuários, desenvolvido em **Java** com **Swing** para interface gráfica e **MongoDB** para persistência de dados. Ele permite que usuários se cadastrem, façam login e gerenciem ocupações de até **10 vagas** de estacionamento.

##  Funcionalidades

- **Login de Usuário**
- **Cadastro de Usuário**
- **Cadastro de Placas de Veículos**
- **Associação de Placas às Vagas (JComboBox)**
- **Interface gráfica com Java Swing**
- **Conexão com MongoDB**

##  Telas e Fluxo do Sistema

- `LoginScreen.java` – Tela de autenticação do usuário  
- `RegisterScreen.java` – Tela de registro de novo usuário  
- `telainicial.java` – Tela principal do sistema após login  
- `telacadastro.java` – Tela para cadastro de placas de veículos  
- `telavagas.java` – Tela para visualização e ocupação das vagas  
- `Zecarros.java` – Versão anterior com visualização gráfica das vagas  
- `MongoDBConnection.java` – Conexão com MongoDB

##  Tecnologias Utilizadas

- Java (JDK 8 ou superior)  
- Swing (`javax.swing`)  
- MongoDB  
- Driver oficial MongoDB para Java

##  Como Executar o Projeto

### Pré-requisitos

- Java instalado (JDK 8+)
- MongoDB em execução local ou remoto
- Driver MongoDB para Java (`mongo-java-driver-x.y.z.jar`)  
  → [Download via Maven Central](https://mvnrepository.com/artifact/org.mongodb/mongo-java-driver)


##  Estrutura dos Arquivos

```
ZeCarros/
LoginScreen.java
RegisterScreen.java
telainicial.java
telacadastro.java
telavagas.java
Zecarros.java
MongoDBConnection.java
mongo-java-driver-<versão>.jar
```

##  Segurança e Validações

- Validação de login e senha
- Verificação de campos obrigatórios
- Impede duplicação de placas
