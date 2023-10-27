package org.example3;

import org.example3.spring.MyConfig;
import org.example3.spring.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.sayYourPet();
        context.close();
    }
}
