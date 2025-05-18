# ☁️ Spring Boot Microservices Demo  
### Five HTTP Clients • Eureka Service Discovery • Spring Boot 3 + Spring Cloud

[![Java 17+](https://img.shields.io/badge/Java-17%2B-blue.svg)](#prerequisites) 
[![Spring Boot 3.x](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](#prerequisites) 
[![Spring Cloud 2023.x](https://img.shields.io/badge/Spring%20Cloud-2023.x-brightgreen)](#prerequisites)

This repository shows **five different ways** to make HTTP calls between two Spring Boot microservices that register with a **stand-alone Eureka Server**.


---

## 🔗 HTTP Clients Implemented

| # | Client style | Added starter / dependency | Blocking? | How it finds `provider-service` |
|:-:|--------------|---------------------------|-----------|--------------------------------|
| 1 | **RestTemplate** | `spring-boot-starter-web` | ✅ | `DiscoveryClient` → `LoadBalancerClient` |
| 2 | **RestClient** (Spring 6) | _none (built-in)_ | ✅ | Same as above |
| 3 | **WebClient** | `spring-boot-starter-webflux` | ❌ Reactive | URL `http://provider-service/...` auto-load-balanced |
| 4 | **HTTP Interface** | _none (built-in)_ | ✅ | Spring injects a load-balanced RestClient |
| 5 | **OpenFeign** | `spring-cloud-starter-openfeign` | ✅ | Feign + Spring Cloud LoadBalancer |

All five approaches use the logical service-ID **`provider-service`**—no hard-coded host/port!

---

## ✅ Prerequisites

* **Java 17** or newer  
* **Maven 3.8+**  
* **Spring Boot 3.x**  
* **Spring Framework 6.x**  
* **Spring Cloud 2023.x** (Netflix Eureka, OpenFeign, LoadBalancer)

---

## ▶️ Quick Start

```bash
# 1 — Start Eureka
cd eureka-server
mvn spring-boot:run

# 2 — Start the provider
cd ../provider-service
mvn spring-boot:run

# 3 — Start the consumer
cd ../consumer-service
mvn spring-boot:run
