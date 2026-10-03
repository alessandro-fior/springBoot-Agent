# 07 - Conditional Bean Registration

## 1. Obiettivo
Capire `@Conditional`, `@Profile`, `@ConditionalOnProperty`, `@ConditionalOnClass`, `@ConditionalOnMissingBean` - collegamento ad Auto Configuration.

## 2. Concetto
Registra bean solo se condizioni sono vere.

## 3. Perché serve
Configurazioni per ambienti diversi, feature flag, compatibilità librerie.

## 4. Esempio minimo
```java
@Bean
@Profile("dev")
public DataSource devDs() { ... }

@Bean
@ConditionalOnProperty(name="feature.enabled", havingValue="true")
public FeatureService fs() { ... }
```

## 5. Codice
- `MyService`, `DevService`, `ProdService`
- `AppConfig.java` (usa @Profile)
- `ConditionalApp.java` (attiva profilo dev)

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.ConditionalApp"
```

## 7. Output atteso
```text
dev
```

## 8. Versione storica
@Profile introdotto prima; @Conditional più generale (Spring 4.0).

## 9. Versione moderna
Base fondamentale per Spring Boot Auto Configuration (condizioni su classpath/proprietà).

## 10. Errori comuni
- Nessun profilo attivo -> nessun bean corrisponde
- Condizioni troppo rigide
- Confondere @Profile (ambiente) con altre conditionali

## 11. Esercizio
Prova con `prod` (cambia property) e verifica.

## 12. Soluzione
Cambia a `spring.profiles.active=prod` -> `prod`.

## 13. Cosa imparare prima di continuare
Differenza @Profile vs @Conditional. Concetto chiave per capire Auto Configuration in Spring Boot.

---

**Da dove arriva?** Necessità di configurazioni condizionali per ambienti.

**Perché è stata introdotta?** Evita bean non necessari/config diversi.

**Come si fa oggi?** Estensivamente usata in Spring Boot starter.
