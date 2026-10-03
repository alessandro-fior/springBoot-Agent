# 11 - Task Execution and Scheduling

## 1. Obiettivo
Imparare `@Async` e `@Scheduled`. Concetti: executor, thread pool, fixedRate/fixedDelay/cron.

## 2. Concetto
Esecuzione asincrona e pianificata gestita dal container.

## 3. Perché serve
Task in background, batch, pulizia, reportistica.

## 4. Esempio minimo
```java
@Scheduled(fixedRate=5000)
public void run(){ ... }

@Async
public void async(){ ... }
```

## 5. Codice
- `AppConfig.java` (@EnableScheduling, @EnableAsync)
- `ScheduledTask.java`
- `AsyncTask.java`
- `SchedulingApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.SchedulingApp"
```

## 7. Output atteso
```text
Async started: ...
Async done
Scheduled: ...
Scheduled: ...
Scheduled: ...
Main done
```

## 8. Versione storica
Spring 3.0+ supporta scheduling/async.

## 9. Versione moderna
Configurabile con `TaskExecutor`/`TaskScheduler` custom. In Spring Boot facile via properties.

## 10. Errori comuni
- Dimenticare @EnableScheduling/@EnableAsync
- @Async non funziona se chiamato dallo stesso bean
- Concorrenza, metodi pubblici preferiti

## 11. Esercizio
Prova cron: `@Scheduled(cron="*/2 * * * * ?")` (concettuale).

## 12. Soluzione
Mostra differenza fixedRate vs fixedDelay.

## 13. Cosa imparare prima di continuare
Thread, executor, scheduling patterns.

---

**Da dove arriva?** Simile a Quartz ma integrato in Spring Core.

**Perché è stata introdotta?** Per evitare integrare librerie esterne per task semplici.

**Come si fa oggi?** Standard in Spring Boot per job semplici; Quartz per enterprise.
