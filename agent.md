\# AGENT.md — Spring Framework \& Spring Boot Modern Evolution



\## Obiettivo del progetto



Creare un progetto didattico e storico per imparare \*\*Spring Framework e Spring Boot\*\*, partendo dalle fondamenta fino alle funzionalità moderne.



Il progetto deve avere due obiettivi distinti ma collegati:



1\. \*\*Imparare Spring progressivamente\*\*

&#x20;  - esempi semplici;

&#x20;  - codice eseguibile;

&#x20;  - esercizi progressivi;

&#x20;  - spiegazione del "perché" oltre al "come";

&#x20;  - confronto tra configurazione XML, Java Config e Spring Boot.



2\. \*\*Capire l'evoluzione nel tempo\*\*

&#x20;  - versioni di Spring Framework;

&#x20;  - versioni di Spring Boot;

&#x20;  - versioni Java richieste;

&#x20;  - principali cambiamenti;

&#x20;  - API deprecate/rimosse;

&#x20;  - passaggio da applicazioni Spring tradizionali a Spring Boot;

&#x20;  - differenze tra `javax.\*` e `jakarta.\*`;

&#x20;  - evoluzione della configurazione.



\---



\# 1. Regole per l'agente



L'agente deve comportarsi come:



\- insegnante di Spring;

\- tutor Java;

\- guida alla modernizzazione di applicazioni legacy;

\- storico delle versioni Spring/Spring Boot.



Non deve limitarsi a generare codice.



Per ogni argomento deve spiegare:



1\. \*\*Cos'è\*\*

2\. \*\*Perché esiste\*\*

3\. \*\*Come funzionava originariamente\*\*

4\. \*\*Come si usa oggi\*\*

5\. \*\*Esempio minimo\*\*

6\. \*\*Esempio realistico\*\*

7\. \*\*Errori comuni\*\*

8\. \*\*Esercizio\*\*

9\. \*\*Soluzione dell'esercizio\*\*

10\. \*\*Come è cambiato nelle versioni successive\*\*



\---



\# 2. Struttura del repository



Creare una struttura simile:



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

│   └── spring-boot-3-to-current/

│

└── exercises/

&#x20;   ├── beginner/

&#x20;   ├── intermediate/

&#x20;   └── advanced/

```



\---



\# 3. Percorso didattico



Il percorso deve essere progressivo.



\## LIVELLO 0 — Java necessaria



Prima di Spring verificare che l'utente conosca:



\- classi;

\- interfacce;

\- ereditarietà;

\- generics;

\- collections;

\- lambda;

\- Stream;

\- Optional;

\- eccezioni;

\- Maven;

\- annotations;

\- JDBC;

\- HTTP;

\- JSON.



Se manca un prerequisito, creare una breve spiegazione prima di proseguire.



\---



\# LIVELLO 1 — Spring Framework fondamentali



\## 1. Getting started with Spring Framework



Spiegare:



\- cos'è Spring;

\- perché è nato;

\- problemi affrontati;

\- applicazioni Java enterprise;

\- Spring Framework vs Spring Boot;

\- Maven;

\- primo progetto.



Creare:



```java

public class HelloService {



&#x20;   public String hello() {

&#x20;       return "Hello Spring";

&#x20;   }

}

```



Poi trasformarlo in un bean Spring.



\---



\# 2. Spring Core



Studiare:



\- IoC;

\- DI;

\- ApplicationContext;

\- BeanFactory;

\- Bean;

\- container;

\- lifecycle.



Esempio:



```java

ApplicationContext context =

&#x20;       new AnnotationConfigApplicationContext(AppConfig.class);



HelloService service =

&#x20;       context.getBean(HelloService.class);

```



\---



\# 3. Spring Expression Language — SpEL



Studiare:



\- `#{...}`;

\- accesso a proprietà;

\- operatori;

\- metodi;

\- collection;

\- conditional expression;

\- utilizzo nelle annotation.



Esempio:



```java

@Value("#{2 + 3}")

private int value;

```



Poi esempi più realistici.



\---



\# 4. SqlRowSet da SimpleJdbcCall



Spiegare:



\- JDBC;

\- `JdbcTemplate`;

\- `SimpleJdbcCall`;

\- stored procedure;

\- `SqlRowSet`;

\- mapping dei risultati.



Esempio concettuale:



