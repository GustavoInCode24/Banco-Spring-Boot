# 🏦 Banco-Spring-Boot

Aplicação backend desenvolvida em **Java** com **Spring Boot** para gerenciamento de **endereços** e integração com API externa de **CEP**, utilizando **PostgreSQL** como banco de dados e **Spring Data JPA** para persistência.

---

## ✨ Funcionalidades principais

- CRUD completo de endereços  
- Integração com API externa para busca de CEP  
- Cache local de resultados de CEP para otimizar consultas  
- Persistência com **Spring Data JPA / Hibernate**  
- Banco de dados **PostgreSQL**  
- Arquitetura organizada em camadas (Controller, Service, Repository, Model)

---

## 🛠️ Tecnologias utilizadas

- **Java 11+**  
- **Spring Boot**  
- **Spring Data JPA**  
- **Hibernate**  
- **PostgreSQL**  
- **Maven**  
- **API externa de CEP**

---

## 🚀 Como executar o projeto

### Pré-requisitos

- Java 11 (ou superior) instalado  
- PostgreSQL instalado e configurado  
- Maven configurado  
- (Opcional) Chave ou endpoint de API de CEP, se necessário

### Passos

1. **Clone o repositório**
   ```bash
   git clone https://github.com/GustavoInCode24/Banco-Spring-Boot.git
  ´´´´ 
2. **Acesse o diretório do projeto**  
```bash
  cd Banco-Spring-Boot
```
3. **Configure o arquivo application.properties**
*Local: src/main/resources/application.properties*
```
  spring.datasource.url=jdbc:postgresql://localhost:5432/nomedobanco
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
```
4. **Execute o projeto**
````bash
  mvn spring-boot:run
````

---

## 📂 Estrutura do projeto

````
Banco-Spring-Boot/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ com/banco/ (controllers, services, repositories, models)
│  │  └─ resources/
│  │     ├─ application.properties
│  │     └─ static / templates (se houver)
│  └─ test/
├─ pom.xml
└─ README.md
````

---
## 👨‍💻 Autor

Gustavo Lemos (GustavoInCode24)
🔗 GitHub


  
