package com.vikastadge.spring;

import com.vikastadge.spring.beans.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("D:\\Vikas\\Github\\SpringExamples\\SpringCore\\SpringHelloWorldXMLBeanFactory\\src\\main\\resources\\springConfig.xml"));
        HelloWorld obj = (HelloWorld) beanFactory.getBean("helloWorld");
        System.out.println(obj.getMessage());
    }
}
