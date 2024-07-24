
# Exemplo Hexagonal Arch

## Visão Geral
Este projeto é uma aplicação baseada na Arquitetura Hexagonal, também conhecida como Arquitetura de Portos e Adaptadores. Essa arquitetura promove uma separação clara entre a lógica de negócios e as interfaces externas, facilitando a manutenção e a escalabilidade da aplicação.

## Estrutura do projeto

O projeto está estruturado da seguinte forma:

- Core: Contém a lógica de negócios e as regras de aplicação.
- Adapters: Implementações para interfaces externas, como bancos de dados e APIs externas.
- Ports: Interfaces que definem como a aplicação interage com o mundo exterior.

## Configuração

Configuração das variáveis ambiente (shell):







## Variáveis de Ambiente

Este projeto é uma aplicação baseada na Arquitetura Hexagonal, também conhecida como Arquitetura de Portos e Adaptadores. Essa arquitetura promove uma separação clara entre a lógica de negócios e as interfaces externas, facilitando a manutenção e a escalabilidade da aplicação.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- Core: Contém a lógica de negócios e as regras de aplicação.
- Adapters: Implementações para interfaces externas, como bancos de dados e APIs externas.
- Ports: Interfaces que definem como a aplicação interage com o mundo exterior.

## Configuração

`export SERVER_PORT=8081`

`export MONGODB_USERNAME=root`


`export export MONGODB_PASSWORD=example`


`export MONGODB_HOST=localhost`


`export MONGODB_PORT=27017`



`export export MONGODB_DATABASE=hexagonal`



`export export MONGODB_AUTH_DB=admin`



`export export ADDRESS_URL=http://localhost:8082/addresses`