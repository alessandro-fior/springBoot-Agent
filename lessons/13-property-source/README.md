# 13 - Property Source

## 1. Obiettivo
Caricare proprietà da file: `@PropertySource`, `@Value("${...}")`, confronto con `@ConfigurationProperties` (Spring Boot).

## 2. Concetto
Centralizza configurazione esterna (ambiente, dev/prod).

## 3. Perché serve
Separare configurazione da codice. Evita hardcoding.

## 4. Esempio minimo
```java
@PropertySource("classpath:app.properties")
@Value("${app.name}")
private String name;
```

## 5. Codice
- `application.properties`
- `AppConfig.java` (+ PropertySourcesPlaceholderConfigurer)
- `AppProperties.java` (@Value)
- `PropertySourceApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.PropertySourceApp"
```

## 7. Output atteso
```text
AppProperties{name='SpringPropertyDemo', version='1.0.0', port=8080}
```

## 8. Versione storica
Spring 3.1+ introduce `@PropertySource`.

## 9. Versione moderna
In Spring Boot si usa `application.properties/yml` automaticamente + `@ConfigurationProperties` per binding strutturato (tipato, type-safe).

## 10. Errori comuni
- Mancato PropertySourcesPlaceholderConfigurer per @Value
- File non trovato in classpath
- Typo nelle chiavi

## 11. Esercizio
Aggiungi `@ConfigurationProperties(prefix="app")` equivalente (concettuale).

## 12. Soluzione
Mostra confronto: `@Value` (puntuale) vs `@ConfigurationProperties` (strutturato, preferito in Spring Boot).

## 13. Cosa imparare prima di continuare
Preferire `@ConfigurationProperties` per gruppi di proprietà in applicazioni moderne.

---

**Da dove arriva?** Necessità di externalizzazione configurazione (12-Factor App).

**Perché è stata introdotta?** Flessibilità tra ambienti.

**Come si fa oggi?** Spring Boot + `application.yml/properties` + `@ConfigurationProperties` + profiles.
