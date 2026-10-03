\# Spring Modern Evolution



> \*\*Spring → Spring Boot → Java 21 → Spring Boot 3/4\*\*



Un percorso pratico e progressivo per \*\*imparare Spring Framework e Spring Boot\*\*, comprendere la loro evoluzione nel tempo e arrivare alla realizzazione di applicazioni moderne, testabili e pronte per la produzione.



L'obiettivo non è soltanto imparare a usare Spring Boot, ma capire \*\*come e perché si è arrivati al modello moderno\*\*.



\---



\## 🎯 Obiettivo



Il repository accompagna lo sviluppatore attraverso questa evoluzione:



```text

Java

&#x20;│

&#x20;▼

Spring Framework

&#x20;│

&#x20;├── IoC / DI

&#x20;├── Beans

&#x20;├── ApplicationContext

&#x20;├── Spring MVC

&#x20;├── JDBC

&#x20;├── Validation

&#x20;├── Profiles

&#x20;└── SOAP

&#x20;│

&#x20;▼

Spring Boot

&#x20;│

&#x20;├── Auto Configuration

&#x20;├── Starters

&#x20;├── REST

&#x20;├── Database

&#x20;├── JPA

&#x20;├── Spring Data

&#x20;├── Testing

&#x20;├── Security

&#x20;└── Actuator

&#x20;│

&#x20;▼

Java 21

&#x20;│

&#x20;├── Records

&#x20;├── Pattern Matching

&#x20;├── Virtual Threads

&#x20;└── moderne funzionalità Java

&#x20;│

&#x20;▼

Spring Boot 3 / 4

&#x20;│

&#x20;├── Spring Framework 6 / 7

&#x20;├── Jakarta

&#x20;├── Observability

&#x20;├── Native

&#x20;├── Cloud

&#x20;└── applicazioni moderne

```



\---



\# 🗺️ Roadmap



```text

┌────────────────────┐

│ 1. Spring Framework│

│                    │

│ IoC / DI           │

│ Beans              │

│ Context            │

│ MVC                │

│ JDBC               │

│ Validation         │

│ Profiles           │

│ SOAP               │

└─────────┬──────────┘

&#x20;         │

&#x20;         ▼

┌────────────────────┐

│ 2. Spring Boot     │

│                    │

│ Auto Configuration │

│ REST               │

│ JPA                │

│ Database           │

│ Security           │

│ Testing            │

│ Actuator           │

│ Docker             │

└─────────┬──────────┘

&#x20;         │

&#x20;         ▼

┌────────────────────┐

│ 3. Java 21         │

│                    │

│ Records            │

│ Pattern Matching   │

│ Virtual Threads    │

│ Modern Java        │

└─────────┬──────────┘

&#x20;         │

&#x20;         ▼

┌────────────────────┐

│ 4. Spring Boot 3/4 │

│                    │

│ Jakarta             │

│ Spring 6/7         │

│ HTTP Interfaces    │

│ Observability      │

│ Native             │

│ Cloud              │

└────────────────────┘

```



\---



\# 📚 Percorso di apprendimento



\## Livello 1 — Spring Framework



I primi 18 moduli costituiscono le fondamenta.



| # | Argomento |

|---:|---|

| 01 | Getting Started with Spring Framework |

| 02 | Spring Core |

| 03 | Spring Expression Language — SpEL |

| 04 | SqlRowSet / SimpleJdbcCall |

| 05 | Creating and Using Beans |

| 06 | Bean Scopes |

| 07 | Conditional Bean Registration |

| 08 | Spring Bean Validation |

| 09 | ApplicationContext Configuration |

| 10 | RestTemplate |

| 11 | Task Execution and Scheduling |

| 12 | Lazy Initialization |

| 13 | Property Source |

| 14 | Dependency Injection / IoC |

| 15 | JdbcTemplate |

| 16 | SOAP Web Services |

| 17 | Spring Profiles |

| 18 | DispatcherServlet / dispatcher-servlet.xml |



\### Risultato



Al termine di questa parte bisogna essere in grado di leggere e comprendere un'applicazione Spring tradizionale, anche se basata su configurazioni XML.



\---



\# 🚀 Livello 2 — Spring Boot



Dopo le fondamenta si passa a Spring Boot.



| # | Argomento |

|---:|---|

| 19 | Hello World |

| 20 | Auto Configuration |

| 21 | Spring Boot Starters |

| 22 | REST API |

| 23 | DTO |

| 24 | Exception Handling |

| 25 | Database |

| 26 | JPA / Hibernate |

| 27 | Spring Data JPA |

