# 15 - JdbcTemplate

## 1. Obiettivo
Usare JdbcTemplate: query, queryForObject, update, RowMapper.

## 2. Concetto
Template method pattern per semplificare JDBC (gestione risorse, eccezioni).

## 3. Perché serve
Alternativa pulita a JDBC raw. Molto usato in legacy.

## 4. Esempio minimo
```java
List<User> list = jdbc.query("SELECT * FROM users",
  (rs,r)-> new User(rs.getInt("id"), rs.getString("name")));
```

## 5. Codice
- H2 + schema.sql/data.sql
- `AppConfig.java`
- `User.java`
- `JdbcTemplateApp.java`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.JdbcTemplateApp"
```

## 7. Output atteso
```text
User[id=1, name=Anna]
User[id=2, name=Marco]
After insert: 3
```

## 8. Versione storica
Spring 2.0+.

## 9. Versione moderna
Valido. Evoluzione: Spring Data JDBC, JPA, Spring Data JPA.

## 10. Errori comuni
- Non chiude risorse (gestito da template)
- Mapping manuale ripetitivo
- SQL hardcoded (usare NamedParameterJdbcTemplate)

## 11. Esercizio
Usa NamedParameterJdbcTemplate con parametri nominati.

## 12. Soluzione
```java
NamedParameterJdbcTemplate np = new NamedParameterJdbcTemplate(ds);
np.query("SELECT * FROM users WHERE id=:id", Map.of("id",1), mapper);
```

## 13. Cosa imparare prima di continuare
Percorso: JDBC → JdbcTemplate → Spring Data JDBC → JPA → Spring Data JPA.

---

**Da dove arriva?** Ridurre boilerplate JDBC.

**Perché è stata introdotta?** Pulizia, robustezza, meno errori.

**Come si fa oggi?** Ancora utile; per CRUD estesi spesso preferito Spring Data.
