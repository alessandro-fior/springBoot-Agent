# 03 - Spring Expression Language (SpEL)

## 1. Obiettivo
Imparare a usare SpEL per valutare espressioni, accedere a proprietà, metodi, operatori e valori tramite `@Value("#{...}")`.

## 2. Concetto
SpEL è un linguaggio di espressioni potente che permette di iniettare valori dinamici e calcolati nei bean.

## 3. Perché serve
- Calcoli inline
- Accesso a metodi/bean esistenti
- Condizioni
- Iniezione flessibile senza hardcoding

## 4. Esempio minimo
```java
@Value("#{2 + 3}")
private int value; // 5
```

## 5. Codice
- `Calculator.java`
- `AppConfig.java`
- `SpelApp.java` (include anche uso programmatico con SpelExpressionParser)

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.SpelApp"
```

## 7. Output atteso
Esempio simile:
```text
SpelValues[sum=5, result=12, upper=HELLO, pi=3.141592653589793, status=OK]
SpEL Works
200
```

## 8. Versione storica
SpEL è stato introdotto in Spring 3.x; concetto simile ad altri EL ma integrato con container.

## 9. Versione moderna
Oggi SpEL si usa ancora in `@Value`, in Security, in AOP, in alcune configurazioni.

## 10. Errori comuni
- Sintassi errata in `#{...}`
- Tentare di accedere a bean non visibili
- Tipo non coerente

## 11. Esercizio
1. Inietta `@Value("#{calculator.add(10,20)}")`
2. Usa espressione condizionale: se > 15 stampa "HIGH"
3. Estrai lunghezza stringa: `#{'spring'.length()}`

## 12. Soluzione
```java
@Value("#{calculator.add(10,20)}") int total;
@Value("#{total > 15 ? 'HIGH' : 'LOW'}") String level;
@Value("#{'spring'.length()}") int len;
```

## 13. Cosa imparare prima di continuare
- Differenza tra proprietà `${}` e SpEL `#{}`
- Accesso a bean: `@beanName.method()`
- Uso in annotation
- Parser programmatico base

---

**Da dove arriva?** Introdotto in Spring Framework 3.0.

**Perché è stata introdotta?** Per avere un EL unificato e potente per configurazione/condizioni.

**Come si fa oggi?** Via `@Value("#{...}")`, `ExpressionParser`, contestualmente in Spring Boot.
