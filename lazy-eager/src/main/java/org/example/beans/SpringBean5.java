package org.example.beans;

import org.springframework.stereotype.Component;


public class SpringBean5 {

    public SpringBean5(){
        System.out.println(getClass().getSimpleName()
        +"::constructor");
    }
}
