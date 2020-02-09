package com.vikastadge.spring;

import com.vikastadge.spring.beans.EmployeeEntity;
import com.vikastadge.spring.beans.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.vikastadge.spring");
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(1);
        employeeEntity.setName("Vikas");
        employeeEntity.setDepartment("IT");
        System.out.println(employeeEntity);
        EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
        employeeService.save(employeeEntity);

    }
}
