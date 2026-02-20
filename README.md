🏋️ Vivere


<p align="center">
    <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">VIVERE</h1></p>
<p align="center">
	<em><code>❯ Live Better. Train Smarter.</code></em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/last-commit/i-haq786/Vivere?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<!-- <img src="https://img.shields.io/github/languages/top/i-haq786/Vivere?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/i-haq786/Vivere?style=default&color=0080ff" alt="repo-language-count">
 <img src="https://img.shields.io/github/license/i-haq786/Vivere?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license"> -->
</p>
<p align="center"><!-- default option, no dependency badges. -->
</p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>
<br>

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-Microservices-brightgreen)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-Eureka-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Relational_DB-336791)
![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-47A248)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-AMQP-FF6600)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-C71A36)

🚀 Overview

Vivere is a scalable Spring Boot Microservices Fitness Platform built using modern backend architecture principles.

It enables:

👤 User Management

🏃 Activity Tracking

🤖 AI-powered Activity Recommendations

🔄 Interservice Communication

📡 Asynchronous Messaging

Designed with polyglot persistence, service discovery, and production-grade architecture.

##  Project Structure

```sh
└── Vivere/
    ├── activityService
    │   ├── .gitattributes
    │   ├── .gitignore
    │   ├── .mvn
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    ├── aiservice
    │   ├── .gitattributes
    │   ├── .gitignore
    │   ├── .mvn
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    ├── eureka
    │   ├── .gitattributes
    │   ├── .gitignore
    │   ├── .mvn
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    └── userservice
        ├── .gitattributes
        ├── .gitignore
        ├── .mvn
        ├── mvnw
        ├── mvnw.cmd
        ├── pom.xml
        └── src
```

## 🏗 Architecture
```sh
                ┌────────────────────┐
                │   Eureka Server    │
                │ (Service Registry) │
                └─────────▲──────────┘
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
┌──────────────┐  ┌──────────────┐  ┌──────────────┐
│ User Service │  │Activity Svc  │  │  AI Service  │
│ PostgreSQL   │  │ MongoDB      │  │  MongoDB     │
│ JPA/Hibernate│  │ WebFlux      │  │ Recommendation│
└──────────────┘  └──────────────┘  └──────────────┘
                          │
                     RabbitMQ
                 (Async Messaging)

```


---

## 🛠 Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 17 |
| Framework | Spring Boot |
| Service Discovery | Spring Cloud Eureka |
| Database (SQL) | PostgreSQL |
| Database (NoSQL) | MongoDB |
| Messaging | RabbitMQ (AMQP) |
| Build Tool | Maven (Wrapper Included) |
| Logging | SLF4J |
| Boilerplate Reduction | Lombok |

---

## 🔥 Key Highlights

✔ Microservices architecture  
✔ Service Discovery (Eureka)  
✔ Async communication (RabbitMQ)  
✔ REST APIs  
✔ Polyglot Persistence  
✔ AI Recommendation API  
✔ Clean modular structure  

---

## ▶️ Running Locally

### 1️⃣ Start Required Infrastructure

Make sure these services are running:

- PostgreSQL  
- MongoDB  
- RabbitMQ  

### 2️⃣ Start Services (In Order)

```bash
cd eureka
./mvnw spring-boot:run
cd userservice
./mvnw spring-boot:run
cd activityService
./mvnw spring-boot:run
cd aiservice
./mvnw spring-boot:run
📌 Current Status
```

🟢 Active Development
Latest Update: Activity Recommendation GET API

----

📈 Roadmap

 API Gateway
 
 Centralized Config Server

 JWT Authentication

 Dockerization

 CI/CD Pipeline

 Monitoring (Prometheus + Grafana)

----

👨‍💻 Author

Md Inzamamul Haque
📍 Bangalore, India