| 28 | Transactions |

| 29 | Testing |

| 30 | Spring Security |

| 31 | Actuator |

| 32 | Logging |

| 33 | Docker |



L'obiettivo è arrivare alla realizzazione di una vera applicazione backend.



\---



\# ☕ Livello 3 — Java 21



Spring moderno deve essere studiato insieme all'evoluzione di Java.



Argomenti principali:



\- Records

\- Pattern Matching

\- Sealed Classes

\- Switch Expressions

\- Text Blocks

\- Lambda e Stream

\- Optional

\- Virtual Threads

\- moderne API Java



Esempio:



```java

public record UserDto(

&#x20;   Long id,

&#x20;   String name,

&#x20;   String email

) {}

```



Confronto con il vecchio approccio:



```java

public class UserDto {



&#x20;   private Long id;

&#x20;   private String name;

&#x20;   private String email;



&#x20;   // constructor

&#x20;   // getters

&#x20;   // setters

&#x20;   // equals

&#x20;   // hashCode

&#x20;   // toString

}

```



Il repository deve mostrare \*\*sia la sintassi sia il motivo dell'evoluzione\*\*.



\---



\# 🌱 Livello 4 — Spring Boot 3 / 4



La parte moderna approfondisce:



\- Spring Framework 6 / 7

\- Jakarta EE

\- `javax.\* → jakarta.\*`

\- REST moderno

\- HTTP Interface Clients

\- WebClient

\- Spring Security

\- OAuth2

\- JWT

\- Observability

\- Micrometer

\- OpenTelemetry

\- Native Images

\- GraalVM

\- Docker

\- Cloud

\- Kubernetes

\- Virtual Threads



\---



\# 🔄 Evoluzione delle tecnologie



Uno degli obiettivi principali del progetto è capire l'evoluzione.



\## Configurazione



```text

XML

&#x20; ↓

Java Config

&#x20; ↓

Annotations

&#x20; ↓

Spring Boot

&#x20; ↓

Auto Configuration

```



\---



\## Accesso al database



```text

JDBC

&#x20; ↓

JdbcTemplate

&#x20; ↓

Spring Data JDBC

&#x20; ↓

JPA / Hibernate

&#x20; ↓

Spring Data JPA

```



\---



\## HTTP Client



```text

RestTemplate

&#x20;      ↓

WebClient

&#x20;      ↓

HTTP Interface Client

```



\---



\## MVC



```text

dispatcher-servlet.xml

&#x20;      ↓

Spring MVC annotations

&#x20;      ↓

Spring Boot MVC

&#x20;      ↓

@RestController

```



\---



\## Java EE / Jakarta



```text

javax.\*

&#x20;  ↓

jakarta.\*

```



Questo passaggio deve essere studiato anche dal punto di vista della \*\*migrazione di applicazioni esistenti\*\*.



\---



\# 🏗️ Struttura del repository



```text

spring-modern-evolution/

│

├── AGENT.md

├── README.md

├── pom.xml

│

├── docs/

│   ├── spring-history.md

│   ├── spring-boot-history.md

│   ├── java-compatibility.md

│   ├── migration-guide.md

│   └── glossary.md

│

├── lessons/

│   ├── 01-getting-started/

│   ├── 02-spring-core/

│   ├── 03-spel/

│   ├── 04-sqlrowset/

│   ├── 05-beans/

│   ├── 06-bean-scopes/

│   ├── 07-conditional-beans/

│   ├── 08-validation/

│   ├── 09-application-context/

│   ├── 10-resttemplate/

│   ├── 11-scheduling/

│   ├── 12-lazy-initialization/

│   ├── 13-property-source/

│   ├── 14-dependency-injection/

│   ├── 15-jdbctemplate/

│   ├── 16-soap/

│   ├── 17-profiles/

│   └── 18-dispatcher-servlet/

│

├── spring-boot/

│   ├── 01-hello-world/

│   ├── 02-rest-api/

│   ├── 03-configuration/

│   ├── 04-database/

│   ├── 05-jpa/

│   ├── 06-validation/

│   ├── 07-exception-handling/

│   ├── 08-testing/

│   ├── 09-security/

│   ├── 10-actuator/

│   ├── 11-docker/

│   └── 12-production/

│

├── migrations/

│   ├── spring-2-to-3/

│   ├── spring-boot-1-to-2/

│   ├── spring-boot-2-to-3/

│   ├── spring-boot-3-to-4/

│   └── javax-to-jakarta/

│

└── exercises/

&#x20;   ├── beginner/

&#x20;   ├── intermediate/

&#x20;   └── advanced/

```



