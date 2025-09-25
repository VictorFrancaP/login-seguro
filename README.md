# 📄 Documentação - Sistema de Login Seguro

## 🔐 Introdução
Este projeto implementa um sistema de **Login Seguro** utilizando **Java Spring Boot**, **Thymeleaf** e **MongoDB Atlas**.  
Ele foi desenvolvido como base inicial para um futuro sistema de **aluguel de quadras esportivas**, estruturado de forma modular e escalável.

---

## 🚀 Funcionalidades Implementadas
- Cadastro de usuários com validação de dados.  
- Login e logout seguro com gerenciamento de sessão.  
- Hash de senhas para proteção de credenciais.  
- Controle de acesso a páginas com **Spring Security**.  
- Integração com **MongoDB Atlas** para armazenamento seguro de usuários.  
- Interface construída com **Thymeleaf**, desacoplada da lógica de negócio.  

---

## 📂 Estrutura do Projeto

```
src/main/java/org/example/auth
┣ controller/ # Controladores MVC (AuthController, etc.)
┣ service/ # Regras de autenticação e lógica de negócio
┣ repository/ # Integração com MongoDB Atlas
┣ domain/ # Entidades de usuário
┗ config/ # Configurações do Spring Security
```


---

## 🛠 Tecnologias Utilizadas
- Java 17+  
- Spring Boot 3  
- Spring Security  
- Thymeleaf  
- MongoDB Atlas  
- Maven  

---

## ⚙️ Configuração do Ambiente

### 1. Clone o repositório
```bash
git clone https://github.com/<seu-usuario>/<seu-repositorio>.git
cd <seu-repositorio>
```

2. Configure o arquivo application.properties
```
spring.data.mongodb.uri=mongodb+srv://<usuario>:<senha>@<cluster>/<database>
spring.data.mongodb.database=security_db
server.port=8080
```
3. Execute a aplicação
```
mvn spring-boot:run
```

4. Acesse no navegador
👉 http://localhost:8080/login

---
🔑 Fluxos de Autenticação

📌 Login
---
GET /auth/login → Exibe tela de login.
Caso falhe, mostra mensagem de erro.


---

📌 Registro
---
GET /auth/register → Tela de cadastro.
POST /auth/register → Valida dados e cria novo usuário no banco.

---

📌 Logout
---
/auth/logout → Finaliza a sessão do usuário.

---

📖 Documentação

O sistema inclui:
Estrutura modular baseada em boas práticas do Spring Boot.

Integração com MongoDB Atlas para persistência segura.

Código comentado para facilitar manutenção.

README com instruções de configuração e execução.

---

📜 Licença

Este projeto é distribuído sob a licença MIT.
Sinta-se à vontade para usar, modificar e contribuir.

