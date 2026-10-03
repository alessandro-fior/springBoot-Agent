# 18 - DispatcherServlet / dispatcher-servlet.xml

## 1. Obiettivo
Capire architettura Spring MVC storica: DispatcherServlet, HandlerMapping, ViewResolver. Passaggio da XML a Spring Boot.

## 2. Concetto
DispatcherServlet = Front Controller. Riceve tutte le richieste HTTP e le instrada ai controller.

## 3. Perché serve
Spiegare come funzionava MVC prima di Spring Boot (importante per legacy).

## 4. Esempio minimo

**Storico (web.xml)**
```xml
<servlet>
  <servlet-name>dispatcher</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
</servlet>
<servlet-mapping>
  <servlet-name>dispatcher</servlet-name>
  <url-pattern>/</url-pattern>
</servlet-mapping>
```

**dispatcher-servlet.xml**
```xml
<context:component-scan base-package="com.example"/>
<mvc:annotation-driven/>
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"/>
```

**Moderno (Spring Boot)**
```java
@SpringBootApplication
public class App { public static void main(String[] args){ SpringApplication.run(App.class,args); } }
@RestController
public class Ctrl { @GetMapping("/hi") String hi(){ return "hi"; } }
```

## 5. Codice
- `DispatcherConceptApp.java` (spiegazione concettuale)

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.DispatcherConceptApp"
```

## 7. Output atteso
Flusso e spiegazione completa.

## 8. Versione storica
Spring MVC con XML (2.x-4.x).

## 9. Versione moderna
Spring MVC auto-configurato da Spring Boot. Concetti restano identici.

## 10. Errori comuni
- Confondere ApplicationContext e WebApplicationContext
- Pensare Spring Boot elimini MVC (lo auto-configura)
- Dimenticare annotazioni MVC

## 11. Esercizio
Disegna flusso richiesta HTTP attraverso MVC.

## 12. Soluzione
Request → DispatcherServlet → HandlerMapping → Controller → Service → Repo → Response/View.

## 13. Cosa imparare prima di continuare
Spring Boot non sostituisce MVC, lo incapsula e auto-configura. Base per REST in Spring Boot.

---

**Da dove arriva?** Front Controller pattern (GoF). Implementato in Spring MVC.

**Perché è stata introdotta?** Punto unico di ingresso per richieste web, gestione centralizzata.

**Come si fa oggi?** Auto-configurato in Spring Boot; visibile concettualmente ma non configurato manualmente.
