package org.example;

import org.example.service.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        ReportService reportService1=context.getBean(ReportService.class);
        ReportService reportService2=context.getBean(ReportService.class);

        System.out.println(reportService1);
        System.out.println(reportService2);

        boolean test= reportService1.equals(reportService2);
        System.out.println(test);


    }
}