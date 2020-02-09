package com.vikastadge.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    @AnotherEmployeeDAOType
    private IEmployeeDAO iEmployeeDAO;

    public IEmployeeDAO getiEmployeeDAO() {
        return iEmployeeDAO;
    }

    public void setiEmployeeDAO(IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    public void save(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        iEmployeeDAO.save(employeeEntity);
    }

    public void update(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        iEmployeeDAO.save(employeeEntity);
    }
}
