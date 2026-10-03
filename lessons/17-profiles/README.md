# 17 - Spring Profiles

## 1. Obiettivo
Usare profili per configurazioni ambiente (dev/test/prod). `spring.profiles.active`, file specifici.

## 2. Concetto
Attiva bean/config diversi a seconda ambiente.

## 3. Perché serve
Database diversi, log livelli, feature flag per ambiente.

## 4. Esempio minimo
```java
@Component
@Profile("dev")
class DevConfig { ... }
```
```properties
spring.profiles.active=dev
application-dev.properties
```

## 5. Codice
- `application*.properties`
- `EnvService`, `DevEnv`, `ProdEnv`
- `AppConfig.java`
- `ProfileApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.ProfileApp"
```

## 7. Output atteso
```text
DEV
```

## 8. Versione storica
Spring 3.1 introduce profili.

## 9. Versione moderna
Fondamentale in Spring Boot. Supporta profili multipli, default, grouping.

## 10. Errori comuni
- Nessun bean corrisponde al profilo attivo (NoSuchBeanDefinition)
- Confondere profili con property condizionali
- Dimenticare default profile

## 11. Esercizio
Attiva `prod` e verifica output.

## 12. Soluzione
Cambia a `prod` -> `PROD`.

## 13. Cosa imparare prima di continuare
Separazione ambienti pulita; utile per CI/CD.

---

**Da dove arriva?** Necessità gestione ambienti multipli.

**Perché è stata introdotta?** Evita configurazioni hardcoded per ambiente.

**Come si fa oggi?** Ampiamente usato in Spring Boot (application-{profile}.yml).
