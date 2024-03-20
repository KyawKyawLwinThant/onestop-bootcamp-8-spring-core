package org.example;

import org.example.beans.SpringBean5;
import org.example.beans.SpringBean6;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(lazyInit =true)
@Lazy
public class AppConfig {
    @Bean
    public SpringBean5 springBean5(){
        return new SpringBean5();
    }
    @Bean @Lazy(value = false)
    public SpringBean6 springBean6(){
        return new SpringBean6();
    }
}
