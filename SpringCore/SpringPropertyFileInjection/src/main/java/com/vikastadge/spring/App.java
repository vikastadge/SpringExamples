package com.vikastadge.spring;

import com.vikastadge.spring.beans.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        Organization organization = (Organization)applicationContext.getBean("organization");
        System.out.println(organization);
    }
}
