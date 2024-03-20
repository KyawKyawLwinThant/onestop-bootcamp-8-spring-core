package org.example;

import org.example.service.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        ReportService reportService=context.getBean(ReportService.class);
        reportService.doAction();
    }
}