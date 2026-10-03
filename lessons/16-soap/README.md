# 16 - SOAP Web Services

## 1. Obiettivo
Comprendere SOAP, WSDL, XSD. Differenza con REST. Perché va studiato (legacy enterprise).

## 2. Concetto
SOAP = Simple Object Access Protocol. Usa XML su HTTP/SMTP. Contract-first con WSDL.

## 3. Perché serve
Ancora presente in sistemi legacy (banca, assicurazione, PA). Necessario saper leggere/consumare.

## 4. Esempio minimo (concettuale)
```xml
<soap:Envelope xmlns:soap="...">
  <soap:Body>
    <getUser><id>1</id></getUser>
  </soap:Body>
</soap:Envelope>
```

## 5. Codice
- `SoapConceptApp.java` (concettuale, nessuna dipendenza complessa per evitare build issues)

## 6. Come eseguirlo
```bash
mvn clean compile exec:java -Dexec.mainClass="com.example.SoapConceptApp"
```

## 7. Output atteso
Spiegazione concettuale.

## 8. Versione storica
Diffuso prima di REST; Spring WS per integrazione.

## 9. Versione moderna
REST prevalente per API pubbliche; SOAP resta in integrazioni B2B legacy.

## 10. Errori comuni
- Confondere REST e SOAP
- Pensare SOAP obsoleto senza considerare contesto
- Dimenticare WSDL come contract

## 11. Esercizio
Spiega differenze REST vs SOAP (pro/contro).

## 12. Soluzione
REST: stateless, JSON, semplice. SOAP: WS-* (security, transaction), XML, contract strict.

## 13. Cosa imparare prima di continuare
Leggere codice SOAP legacy è utile; in nuovi progetti quasi sempre REST.

---

**Da dove arriva?** Standard per web services enterprise (prima REST).

**Perché è stata introdotta?** Interoperabilità cross-platform con contratto formale.

**Come si fa oggi?** Spring Web Services per consumare/creare SOAP; REST dominante.
