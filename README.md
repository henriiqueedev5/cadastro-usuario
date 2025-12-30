# CRUD Básico de Usuários com  Java + Spring Boot

## 📌 Descrição
Este projeto é um **CRUD básico de usuários**, desenvolvido utilizando **Spring Boot**, com o objetivo de aplicar os conceitos fundamentais do desenvolvimento backend em Java e da criação de **APIs REST**.

A aplicação permite realizar operações de **cadastro, listagem, atualização e remoção de usuários**, seguindo boas práticas de organização de código e arquitetura em camadas.  
O projeto faz parte do meu **portfólio** e representa minha evolução do Java básico para o uso do framework Spring Boot.

---

## 🎯 Objetivo
- Praticar **Java** e **Spring Boot**
- Desenvolver uma **API REST**
- Implementar as operações CRUD
- Entender o fluxo de requisições HTTP
- Aplicar separação de responsabilidades (Controller, Service e Repository)

---

## ⚙️ Funcionalidades
- 👤 Cadastrar um novo usuário  
- 📄 Listar todos os usuários  
- 🔍 Buscar usuário por ID  
- ✏️ Atualizar dados de um usuário  
- 🗑️ Excluir usuário  

---

## 🛠️ Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **Banco de Dados** (H2 / MySQL – conforme configuração)
- **Maven**
- **Postman** (para testes da API)

---

## 🧱 Estrutura do Projeto

- **Controller:** Define os endpoints da API  
- **Service:** Contém a lógica de negócio  
- **Repository:** Responsável pela comunicação com o banco de dados  
- **Model:** Representa a entidade Usuário  

---

## 🧩 Modelo de Usuário (Exemplo)
O usuário possui atributos básicos, como:
- `id`
- `nome`
- `email`
- `senha`

*(Os campos podem variar conforme a implementação)*

---

## 🌐 Endpoints da API
| Método | Endpoint              | Descrição                    |
|-------|-----------------------|------------------------------|
| POST  | `/api/usuarios`       | Criar novo usuário           |
| GET   | `/api/usuarios`       | Listar todos os usuários     |
| GET   | `/api/usuarios/{id}`  | Buscar usuário por ID        |
| PUT   | `/api/usuarios/{id}`  | Atualizar usuário            |
| DELETE| `/api/usuarios/{id}`  | Excluir usuário              |

---

🚀 Próximas Melhorias

Validação de dados com Bean Validation

Implementar autenticação e autorização

Criptografia de senha

Documentação da API com Swagger

Deploy da aplicação em nuvem



📚 Aprendizados

Com este projeto, foi possível aprender e praticar:

Desenvolvimento de APIs REST com Spring Boot

Organização de projetos em camadas

Persistência de dados com JPA/Hibernate

Boas práticas iniciais de backend em Java


