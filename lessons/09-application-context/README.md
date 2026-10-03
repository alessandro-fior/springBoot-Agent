# 09 - ApplicationContext Configuration

## 1. Obiettivo
Confrontare XML, Java Config, Component Scan, Spring Boot. Evoluzione configurazione.

## 2. Concetto
ApplicationContext è il container IoC. Può essere inizializzato in vari modi.

## 3. Perché serve
Diversi stili storici vs moderni. Importante capire legacy.

## 4. Esempio minimo

**XML**
```xml
<bean id="helloBean" class="com.example.HelloBean"/>
```
```java
ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
```

**Java Config**
```java
@Configuration
public class Cfg { @Bean HelloBean hb(){ return new HelloBean(); } }
new AnnotationConfigApplicationContext(Cfg.class);
```

**Component Scan**
```java
@ComponentScan("com.example")
```

**Spring Boot**
```java
@SpringBootApplication
```

## 5. Codice
- `HelloBean.java` (inner in esempio)
- `JavaCfg.java`
- `XmlConfigApp.java` (mostra confronto)

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.XmlConfigApp"
```

## 7. Output atteso
```text
hello
Java Config OK. XML equivalent: <bean id='helloBean' class='com.example.HelloBean'/>
```

## 8. Versione storica
XML predominante (Spring 1.x-2.x).

## 9. Versione moderna
Java Config + Annotation, poi Spring Boot semplifica.

## 10. Errori comuni
- File XML non trovato
- Mix confuso di stili
- Dimenticare base packages in ComponentScan

## 11. Esercizio
Crea `beans.xml` equivalente e prova ClassPathXmlApplicationContext (opzionale).

## 12. Soluzione
Aggiungi `src/main/resources/beans.xml`.

## 13. Cosa imparare prima di continuare
Evoluzione: XML → Java Config → Spring Boot. Capire perché si è evoluto.

---

**Da dove arriva?** Diversi approcci di configurazione nel tempo.

**Perché è stata introdotta?** Type-safe (Java Config), meno verboso, migliore IDE support.

**Come si fa oggi?** Principalmente Java Config + annotation; Spring Boot riduce tutto a main + auto-config.
