# dndCalc
Веб-приложение для создания и управления персонажами для игр с механикой типа Dungeons &amp; Dragons

```mermaid
graph
    subgraph Клиент
        A(Браузер)
    end

    subgraph dndCalc
        B[Spring MVC Controller]
        C[Бизнес-логика<br/>CharacterService]
        D[JPA Repository]
    end

    subgraph Хранилище
        E[(PostgreSQL)]
    end

A -->|HTTP запрос| B
B -->|вызывает| C
C -->|CRUD операции| D
D -->|SQL запрос| E
E -->|результат| D
D -->|Entity| C
C -->|результат| B
B -->|HTML страница| A

style A fill:stroke:#d97706,stroke-width:2px,r:50
style B fill:#3b82f6,stroke:#1e40af,stroke-width:2px
style C fill:#10b981,stroke:#047857,stroke-width:2px
style D fill:#fbbf24,stroke:#374151,stroke-width:3px