# ☕ Curso Java Básico — Orientação a Objetos, Spring Boot, PostgreSQL e React

Este projeto faz parte de um **curso de desenvolvimento fullstack com Java**.
Ele aborda desde os **conceitos fundamentais de orientação a objetos (POO)** até a **criação de uma aplicação completa** com **Spring Boot (backend)**, **PostgreSQL (banco de dados)** e **React (frontend)**.

---

## 🎯 Objetivo

O objetivo deste projeto é consolidar o aprendizado em:

* Programação orientada a objetos em Java
* Desenvolvimento de APIs REST com Spring Boot
* Integração com banco de dados PostgreSQL via JPA/Hibernate
* Consumo da API no frontend com React

---

## 🧱 Estrutura do Projeto

```
/curso-java-fullstack
├── backend/             # API em Java com Spring Boot
│   ├── src/
│   ├── pom.xml
│   └── application.properties
│
├── frontend/            # Aplicação web em React
│   ├── src/
│   ├── public/
│   └── package.json
│
└── README.md
```

---

## 🧠 Tecnologias Utilizadas

### Backend

* **Java 17+**
* **Spring Boot 3+**
* **Spring Data JPA**
* **Spring Web**
* **Spring Validation**
* **PostgreSQL**
* **Lombok**
* **Swagger/OpenAPI** (para documentação)

### Frontend

* **React 18+**
* **Vite** (para build rápido)
* **Axios** (requisições HTTP)
* **React Router DOM**
* **Tailwind CSS** (opcional)
* **Lucide Icons** (opcional)

---

## ⚙️ Configuração do Ambiente

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/usuario/curso-java-fullstack.git
cd curso-java-fullstack
```

---

### 2️⃣ Backend — Spring Boot

#### Acessar a pasta:

```bash
cd backend
```

#### Instalar dependências e rodar:

Se estiver usando Maven:

```bash
mvn spring-boot:run
```

#### Configurar `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/cursojava
spring.datasource.username=postgres
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
springdoc.swagger-ui.path=/api/docs
```

A API ficará disponível em:
👉 `http://localhost:8080`

---

### 3️⃣ Banco de Dados — PostgreSQL

Criar o banco:

```sql
CREATE DATABASE cursojava;
```

Certifique-se de que o usuário e senha definidos em `application.properties` tenham permissão para acessar esse banco.

---

### 4️⃣ Frontend — React

#### Acessar a pasta:

```bash
cd ../frontend
```

#### Instalar dependências:

```bash
npm install
```

#### Executar em modo desenvolvimento:

```bash
npm run dev
```

O frontend rodará em:
👉 `http://localhost:5173`

---

## 📡 Integração Frontend ↔ Backend

No frontend, configure o endpoint da API em um arquivo `.env`:

```
VITE_API_URL=http://localhost:8080
```

E no código (exemplo usando Axios):

```js
import axios from "axios";

export const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
});
```

---

## 📘 Documentação da API

Após iniciar o backend, acesse:

```
http://localhost:8080/api/docs
```

para visualizar a documentação interativa (Swagger UI).

---

## 🧩 Estrutura Sugerida (Backend)

```
src/
├── main/java/com/cursojava/
│   ├── model/         # Entidades JPA
│   ├── dto/           # Objetos de transferência de dados
│   ├── repository/    # Interfaces do Spring Data
│   ├── service/       # Regras de negócio
│   ├── controller/    # Endpoints REST
│   └── CursoJavaApplication.java
└── main/resources/
    └── application.properties
```

---

## 🧠 Conceitos Reforçados

* **Encapsulamento, Herança e Polimorfismo**
* **Interfaces e Classes Abstratas**
* **CRUD com Spring Data JPA**
* **DTOs e Validação com Bean Validation**
* **Documentação com Swagger**
* **Integração REST com React via Axios**

---

## 🤝 Contribuição

Quer contribuir? Siga os passos:

1. Faça um **fork** do projeto
2. Crie uma **branch** com sua feature (`git checkout -b feature/nome-da-feature`)
3. Faça o **commit** (`git commit -m "Adiciona nova feature"`)
4. Faça o **push** (`git push origin feature/nome-da-feature`)
5. Abra um **Pull Request** 🚀

---

## 📄 Licença

Distribuído sob a licença MIT.
Veja o arquivo `LICENSE` para mais informações.

---

## 👨‍💻 Autor

**Cássio Moreira de Souza**
📧 [cassiodevpro@gmail.com](mailto:cassiodevpro@gmail.com)
🌐 [linkedin.com/in/cassiodf-moreira-ti](https://linkedin.com/in/cassiodf-moreira-ti)
💻 [github.com/cassio202021041](https://github.com/cassio202021041)
