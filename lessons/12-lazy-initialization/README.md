# 12 - Spring Lazy Initialization

## 1. Obiettivo
Capire eager vs lazy initialization. `@Lazy` e `spring.main.lazy-initialization`.

## 2. Concetto
- Eager: bean creato all'avvio context (default)
- Lazy: bean creato solo alla prima richiesta

## 3. Perché serve
Riduce startup time in applicazioni grandi; evita creazione bean non necessari.

## 4. Esempio minimo
```java
@Component
@Lazy
public class HeavyBean { ... }
```

## 5. Codice
- `EagerBean.java`
- `LazyBean.java`
- `AppConfig.java`
- `LazyApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.LazyApp"
```

## 7. Output atteso
```text
Creating context...
EagerBean created
Context created
Accessing LazyBean...
LazyBean created
LazyBean.hello()
```

## 8. Versione storica
Presente da tempo; in Spring Boot 2.2+ introdotta opzione globale lazy-init.

## 9. Versione moderna
`spring.main.lazy-initialization=true` rende tutto lazy (con eccezioni). Da usare con attenzione.

## 10. Errori comuni
- Aspettarsi lazy ma bean viene creato per dipendenza eager
- Ritardo errori al runtime invece che startup
- Confusione con bean scopes

## 11. Esercizio
Verifica effetto: rimuovi `@Lazy` e confronta ordine.

## 12. Soluzione
Senza `@Lazy`, LazyBean creato insieme ad EagerBean.

## 13. Cosa imparare prima di continuare
Trade-off: startup veloce vs fail-fast. Usare responsabilmente.

---

**Da dove arriva?** Ottimizzazioni per applicazioni enterprise complesse.

**Perché è stata introdotta?** Ridurre tempo avvio e memoria iniziale.

**Come si fa oggi?** `@Lazy` puntuale o globale in Spring Boot.
