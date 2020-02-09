package com.vikastadge.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    public void save(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        employeeDAO.save(employeeEntity);
    }

    public void update(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        employeeDAO.save(employeeEntity);
    }
}
