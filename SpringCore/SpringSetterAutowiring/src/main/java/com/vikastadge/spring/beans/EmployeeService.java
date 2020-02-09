package com.vikastadge.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private IEmployeeDAO employeeDAO;

    public IEmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    @Autowired
    @Qualifier("anotherEmployeeDAO")
    public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void save(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        employeeDAO.save(employeeEntity);
    }

    public void update(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        employeeDAO.save(employeeEntity);
    }
}
