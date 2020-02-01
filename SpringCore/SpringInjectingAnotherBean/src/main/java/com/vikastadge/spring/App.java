package com.vikastadge.spring;

import com.vikastadge.spring.beans.EmployeeEntity;
import com.vikastadge.spring.beans.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        EmployeeEntity employeeEntity = (EmployeeEntity)applicationContext.getBean("employee");
        employeeEntity.setId(1);
        employeeEntity.setName("Vikas Tadge");
        EmployeeService service = (EmployeeService)applicationContext.getBean("employeeService");
        service.save(employeeEntity);

    }
}
