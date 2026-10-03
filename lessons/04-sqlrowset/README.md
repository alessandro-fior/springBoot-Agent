# 04 - SqlRowSet / SimpleJdbcCall

## 1. Obiettivo
Capire JDBC in Spring: `JdbcTemplate`, `SqlRowSet` e `SimpleJdbcCall` (stored procedure). Confronto con approcci moderni (JPA/Spring Data).

## 2. Concetto
- `JdbcTemplate`: astrae boilerplate JDBC
- `SqlRowSet`: wrapper di `ResultSet`, può essere scorrevole/utilizzato senza dover gestire connessioni manualmente in alcuni contesti
- `SimpleJdbcCall`: semplifica chiamate a stored procedure/func

## 3. Perché serve
Evita `try/catch/finally/Connection/Statement` ripetitivi; utile per legacy/stored procedure.

## 4. Esempio minimo
```java
SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT * FROM employees");
while (rs.next()) { ... }
```

## 5. Codice
- `AppConfig.java` (DataSource H2 + JdbcTemplate + SimpleJdbcCall)
- `SqlRowSetApp.java`
- `schema.sql`, `data.sql` in `src/main/resources`

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.SqlRowSetApp"
```

## 7. Output atteso
```text
Query via JdbcTemplate:
1: Alice
2: Bob
3: Charlie

Query via SqlRowSet:
1: Alice
2: Bob
3: Charlie

SimpleJdbcCall bean created: SimpleJdbcCall
```

## 8. Versione storica
Spring 2.x+ ha migliorato accesso JDBC. `SqlRowSet` da `javax.sql.rowset`.

## 9. Versione moderna
Preferire: JdbcTemplate (semplice), Spring Data JDBC, JPA/Hibernate a seconda caso. `SimpleJdbcCall` ancora utile con SP.

## 10. Errori comuni
- Dimenticare dipendenze `spring-jdbc` + driver DB
- Non inizializzare schema/data
- Confondere `RowMapper` callback vs `queryForRowSet`

## 11. Esercizio
1. Aggiungi tabella `departments`
2. Leggi con `queryForRowSet` e stampa
3. Crea query con parametro (WHERE)

## 12. Soluzione
Aggiungi SQL e usa `queryForRowSet("SELECT * FROM employees WHERE id=?", new Object[]{1})` o NamedParameterJdbcTemplate.

## 13. Cosa imparare prima di continuare
Quando preferire:
- JdbcTemplate
- SimpleJdbcCall (SP)
- JPA/Spring Data JPA (moderno)

---

**Da dove arriva?** Nasce dal bisogno di semplificare JDBC in Spring (prima JPA diffuso).

**Perché è stata introdotta?** Riduce codice boilerplate, gestisce risorse.

**Come si fa oggi?** Valido per sistemi legacy/SP; per nuovi progetti valutare Spring Data.
