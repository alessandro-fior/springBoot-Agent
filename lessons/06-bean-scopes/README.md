# 06 - Bean Scopes

## 1. Obiettivo
Comprendere scope dei bean: singleton (default), prototype, request/session/application/websocket.

## 2. Concetto
Scope definisce il ciclo di vita e quante istanze vengono create.

## 3. Perché serve
Controllare condivisione stato: servizi stateless spesso singleton; oggetti con stato per richiesta (es. form) spesso prototype/request.

## 4. Esempio minimo
```java
@Component
@Scope("prototype")
public class MyBean {}
```

## 5. Codice
- `SingletonBean.java` (default)
- `PrototypeBean.java` (@Scope("prototype"))
- `AppConfig.java`
- `ScopeApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.ScopeApp"
```

## 7. Output atteso
```text
Singleton s1.increment=1, s2.increment=2
Prototype p1.increment=1, p2.increment=1
```

## 8. Versione storica
Già presenti in Spring 1.x (singleton/prototype). Altri scope legati a web context.

## 9. Versione moderna
In applicazioni web REST, spesso singleton per service/repo; request per DTO di richiesta temporanei o bean specifici.

## 10. Errori comuni
- Usare prototype in singleton senza accorgersene (injection fissa istanza)
- Confondere lifecycle
- Usare web-scope fuori da contesto web

## 11. Esercizio
Dimostra differenza chiaramente e spiega perché singleton è default.

## 12. Soluzione
Singleton condiviso -> stato accumula. Prototype nuovo ogni getBean -> stato indipendente.

## 13. Cosa imparare prima di continuare
- singleton vs prototype
- web scopes (request/session) - concetto generale
- lookup method/Provider se serve prototype in singleton

---

**Da dove arriva?** Pattern GoF + esigenze enterprise.

**Perché è stata introdotta?** Per bilanciare efficienza (singleton) e isolamento (prototype).

**Come si fa oggi?** @Scope con costanti o stringhe; in web, spesso gestito da framework.
