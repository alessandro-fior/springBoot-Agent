# 10 - RestTemplate

## 1. Obiettivo
Usare RestTemplate per chiamate HTTP (GET/POST). Confronto con WebClient/HTTP Interfaces.

## 2. Concetto
Client HTTP sincrono storico di Spring.

## 3. Perché serve
Molto usato in codice legacy. Importante conoscerlo prima di alternative moderne.

## 4. Esempio minimo
```java
RestTemplate rt = new RestTemplate();
String s = rt.getForObject("https://example.com", String.class);
```

## 5. Codice
- `AppConfig.java`
- `Post.java` (record)
- `RestTemplateApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.RestTemplateApp"
```

## 7. Output atteso
Se rete disponibile: stampa Post. Altrimenti messaggio concettuale (eseguibile comunque).

## 8. Versione storica
Spring 3+. Importante storicamente.

## 9. Versione moderna
In Spring 5+ preferire **WebClient** (reattivo/non bloccante). Spring 6+ introduce **HTTP Interface Clients** (declarativi). RestTemplate è in modalità di mantenimento.

## 10. Errori comuni
- No Jackson su classpath per deserializzazione JSON
- Gestione errori con ResponseErrorHandler
- Timeout non configurati

## 11. Esercizio
Mostra confronto: RestTemplate → WebClient → HTTP Interface (concettuale).

## 12. Soluzione
Vedi tabella evoluzione in agent.md.

## 13. Cosa imparare prima di continuare
È deprecato/mantenuto, ma **fondamentale per leggere codice legacy**.

---

**Da dove arriva?** Necessità client HTTP integrato in Spring.

**Perché è stata introdotta?** Semplifica chiamate REST rispetto a HttpURLConnection.

**Come si fa oggi?** WebClient (reattivo), HTTP Interfaces (declarativi) in applicazioni moderne. RestTemplate ancora visto in sistemi legacy.
