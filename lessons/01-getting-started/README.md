# 01 - Getting Started with Spring Framework

## 1. Obiettivo
Comprendere cos'è Spring Framework, perché è nato e quali problemi risolve.

## 2. Concetto
Spring Framework è un framework Java open source per lo sviluppo di applicazioni enterprise. 
Il suo concetto fondamentale è l'**Inversion of Control (IoC)** e la **Dependency Injection (DI)**.

## 3. Perché serve
Prima di Spring, le applicazioni Java spesso creavano le dipendenze manualmente con `new`. Questo provocava:
- accoppiamento forte tra classi;
- difficoltà nei test;
- codice difficile da mantenere;
- poca flessibilità.

Spring risolve questi problemi delegando al container la creazione e l'iniezione delle dipendenze.

## 4. Esempio minimo
Applicazione Java tradizionale (fortemente accoppiata):

```java
public class HelloService {
    public String hello() {
        return "Hello Spring";
    }
}

public class HelloApp {
    public static void main(String[] args) {
        HelloService service = new HelloService();
        System.out.println(service.hello());
    }
}
```

Con Spring (debolmente accoppiata), il container crea il bean e lo gestisce.

## 5. Codice
Vedi i file:
- `HelloService.java`
- `AppConfig.java`
- `HelloApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.HelloApp"
```

## 7. Output atteso
```text
Hello Spring
```

## 8. Versione storica
Configurazione XML (storica):
```xml
<bean id="helloService" class="com.example.HelloService"/>
```

## 9. Versione moderna
Configurazione Java Config + Annotation:
```java
@Configuration
public class AppConfig {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
```

## 10. Errori comuni
- Dimenticare `@Configuration` sulla classe di configurazione
- Non specificare il package corretto in `AnnotationConfigApplicationContext`
- Usare `new` invece di chiedere il bean al context

## 11. Esercizio
1. Crea una classe `GreetingService` con metodo `greet(String name)`
2. Configurala come bean con Java Config
3. Recuperala dal context e stampa il risultato

## 12. Soluzione
Vedi `GreetingApp.java` nella cartella `solution/` (se presente)

## 13. Cosa imparare prima di continuare
- Differenza tra creazione manuale e IoC
- Concetto di Bean
- `ApplicationContext`
- Differenza tra XML, Java Config e approccio moderno

---

**Da dove arriva?** Da Spring Framework (2002-2004), ispirato a Rod Johnson e al libro "Expert One-on-One J2EE Design and Development".

**Perché è stata introdotta?** Per semplificare lo sviluppo enterprise Java riducendo l'accoppiamento.

**Come si fa oggi?** Con Spring Boot, ma i concetti (IoC/DI) sono gli stessi.