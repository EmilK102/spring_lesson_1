package org.example2;

import org.example2.spring.MyConfig;
import org.example2.spring.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("myPerson", Person.class);
        person.sayYourPet();
        context.close();
    }
}