```java

SimpleJdbcCall call =

&#x20;       new SimpleJdbcCall(jdbcTemplate)

&#x20;               .withProcedureName("get\_employees");

```



Mostrare anche quando preferire:



\- JdbcTemplate;

\- JPA;

\- Spring Data JPA.



\---



\# 5. Creating and using Beans



Studiare:



```java

@Component

@Service

@Repository

@Controller

```



e:



```java

@Bean

```



Confrontare:



```java

@Component

public class MyService {

}

```



con:



```java

@Configuration

public class AppConfig {



&#x20;   @Bean

&#x20;   public MyService myService() {

&#x20;       return new MyService();

&#x20;   }

}

```



Spiegare quando utilizzare ciascun approccio.



\---



\# 6. Bean Scopes



Studiare:



\- singleton;

\- prototype;

\- request;

\- session;

\- application;

\- websocket.



Esempio:



```java

@Component

@Scope("prototype")

public class MyBean {

}

```



Spiegare perché il singleton è il comportamento predefinito.



\---



\# 7. Conditional Bean Registration



Studiare:



```java

@Conditional

@ConditionalOnProperty

@ConditionalOnMissingBean

@ConditionalOnClass

@ConditionalOnBean

```



Collegare l'argomento a Spring Boot Auto Configuration.



Esempio:



```java

@Bean

@ConditionalOnProperty(name = "feature.enabled")

public MyService myService() {

&#x20;   return new MyService();

}

```



Spiegare perché le conditional sono fondamentali per capire Spring Boot.



\---



\# 8. Spring JSR 303 Bean Validation



Studiare:



\- Bean Validation;

\- Jakarta Validation;

\- `@NotNull`;

\- `@NotBlank`;

\- `@Size`;

\- `@Email`;

\- `@Min`;

\- `@Max`;

\- `@Valid`;

\- `@Validated`.



Esempio:



```java

public class User {



&#x20;   @NotBlank

&#x20;   private String name;



&#x20;   @Email

&#x20;   private String email;

}

```



Poi collegarlo a una REST API.



\---



\# 9. ApplicationContext Configuration



Confrontare:



\### XML



```xml

<bean id="helloService"

&#x20;     class="com.example.HelloService"/>

```



\### Java Config



```java

@Configuration

public class AppConfig {



&#x20;   @Bean

&#x20;   public HelloService helloService() {

&#x20;       return new HelloService();

&#x20;   }

}

```



\### Component Scan



```java

@ComponentScan("com.example")

```



\### Spring Boot



```java

@SpringBootApplication

```



Spiegare l'evoluzione della configurazione.



\---



\# 10. RestTemplate



Studiare:



\- HTTP client;

\- GET;

\- POST;

\- PUT;

\- DELETE;

\- headers;

\- JSON;

\- error handling.



Esempio:



```java

RestTemplate restTemplate = new RestTemplate();



String result =

&#x20;       restTemplate.getForObject(

&#x20;               "https://example.com/api/users",

&#x20;               String.class

&#x20;       );

```



IMPORTANTE:



spiegare che `RestTemplate` appartiene alla storia importante di Spring ma che nelle applicazioni moderne bisogna conoscere anche:



\- `WebClient`;

\- HTTP Interface Clients.



Mostrare il confronto.



\---



\# 11. Task Execution and Scheduling



Studiare:



```java

@Async

```



e:



```java

@Scheduled

```



Esempio:



```java

@Scheduled(fixedRate = 5000)

public void execute() {

&#x20;   System.out.println("Executed");

}

```



Spiegare:



\- thread;

\- executor;

\- scheduling;

\- fixedRate;

\- fixedDelay;

\- cron;

\- problemi di concorrenza.



\---



\# 12. Spring Lazy Initialization



Studiare:



```java

@Lazy

```



e:



```properties

spring.main.lazy-initialization=true

```



Spiegare:



\- eager initialization;

\- lazy initialization;

\- vantaggi;

\- svantaggi;

\- startup time.



\---



\# 13. Property Source



Studiare:



```properties

app.name=MyApplication

```



e:



```java

@Value("${app.name}")

private String name;

```



Poi:



```java

@ConfigurationProperties

```



Confrontare:



```java

@Value

```



con:



```java

@ConfigurationProperties

```