\---



\# 🧪 Metodo didattico



Ogni modulo deve contenere:



```text

01 - Concetto

02 - Perché esiste

03 - Esempio minimo

04 - Esempio reale

05 - Codice

06 - Test

07 - Errori comuni

08 - Esercizio

09 - Soluzione

10 - Evoluzione nelle versioni successive

```



L'obiettivo è evitare il classico approccio:



> "Copia questo codice e funziona."



Il progetto deve invece spiegare:



> \*\*"Perché Spring funziona in questo modo?"\*\*



\---



\# 🧩 Primo esempio



Un'applicazione Java tradizionale:



```java

public class UserService {



&#x20;   private UserRepository repository;



&#x20;   public UserService() {

&#x20;       this.repository = new UserRepository();

&#x20;   }

}

```



introduce un forte accoppiamento.



Con Dependency Injection:



```java

@Service

public class UserService {



&#x20;   private final UserRepository repository;



&#x20;   public UserService(UserRepository repository) {

&#x20;       this.repository = repository;

&#x20;   }

}

```



Spring gestisce la creazione e l'iniezione della dipendenza.



Questo esempio rappresenta uno dei concetti fondamentali dell'intero percorso:



```text

new

&#x20;↓

IoC

&#x20;↓

Dependency Injection

&#x20;↓

Spring Container

```



\---



\# 🌐 Primo esempio REST



```java

@RestController

@RequestMapping("/api/users")

public class UserController {



&#x20;   @GetMapping

&#x20;   public List<UserDto> getUsers() {

&#x20;       return service.findAll();

&#x20;   }

}

```



La richiesta:



```text

GET /api/users

```



attraversa:



```text

HTTP

&#x20;↓

DispatcherServlet

&#x20;↓

Controller

&#x20;↓

Service

&#x20;↓

Repository

&#x20;↓

Database

```



Questo flusso verrà utilizzato come filo conduttore durante tutto il repository.



\---



\# 🗄️ Database



Il percorso parte da JDBC:



```text

Connection

Statement

ResultSet

```



passa per:



```text

JdbcTemplate

```



e arriva a:



```text

JPA

&#x20;↓

Hibernate

&#x20;↓

Spring Data JPA

```



Database utilizzati negli esempi:



\- H2 per gli esempi semplici;

\- PostgreSQL per l'applicazione reale.



\---



\# 🔐 Security



La sicurezza viene introdotta progressivamente:



```text

Authentication

&#x20;      ↓

Authorization

&#x20;      ↓

Roles

&#x20;      ↓

Authorities

&#x20;      ↓

Password hashing

&#x20;      ↓

Spring Security

&#x20;      ↓

JWT

&#x20;      ↓

OAuth2

```



Non partire direttamente da JWT senza avere prima compreso il modello di sicurezza di Spring.



\---



\# 🧪 Testing



Il progetto deve insegnare diversi livelli di test:



```text

Unit Test

&#x20;   ↓

Mockito

&#x20;   ↓

Spring Test

&#x20;   ↓

MockMvc

&#x20;   ↓

@SpringBootTest

&#x20;   ↓

Testcontainers

```



Esempio:



```java

@SpringBootTest

class UserServiceTest {



&#x20;   @Test

&#x20;   void shouldFindUser() {

&#x20;       // ...

&#x20;   }

}

```



\---



\# 📦 Docker



L'applicazione finale deve poter essere eseguita in container:



```text

Spring Boot

&#x20;    ↓

JAR

&#x20;    ↓

Docker Image

&#x20;    ↓

Container

&#x20;    ↓

PostgreSQL

```



\---



\# 📊 Observability



Per applicazioni moderne:



```text

Application

&#x20;    │

&#x20;    ├── Logs

&#x20;    ├── Metrics

&#x20;    └── Traces

&#x20;            ↓

&#x20;      Observability

```



Tecnologie da studiare:



\- Spring Boot Actuator

\- Micrometer

\- OpenTelemetry

\- tracing

\- health checks

\- metrics



\---



\# 🏆 Progetto finale



\## Employee Management System



L'applicazione finale riunisce le tecnologie studiate.



\### Architettura



