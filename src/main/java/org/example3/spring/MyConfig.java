package org.example3.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example2.spring")
public class MyConfig {

    @Bean
    Pet catBean(){
        return new Cat();
    }

    @Bean
    Pet dogBean(){
        return new Dog();
    }

    @Bean
    Person personBean(){
        return new Person(catBean());
    }
}