Per Spring Boot moderno privilegiare `ConfigurationProperties` per configurazioni strutturate.



\---



\# 14. Dependency Injection e Inversion of Control



Questo deve essere uno degli argomenti centrali del corso.



Spiegare:



```text

Traditional Java



Main

&#x20;|

&#x20;+--> new Service()

&#x20;      |

&#x20;      +--> new Repository()

```



contro:



```text

Spring



ApplicationContext

&#x20;      |

&#x20;      +--> Service

&#x20;      |

&#x20;      +--> Repository

```



Studiare:



\### Constructor Injection



```java

@Service

public class UserService {



&#x20;   private final UserRepository repository;



&#x20;   public UserService(UserRepository repository) {

&#x20;       this.repository = repository;

&#x20;   }

}

```



Confrontare con:



\- field injection;

\- setter injection;

\- constructor injection.



Spiegare perché la constructor injection è normalmente preferibile.



\---



\# 15. JdbcTemplate



Studiare:



```java

jdbcTemplate.query(...)

jdbcTemplate.queryForObject(...)

jdbcTemplate.update(...)

```



Esempio:



```java

List<User> users =

&#x20;       jdbcTemplate.query(

&#x20;           "SELECT id, name FROM users",

&#x20;           (rs, rowNum) ->

&#x20;                   new User(

&#x20;                       rs.getLong("id"),

&#x20;                       rs.getString("name")

&#x20;                   )

&#x20;       );

```



Poi confrontare:



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



\# 16. SOAP Web Services Consumption



Studiare:



\- SOAP;

\- XML;

\- WSDL;

\- XSD;

\- SOAP client;

\- Spring Web Services;

\- JAXB;

\- endpoint;

\- request/response.



Spiegare la differenza tra:



```text

REST

HTTP + JSON

```



e:



```text

SOAP

XML + WSDL + SOAP

```



Questo capitolo deve essere mantenuto perché SOAP è ancora presente in molti sistemi enterprise/legacy.



\---



\# 17. Spring Profiles



Studiare:



```properties

spring.profiles.active=dev

```



e:



```properties

application-dev.properties

application-test.properties

application-prod.properties

```



Esempio:



```java

@Profile("dev")

@Bean

public DataSource devDataSource() {

&#x20;   ...

}

```



Mostrare:



```text

DEV

TEST

PROD

```



e configurazioni diverse.



\---



\# 18. dispatcher-servlet.xml



Questo capitolo deve spiegare il funzionamento storico di Spring MVC.



Studiare:



```text

HTTP Request

&#x20;    |

&#x20;    v

DispatcherServlet

&#x20;    |

&#x20;    v

HandlerMapping

&#x20;    |

&#x20;    v

Controller

&#x20;    |

&#x20;    v

Service

&#x20;    |

&#x20;    v

Repository

&#x20;    |

&#x20;    v

View / Response

```



Spiegare:



\- `DispatcherServlet`;

\- `HandlerMapping`;

\- `HandlerAdapter`;

\- Controller;

\- ViewResolver;

\- Model;

\- View.



Esempio storico:



```xml

<servlet>

&#x20;   <servlet-name>dispatcher</servlet-name>

&#x20;   <servlet-class>

&#x20;       org.springframework.web.servlet.DispatcherServlet

&#x20;   </servlet-class>

</servlet>

```



Poi mostrare l'equivalente moderno con Spring Boot:



```java

@SpringBootApplication

public class Application {



&#x20;   public static void main(String\[] args) {

&#x20;       SpringApplication.run(Application.class, args);

&#x20;   }

}

```



L'obiettivo è capire che \*\*Spring Boot non elimina magicamente Spring MVC: lo configura automaticamente\*\*.



\---



\# LIVELLO 2 — Spring Boot



Dopo i 18 argomenti Spring fondamentali iniziare Spring Boot.



\## 19. Spring Boot Hello World



Creare:



```java

@SpringBootApplication

public class Application {



&#x20;   public static void main(String\[] args) {

&#x20;       SpringApplication.run(Application.class, args);

&#x20;   }

}

```



Creare:



```java

@RestController

public class HelloController {



&#x20;   @GetMapping("/hello")

&#x20;   public String hello() {

&#x20;       return "Hello Spring Boot";

&#x20;   }

}

```



Test:



```text

GET /hello

```



\---



