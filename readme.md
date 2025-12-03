# Spring Cloud Microservices Demo

A showcase application built with **Spring Boot** and **Spring Cloud**, featuring:
- Config Server (centralized configuration via Git)
- Eureka Service Registry
- API Gateway
- Employee Service (PostgreSQL + Security)
- Fraud Service (fraud detection demo)

Includes Dockerfiles for each module and a central **docker-compose.yml** for orchestration.

---

## 🚀 Architecture
[ Client ] → [ API Gateway :8080 ] → [ Eureka Server :8761 ] 
↘ 
→ Employee Service :8081 (PostgreSQL) 
→ Fraud Service :8082 (PostgreSQL) 
[ Config Server :8888 ] provides configuration to all services
---

---

## ⚙️ Tech Stack
- Java 17
- Spring Boot 3.3.x
- Spring Cloud 2023.0.x
- PostgreSQL 16
- Docker & Docker Compose

---

## 🧭 How to Run

1. **Build JARs**
   ```bash
   mvn clean package
docker-compose up --build
Access Services

API Gateway → http://localhost:8080

Eureka Dashboard → http://localhost:8761

Config Server → http://localhost:8888

---
📡 Example Endpoints
POST /employees → create employee (secured)

GET /employees → list employees

GET /fraud/check/{employeeId} → fraud check for employee

🔐 Security
Basic Auth for demo purposes

Ready to extend with JWT/OAuth2

📦 Modules
config-server

eureka-server

api-gateway

employee-service

fraud-service

✨ Highlights
Service-to-service communication via OpenFeign

Centralized configuration via Spring Cloud Config

Service discovery with Eureka

Containerized setup with Docker Compose



