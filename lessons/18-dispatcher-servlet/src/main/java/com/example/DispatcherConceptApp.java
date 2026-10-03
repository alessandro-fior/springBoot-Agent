package com.example;

public class DispatcherConceptApp {
    public static void main(String[] args) {
        System.out.println("Flusso Spring MVC:");
        System.out.println("HTTP Request -> DispatcherServlet -> HandlerMapping -> Controller -> Service -> Repository -> View/Response");
        System.out.println("\nDispatcherServlet: front controller, riceve tutte le richieste");
        System.out.println("HandlerMapping: mappa URL a Controller");
        System.out.println("HandlerAdapter: invoca Controller");
        System.out.println("ViewResolver: risolve viste (JSP/Thymeleaf)");
        System.out.println("\nStorico: configurato in web.xml + dispatcher-servlet.xml");
        System.out.println("Moderno (Spring Boot): @SpringBootApplication configura automaticamente DispatcherServlet");
    }
}
