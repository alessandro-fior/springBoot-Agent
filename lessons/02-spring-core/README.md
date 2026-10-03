# 02 - Spring Core

## 1. Obiettivo
Comprendere IoC (Inversion of Control), DI (Dependency Injection), ApplicationContext, BeanFactory e il ciclo di vita dei Bean.

## 2. Concetto
Spring Core è il cuore del framework. Definisce come vengono creati, gestiti e iniettati gli oggetti (Bean). 

- **IoC**: il controllo della creazione degli oggetti viene spostato dal codice all'ApplicationContext.
- **DI**: le dipendenze vengono "iniettate" nel bean dal container, non create con `new`.

## 3. Perché serve
- Riduce l'accoppiamento tra classi
- Aumenta testabilità
- Centralizza la configurazione
- Favorisce riutilizzo e manutenibilità

## 4. Esempio minimo
Tradizionale (fortemente accoppiato):
```java
HelloService service = new HelloService();
```

Con Spring (debolmente accoppiato):
```java
ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
HelloService service = ctx.getBean(HelloService.class);
```

## 5. Codice
- `HelloService.java` - semplice POJO
- `AppConfig.java` - configurazione Java Config
- `HelloApp.java` - punto di ingresso

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.HelloApp"
```

## 7. Output atteso
```text
Hello Spring Core
```

## 8. Versione storica
XML (esempio):
```xml
<beans>
  <bean id="helloService" class="com.example.HelloService"/>
</beans>
ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
```

## 9. Versione moderna
Java Config:
```java
@Configuration
public class AppConfig {
  @Bean
  public HelloService helloService() { return new HelloService(); }
}
```

## 10. Errori comuni
- Confondere BeanFactory con ApplicationContext (ApplicationContext è più completo)
- Richiamare `getBean` senza aver registrato correttamente la config
- Dimenticare `@Configuration`

## 11. Esercizio
1. Crea `PrinterService` con metodo `print(String msg)`
2. Crea `MessageService` che dipende da `PrinterService` (constructor injection)
3. Configura entrambi come bean
4. Stampa un messaggio dal contesto

## 12. Soluzione
Vedi hint: usa `@Bean` per entrambi o `@ComponentScan` + `@Component`. Per semplicità con Java Config pura, definisci entrambi i bean e inietta tramite costruttore.

Esempio:
```java
public class PrinterService { public void print(String msg){ System.out.println(msg); } }
public class MessageService {
  private final PrinterService printer;
  public MessageService(PrinterService p){ this.printer=p; }
  public void send(){ printer.print("IoC/DI in action"); }
}
@Configuration
public class AppConfig {
  @Bean PrinterService ps(){ return new PrinterService(); }
  @Bean MessageService ms(PrinterService ps){ return new MessageService(ps); }
}
```

## 13. Cosa imparare prima di continuare
- Differenza IoC vs DI
- ApplicationContext vs BeanFactory
- Quando usare @Bean vs @Component
- Constructor injection preferita rispetto a field/setter

---

**Da dove arriva?** Spring Core nasce con Spring Framework (Rod Johnson) per separare "cosa fare" da "come ottenere le dipendenze".

**Perché è stata introdotta?** Per evitare `new` ovunque, centralizzare creazione/gestione oggetti e migliorare testabilità.

**Come si fa oggi?** Con ApplicationContext + Java Config/Annotation. I concetti restano identici.
