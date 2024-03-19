package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {
    private String name="Thomas Hardy";

    private final Address add;

    @Autowired
    public Student(Address add){
            this.add =add;
    }
    public Student(@Autowired(required = false) String name,Address add){
        this.add= add;
    }
    @PostConstruct
    public void postConstruct(){

        System.out.println("PostConstruct::"+ add);
    }





    public String getName() {
        return name;
    }

    public Address getAdd() {
        return add;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String showInfo(){
        return "%s lives in %s".formatted(name,add.getStreetName());
    }
}
