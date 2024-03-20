package org.example.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBean4 {

    public SpringBean4(){
        System.out.println(getClass().getSimpleName()
        +"::constructor");
    }
}
