package org.example;

import org.example.beans.KillDragonQuest;
import org.example.beans.Knight;
import org.example.beans.RescuingDimselQuest;
import org.example.beans.YoYeYoQuest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Knight knight=new Knight();
//        knight.setQuest(new YoYeYoQuest());
//        System.out.println(knight.goQuest());
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        Knight knight=context.getBean(Knight.class);
        System.out.println(knight.goQuest());
    }
}