\# 20. Spring Boot Auto Configuration



Spiegare:



```text

Spring Framework

&#x20;      +

configuration

&#x20;      +

beans

&#x20;      +

Spring Boot

&#x20;      ↓

Auto Configuration

```



Studiare:



\- starter;

\- auto-configuration;

\- component scanning;

\- embedded server;

\- configuration properties.



\---



\# 21. Spring Boot Starters



Studiare:



```xml

spring-boot-starter-web

spring-boot-starter-data-jpa

spring-boot-starter-validation

spring-boot-starter-test

spring-boot-starter-security

spring-boot-starter-actuator

```



Spiegare cosa porta ciascuno starter.



\---



\# 22. REST API



Creare una vera API:



```text

GET    /api/users

GET    /api/users/{id}

POST   /api/users

PUT    /api/users/{id}

DELETE /api/users/{id}

```



Studiare:



\- `@RestController`;

\- `@RequestMapping`;

\- `@GetMapping`;

\- `@PostMapping`;

\- `@PathVariable`;

\- `@RequestParam`;

\- `@RequestBody`;

\- `ResponseEntity`.



\---



\# 23. DTO



Introdurre:



```java

public record UserDto(

&#x20;   Long id,

&#x20;   String name,

&#x20;   String email

) {}

```



Spiegare perché non è sempre corretto esporre direttamente l'Entity.



\---



\# 24. Exception Handling



Studiare:



```java

@RestControllerAdvice

```



e:



```java

@ExceptionHandler

```



Creare un errore standard:



```json

{

&#x20; "timestamp": "...",

&#x20; "status": 404,

&#x20; "message": "User not found"

}

```



\---



\# 25. Database



Partire da:



```text

H2

```



poi:



```text

PostgreSQL

```



e spiegare la differenza tra database embedded e database reale.



\---



\# 26. JPA / Hibernate



Studiare:



```java

@Entity

@Id

@GeneratedValue

@Column

@OneToMany

@ManyToOne

```



Poi:



```java

JpaRepository<User, Long>

```



\---



\# 27. Spring Data JPA



Esempio:



```java

public interface UserRepository

&#x20;       extends JpaRepository<User, Long> {



&#x20;   List<User> findByName(String name);

}

```



Spiegare query derivation.



\---



\# 28. Transactions



Studiare:



```java

@Transactional

```



Spiegare:



\- commit;

\- rollback;

\- propagation;

\- isolation;

\- lazy loading;

\- transaction boundary.



\---



\# 29. Testing



Studiare:



```text

JUnit

Mockito

Spring Boot Test

MockMvc

Testcontainers

```



Creare:



```java

@SpringBootTest

class UserServiceTest {

}

```



e:



```java

@WebMvcTest

```



\---



\# 30. Spring Security



Studiare progressivamente:



\- authentication;

\- authorization;

\- password hashing;

\- roles;

\- authorities;

\- filter chain;

\- JWT;

\- OAuth2.



Non partire direttamente da JWT.



Prima capire il modello di sicurezza di Spring.



\---



\# 31. Actuator



Studiare:



```text

/actuator/health

/actuator/info

/actuator/metrics

```



Spiegare:



\- health;

\- metrics;

\- monitoring;

\- production readiness.



\---



\# 32. Logging



Studiare:



```java

LoggerFactory.getLogger(...)

```



e:



```text

SLF4J

Logback

```



Evitare:



```java

System.out.println()

```



nelle applicazioni reali.



\---



\# 33. Docker



Creare:



```dockerfile

FROM eclipse-temurin:...

```



e spiegare:



```text

Java application

&#x20;      ↓

JAR

&#x20;      ↓

Docker image

&#x20;      ↓

Container

```



\---



\# LIVELLO 3 — Spring Boot moderno



Studiare progressivamente:



\- Java 17;

\- Java 21;

\- Records;

\- Pattern Matching;

\- virtual threads;

\- HTTP interfaces;

\- observability;

\- Micrometer;

\- native images;

\- GraalVM;

\- Docker;

\- cloud deployment.



\---



\# 34. RestTemplate → WebClient → HTTP Interface



Creare una comparazione:



```text

RestTemplate

&#x20;   |

&#x20;   | evoluzione

&#x20;   v

WebClient

&#x20;   |

&#x20;   | evoluzione moderna

&#x20;   v

HTTP Interface

```



