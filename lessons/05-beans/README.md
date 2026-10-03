# 05 - Creating and Using Beans

## 1. Obiettivo
Conoscere modi per creare bean: stereotype (`@Component`, `@Service`, `@Repository`, `@Controller`) e `@Bean`. Confrontarli.

## 2. Concetto
Bean = oggetto gestito dal container IoC.

## 3. Perché serve
Standardizza registrazione. `@Component` per detection automatica; `@Bean` per oggetti di terze parti o configurazione esplicita.

## 4. Esempio minimo
```java
@Service
public class MyService { ... }

@Bean
public MyService myService() { return new MyService(); }
```

## 5. Codice
- `MyRepository.java` (@Repository)
- `MyService.java` (@Service + constructor injection)
- `AppConfig.java` (@ComponentScan)
- `BeanApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.BeanApp"
```

## 7. Output atteso
```text
processed-data
```

## 8. Versione storica
XML `<bean>`.

## 9. Versione moderna
Stereotype + `@ComponentScan` o Java Config `@Bean`. In Spring Boot dominano auto-scan + configurazione.

## 10. Errori comuni
- Dimenticare `@ComponentScan`
- Registrare stessa classe in due modi
- Usare field injection invece di constructor (spesso sconsigliato)

## 11. Esercizio
Crea bean via `@Bean` puro (senza stereotype) replicando stesso comportamento.

## 12. Soluzione
```java
@Configuration
public class PureConfig {
  @Bean MyRepository repo(){ return new MyRepository(); }
  @Bean MyService svc(MyRepository r){ return new MyService(r); }
}
```

## 13. Cosa imparare prima di continuare
Quando usare `@Component` vs `@Bean`. Stereotype implicano ruolo semantico.

---

**Da dove arriva?** Bean concept centrale da Spring 1.x.

**Perché è stata introdotta?** Per dichiarare chiaramente oggetti gestiti dal container.

**Come si fa oggi?** Misto: stereotype per codice app, `@Bean` per librerie/config.
