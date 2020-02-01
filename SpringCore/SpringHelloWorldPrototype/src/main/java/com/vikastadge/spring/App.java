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
        System.out.println("Printing 1 :-"+obj.getMessage());
        obj.setMessage("Testing prototype");
        System.out.println("Printing 2 :-"+obj.getMessage());

        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Printing 3 :-"+obj2.getMessage());
    }
}