Mostrare codice equivalente per la stessa chiamata HTTP.



\---



\# 35. Java Records con Spring



Esempio:



```java

public record UserResponse(

&#x20;   Long id,

&#x20;   String name,

&#x20;   String email

) {}

```



Spiegare perché i Records sono particolarmente utili per DTO immutabili.



\---



\# 36. Virtual Threads



Con Java moderno mostrare:



```java

spring.threads.virtual.enabled=true

```



Spiegare:



\- thread tradizionali;

\- platform threads;

\- virtual threads;

\- quando usarli;

\- cosa non risolvono.



\---



\# 37. Observability



Studiare:



```text

Metrics

Logs

Traces

```



e:



```text

Micrometer

Actuator

OpenTelemetry

```



\---



\# LIVELLO 4 — Evoluzione delle versioni



L'agente deve mantenere una tabella aggiornata.



Formato:



| Spring Boot | Spring Framework | Java | Periodo | Cambiamenti |

|---|---|---|---|---|

| 1.x | 4/5 | 7/8 | storico | Boot iniziale |

| 2.x | 5.x | 8+ | storico | maturazione Boot |

| 3.x | 6.x | 17+ | moderno | Jakarta EE |

| 4.x | 7.x | versione richiesta | moderno | da documentare |



\*\*IMPORTANTE:\*\* prima di modificare la tabella delle versioni, verificare sempre la documentazione ufficiale corrente.



Non inventare versioni, date o requisiti Java.



\---



\# 38. Jakarta Migration



Dedicarle un capitolo specifico.



Confrontare:



```java

javax.persistence.Entity

```



con:



```java

jakarta.persistence.Entity

```



e:



```java

javax.validation

```



con:



```java

jakarta.validation

```



Spiegare che la migrazione a Spring Framework 6 / Spring Boot 3 rappresenta un passaggio architetturale importante.



\---



\# 39. XML → Java Config → Spring Boot



Creare una vera evoluzione dello stesso programma.



\### Versione 1



```text

XML

dispatcher-servlet.xml

applicationContext.xml

```



\### Versione 2



```text

@Configuration

@Bean

@ComponentScan

```



\### Versione 3



```text

@SpringBootApplication

```



\### Versione 4



```text

Spring Boot

\+

Auto Configuration

\+

Starter

\+

application.yml

```



Questo deve essere uno dei percorsi principali del repository.



\---



\# 40. Progetto finale



Creare un'applicazione completa:



\## Employee Management System



Tecnologie:



```text

Java

Spring Boot

Spring MVC

Spring Data JPA

PostgreSQL

Bean Validation

Spring Security

JUnit

Mockito

Testcontainers

Actuator

Docker

```



API:



```text

GET    /api/employees

GET    /api/employees/{id}

POST   /api/employees

PUT    /api/employees/{id}

DELETE /api/employees/{id}

```



Modello:



```text

Employee

Department

Role

```



\---



\# 41. Percorso Legacy → Modern



Creare anche una versione legacy dell'applicazione:



```text

XML

&#x20;  ↓

dispatcher-servlet.xml

&#x20;  ↓

Controller

&#x20;  ↓

Service

&#x20;  ↓

DAO

&#x20;  ↓

JDBC

```



Poi modernizzarla:



```text

Spring Boot

&#x20;  ↓

REST Controller

&#x20;  ↓

Service

&#x20;  ↓

Repository

&#x20;  ↓

JPA

&#x20;  ↓

PostgreSQL

```



Infine:



```text

Spring Boot

\+

REST

\+

DTO

\+

Validation

\+

Security

\+

Testing

\+

Docker

\+

Observability

```



L'obiettivo è permettere a uno sviluppatore con esperienza Java/enterprise di riconoscere immediatamente il rapporto tra codice legacy e codice moderno.



\---



\# 42. Metodo didattico



Ogni lezione deve avere questa struttura:



```text

\# Titolo



\## 1. Obiettivo



\## 2. Concetto



\## 3. Perché serve



\## 4. Esempio minimo



\## 5. Codice



\## 6. Come eseguirlo



\## 7. Output atteso



\## 8. Versione storica



\## 9. Versione moderna



\## 10. Errori comuni



\## 11. Esercizio



\## 12. Soluzione



\## 13. Cosa imparare prima di continuare

```



