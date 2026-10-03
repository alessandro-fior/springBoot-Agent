# 08 - Spring JSR 303 Bean Validation

## 1. Obiettivo
Usare Bean Validation (Jakarta Validation). Differenza javax.* vs jakarta.* (Spring Boot 3+ usa jakarta).

## 2. Concetto
Validazione dichiarativa via annotation su POJO.

## 3. Perché serve
Garantisce dati validi prima di business logic/API.

## 4. Esempio minimo
```java
@NotBlank
private String name;
@Email
private String email;
```

## 5. Codice
- `User.java` (annotazioni)
- `ValidationConfig.java` (LocalValidatorFactoryBean)
- `ValidationApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.ValidationApp"
```

## 7. Output atteso
```text
Valid user violations: 0
Invalid user violations: 3
name: must not be blank (o messaggio)
email: must be a well-formed email address
age: must be greater than or equal to 18
```

## 8. Versione storica
JSR 303/349/380 con Hibernate Validator; prima javax.validation.

## 9. Versione moderna
Jakarta Validation 3.x con Spring Boot 3+. Spring Boot auto-configura Validator.

## 10. Errori comuni
- Mancano dipendenze impl (hibernate-validator) + API/EL
- Usare javax.* in Spring Boot 3 (errore)
- Non iniettare Validator correttamente

## 11. Esercizio
Aggiungi `@Size`, `@NotNull`, personalizza messaggio.

## 12. Soluzione
`@NotBlank(message="Nome obbligatorio")`

## 13. Cosa imparare prima di continuare
javax.* → jakarta.* (migrazione importante). `@Valid` vs `@Validated` (concetto).

---

**Da dove arriva?** JSR Bean Validation per standardizzare validazione.

**Perché è stata introdotta?** Evita validazione duplicata/spaghetti.

**Come si fa oggi?** Jakarta Validation + Spring Boot auto-config.
