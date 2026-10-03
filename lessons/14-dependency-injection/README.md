# 14 - Dependency Injection e Inversion of Control

## 1. Obiettivo
Differenziare IoC vs DI. Confrontare constructor/field/setter injection.

## 2. Concetto
- **IoC**: inversion of control - il container crea e gestisce oggetti
- **DI**: dependency injection - dipendenze vengono iniettate

## 3. Perché serve
Elimina `new` diretti, riduce accoppiamento, facilita test (mock).

## 4. Esempio minimo

**Tradizionale**
```java
class UserService {
  private UserRepository repo = new UserRepository(); // accoppiato
}
```

**Spring (constructor)**
```java
@Service
class UserService {
  private final UserRepository repo;
  public UserService(UserRepository repo){ this.repo=repo; } // iniettato
}
```

## 5. Codice
- `UserRepository.java`
- `UserService.java` (constructor injection)
- `AppConfig.java`
- `DiApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.DiApp"
```

## 7. Output atteso
```text
User-1
```

## 8. Versione storica
Concetti da Martin Fowler (2004) e Spring 1.x.

## 9. Versione moderna
Constructor injection preferito (immutabilità, test facilità, no NPE). Field injection sconsigliato.

## 10. Errori comuni
- Confondere IoC e DI (correlati ma non identici)
- Usare field injection eccessivamente
- Cicli di dipendenza

## 11. Esercizio
Prova setter injection e field injection (concettuale) - mostra pro/contro.

## 12. Soluzione
Constructor: obbliga dipendenze, immutabile. Setter: opzionali. Field: meno testabile.

## 13. Cosa imparare prima di continuare
"IoC è il principio, DI è il meccanismo". Container gestisce il grafico delle dipendenze.

---

**Da dove arriva?** Inversion of Control containers (IoC), Dependency Injection pattern.

**Perché è stata introdotta?** Per ottenere loose coupling, alta coesione.

**Come si fa oggi?** Constructor injection con Spring (raccomandato).