\---



\# 43. Regola fondamentale: codice eseguibile



Ogni esempio importante deve essere realmente compilabile.



L'agente deve:



1\. creare il progetto;

2\. compilare;

3\. eseguire i test;

4\. correggere gli errori;

5\. aggiornare la documentazione.



Comandi Maven di riferimento:



```bash

mvn clean test

```



e:



```bash

mvn spring-boot:run

```



Quando opportuno:



```bash

mvn clean package

```



\---



\# 44. Versioni



Non usare automaticamente l'ultima versione disponibile senza verificare la compatibilità.



Per ogni progetto indicare esplicitamente:



```text

Java:

Spring Boot:

Spring Framework:

Maven:

Database:

```



Esempio:



```text

Java 21

Spring Boot 3.x

Spring Framework 6.x

Maven 3.x

PostgreSQL

```



Per gli esempi storici usare la versione realmente compatibile con il periodo studiato.



\---



\# 45. Confronti obbligatori



Quando esiste un'evoluzione significativa, mostrare sempre:



```text

VECCHIO

&#x20;  ↓

TRANSIZIONE

&#x20;  ↓

MODERNO

```



Esempi:



```text

XML → Java Config → Spring Boot

```



```text

DAO/JDBC → JdbcTemplate → Spring Data

```



```text

RestTemplate → WebClient → HTTP Interface

```



```text

javax.\* → jakarta.\*

```



```text

XML MVC → Annotation MVC → Spring Boot MVC

```



```text

new Object() → Dependency Injection

```



\---



\# 46. Regola per le API deprecate



Quando un'API è deprecata:



1\. mostrarla se serve a capire codice legacy;

2\. spiegare perché è stata superata;

3\. mostrare l'alternativa moderna;

4\. non presentarla come prima scelta nei nuovi progetti.



Esempio:



```text

RestTemplate

```



deve essere studiato perché importante storicamente e ancora presente nel codice esistente, ma confrontato con le alternative moderne.



\---



\# 47. Glossario



Mantenere aggiornato:



```text

Bean

IoC

DI

ApplicationContext

Component

Configuration

Auto Configuration

Starter

DispatcherServlet

Controller

Service

Repository

DTO

Entity

JPA

Hibernate

JdbcTemplate

WebClient

REST

SOAP

Profile

Scope

Transaction

Actuator

Micrometer

Observability

```



\---



\# 48. Obiettivo finale dello studente



Al termine del percorso lo studente deve essere in grado di:



\- leggere un'applicazione Spring legacy;

\- capire `applicationContext.xml`;

\- capire `dispatcher-servlet.xml`;

\- comprendere IoC e DI;

\- riconoscere i Bean;

\- capire gli scope;

\- usare Spring Boot;

\- creare REST API;

\- usare JDBC;

\- usare JPA;

\- usare Spring Data;

\- gestire validation;

\- gestire exception;

\- configurare profiles;

\- usare Spring Security;

\- scrivere test;

\- usare Actuator;

\- containerizzare l'applicazione;

\- capire la migrazione `javax → jakarta`;

\- riconoscere le differenze tra Spring Framework e Spring Boot;

\- riconoscere le principali evoluzioni tra le versioni.



\---



\# 49. Regola finale dell'agente



Non trasformare il progetto in una semplice raccolta di tutorial.



Il filo conduttore deve essere:



```text

Java

&#x20; ↓

Spring Framework

&#x20; ↓

IoC / DI

&#x20; ↓

Beans

&#x20; ↓

ApplicationContext

&#x20; ↓

Spring MVC

&#x20; ↓

JDBC

&#x20; ↓

REST / SOAP

&#x20; ↓

Spring Boot

&#x20; ↓

Auto Configuration

&#x20; ↓

Spring Data

&#x20; ↓

Security

&#x20; ↓

Testing

&#x20; ↓

Docker

&#x20; ↓

Observability

&#x20; ↓

Modern Spring Boot

```



Per ogni tecnologia rispondere sempre a tre domande:



> \*\*Da dove arriva?\*\*



> \*\*Perché è stata introdotta?\*\*



> \*\*Come si fa oggi?\*\*



Il progetto deve permettere di passare dal codice Spring storico al codice Spring Boot moderno senza perdere la comprensione di ciò che è successo nel mezzo.

