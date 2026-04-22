# dndCalc

<!--  ![Status](https://img.shields.io/badge/status-architecture-purple)  -->
<!--  ![Status](https://img.shields.io/badge/status-planning-orange)  -->   
<!--  ![Status](https://img.shields.io/badge/status-in%20development-blue)  -->  
<!-- ![Status](https://img.shields.io/badge/status-active_development-orange) -->
<!-- ![Progress](https://img.shields.io/badge/progress-66%25-green) -->

![Status](https://img.shields.io/badge/version-alpha-red)
![1.0.0](https://img.shields.io/badge/-0.1.0-white)
<!-- ![Status](https://img.shields.io/badge/version-beta-orange)
![Status](https://img.shields.io/badge/version-stable-brightgreen)
![Status](https://img.shields.io/badge/status-paused-lightgrey)
![Status](https://img.shields.io/badge/status-archived-darkgrey)  -->

Веб-приложение для создания и управления персонажами для игр с механикой типа Dungeons &amp; Dragons
___
![Java](https://img.shields.io/badge/Java-17-red?style=plastic&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4-green?style=plastic&logo=spring)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-1A1A1A?style=plastic&logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-0A66C2?style=plastic&logo=docker)
![Docker Compose](https://img.shields.io/badge/Docker_Compose-7B2EDA?style=plastic&logo=docker)

### Основной функционал

- Создание и управление персонажами D&D
- Распределение характеристик
- Сохранение персонажей в базе данных
- Управление инвентарем и экипировкой

### 🚀 Быстрый старт (локальный запуск)

Для запуска требуется **Docker**.

```bash
git clone https://github.com/AABarabanov/dndCalc
cd dndСalc
docker compose up
```
👉 http://localhost:8080

---

<!--
### Технологии
- **Backend**: Java 17, Spring Boot 4
- **Database**: PostgreSQL
- **Build**: Maven
- **Deployment**: Docker, Docker Compose  -->

<!--### Запуск
```bash
# Поднять всё вместе
docker-compose up -d
# Приложение будет доступно на http://localhost:8080
# PostgreSQL будет доступен на localhost:5432
```  -->

```mermaid
graph TB
    subgraph Клиент
        A(Браузер)
    end

    subgraph dndCalc
        F{Security Filter Chain<br/>Spring Security}
        B((Spring MVC Controller))
        C[Бизнес-логика<br/>CharacterService]
        D[JPA Repository]
    end

    subgraph PostgreSQL
        E[(characters)]
        G[(users)]
    end

A -->|HTTP запрос| F
F -->|проверка пользователя| G
G-->| | F
F -->|успешная аутентификация| B
B -->|вызывает| C
C -->|CRUD операции| D
D -->|SQL запрос| E
E -->|результат| D
D -->|Entity| C
C -->|результат| B
B -->|HTML страница| A

style A fill:stroke:#d97706,stroke-width:2px,r:50
style B fill:#3b82f6,stroke:#1e40af,stroke-width:2px,color:#000
style C fill:#10b981,stroke:#047857,stroke-width:2px,color:#000
style D fill:#fbbf24,stroke:#374151,stroke-width:3px,color:#000
style F fill:#8b5cf6,stroke:#6d28d9,stroke-width:2px,color:#fff

linkStyle 0 stroke:#22c,stroke-width:2px
linkStyle 1 stroke:#22c,stroke-width:2px
linkStyle 2 stroke-width:2px
linkStyle 3 stroke-width:2px
linkStyle 4 stroke-width:2px
linkStyle 5 stroke-width:2px
linkStyle 6 stroke-width:2px
linkStyle 7 stroke:#22c55e,stroke-width:2px
linkStyle 8 stroke:#22c55e,stroke-width:2px
linkStyle 9 stroke:#22c55e,stroke-width:2px
linkStyle 10 stroke:#22c55e,stroke-width:2px
```
