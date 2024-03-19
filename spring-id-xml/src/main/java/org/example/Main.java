package org.example;

import org.example.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        Student student=context.getBean(Student.class);
        System.out.println(student.showInfo());
    }
}