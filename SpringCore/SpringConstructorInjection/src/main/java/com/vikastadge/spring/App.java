package com.vikastadge.spring;

import com.vikastadge.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Printing object 1 :- "+obj.getMessage());
        obj.setMessage("testing singleton");
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Printing object 2 :- "+obj2.getMessage());
        System.out.println("Printing object 1 :- "+obj.getMessage());


        ApplicationContext context2 = new ClassPathXmlApplicationContext("springConfig.xml");
        HelloWorld ob3 = (HelloWorld) context2.getBean("helloWorld");
        System.out.println("Printing object 3 :- "+ob3.getMessage());

        System.out.println("Printing object 2 :- "+obj2.getMessage());
    }
}
