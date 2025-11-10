# Gerenciamento de Veículos

## Descrição
Este projeto é um sistema simples de gerenciamento de veículos desenvolvido em **Java**, utilizando conceitos de **orientação a objetos**, como **herança**, **classes abstratas** e **métodos de acesso**.

O sistema permite criar veículos do tipo **Carro** e **Moto**, definindo atributos como marca, modelo, ano, número de portas e cilindrada, e exibe informações completas de cada veículo.

---

## Estrutura de Arquivos
- `Veiculo.java` → Classe abstrata base, com atributos e métodos de acesso.  
- `Carro.java` → Classe que herda de Veiculo e adiciona o atributo `numeroPortas`.  
- `Moto.java` → Classe que herda de Veiculo e adiciona o atributo `cilindrada`.  
- `Main.java` → Classe principal que instancia os objetos e imprime informações dos veículos.  
- `.gitignore` → Arquivo de configuração para ignorar arquivos `.class`.  

---

## Como Executar

1. Abra o terminal na pasta do projeto.
2. Compile os arquivos Java:

```bash
javac *.java
