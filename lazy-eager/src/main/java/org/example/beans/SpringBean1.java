package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    public SpringBean1(){
        System.out.println(getClass().getSimpleName()
        +"::constructor");
    }
}
