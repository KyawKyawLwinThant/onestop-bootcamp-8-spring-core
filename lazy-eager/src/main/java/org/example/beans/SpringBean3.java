package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy(value = false)
public class SpringBean3 {


    public SpringBean3(){
        System.out.println(getClass().getSimpleName()
        +"::constructor");
    }
}