```text

&#x20;                 ┌──────────────┐

&#x20;                 │    Client    │

&#x20;                 └──────┬───────┘

&#x20;                        │

&#x20;                        ▼

&#x20;                 ┌──────────────┐

&#x20;                 │ REST API     │

&#x20;                 │ Controller   │

&#x20;                 └──────┬───────┘

&#x20;                        │

&#x20;                        ▼

&#x20;                 ┌──────────────┐

&#x20;                 │   Service    │

&#x20;                 └──────┬───────┘

&#x20;                        │

&#x20;                        ▼

&#x20;                 ┌──────────────┐

&#x20;                 │ Repository   │

&#x20;                 │ Spring Data  │

&#x20;                 └──────┬───────┘

&#x20;                        │

&#x20;                        ▼

&#x20;                 ┌──────────────┐

&#x20;                 │ PostgreSQL   │

&#x20;                 └──────────────┘

```



\### API



```text

GET    /api/employees

GET    /api/employees/{id}



POST   /api/employees



PUT    /api/employees/{id}



DELETE /api/employees/{id}

```



\### Tecnologie



\- Java 21

\- Spring Boot

\- Spring MVC

\- Spring Data JPA

\- Hibernate

\- PostgreSQL

\- Bean Validation

\- Spring Security

\- JUnit

\- Mockito

\- Testcontainers

\- Actuator

\- Docker



\---



\# 📈 Evoluzione delle versioni



Il repository mantiene una documentazione separata per l'evoluzione:



| Generazione | Spring | Java | Focus |

|---|---|---|---|

| Spring storico | 4/5.x | 7/8+ | XML, Core, MVC |

| Spring Boot 1/2 | 4/5.x | 8+ | Auto Configuration |

| Spring Boot 3 | 6.x | 17+ | Jakarta |

| Spring Boot moderno | 6.x | 17/21+ | REST, Security, Observability |

| Spring Boot 4 | 7.x | versione richiesta | nuove API e modernizzazione |



> \*\*Nota:\*\* versioni, requisiti Java e compatibilità devono essere verificati sulla documentazione ufficiale prima di aggiornare la tabella.



\---



\# 🛠️ Requisiti



Per seguire il percorso sono consigliati:



```text

Java 21

Maven

Git

Docker

PostgreSQL

IDE / VS Code / IntelliJ IDEA

```



Verificare:



```bash

java -version

```



```bash

mvn -version

```



```bash

docker --version

```



\---



\# ▶️ Esecuzione



Per compilare:



```bash

mvn clean test

```



Per avviare Spring Boot:



```bash

mvn spring-boot:run

```



Per creare il JAR:



```bash

mvn clean package

```



\---



\# 🎓 Obiettivo finale



Al termine del percorso dovresti essere in grado di:



\- comprendere Spring Core;

\- capire IoC e Dependency Injection;

\- creare e configurare Bean;

\- comprendere `ApplicationContext`;

\- leggere `dispatcher-servlet.xml`;

\- lavorare con Spring MVC;

\- utilizzare `JdbcTemplate`;

\- comprendere JPA e Hibernate;

\- creare REST API;

\- utilizzare Spring Data;

\- gestire validation;

\- gestire exception;

\- configurare Profiles;

\- utilizzare Spring Security;

\- scrivere test;

\- utilizzare Actuator;

\- utilizzare Docker;

\- comprendere Java 21;

\- comprendere la migrazione `javax → jakarta`;

\- leggere codice Spring legacy;

\- modernizzare applicazioni Spring;

\- sviluppare applicazioni Spring Boot moderne.



\---



\# 🧭 La filosofia del repository



Il percorso segue una regola semplice:



```text

NON SOLO:

"Come si fa?"

```



ma soprattutto:



```text

"Perché si fa così?"

```



e:



```text

"Come veniva fatto prima?"

```



fino a:



```text

"Come si fa oggi?"

```



La roadmap completa diventa quindi:



```text

&#x20;       SPRING

&#x20;          │

&#x20;          ▼

&#x20;     SPRING CORE

&#x20;          │

&#x20;          ▼

&#x20;      IoC / DI

&#x20;          │

&#x20;          ▼

&#x20;   SPRING MVC / JDBC

&#x20;          │

&#x20;          ▼

&#x20;     SPRING BOOT

&#x20;          │

&#x20;          ▼

&#x20;   REST / JPA / TEST

&#x20;          │

&#x20;          ▼

&#x20;       JAVA 21

&#x20;          │

&#x20;          ▼

&#x20;  SPRING BOOT 3 / 4

&#x20;          │

&#x20;          ▼

&#x20;JAKARTA / SECURITY /

&#x20;OBSERVABILITY / CLOUD

&#x20;          │

&#x20;          ▼

&#x20;  APPLICAZIONE REALE

```



\*\*Dal codice legacy al codice moderno.  

Dalla teoria al codice reale.\*\*

"# springBoot-Agent" 
