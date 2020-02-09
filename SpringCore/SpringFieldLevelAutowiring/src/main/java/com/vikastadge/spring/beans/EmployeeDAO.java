package com.vikastadge.spring.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO implements IEmployeeDAO {
    public EmployeeDAO(){
        System.out.println("init EmployeeDAO");
    }

    @Override
    public void save(EmployeeEntity employeeEntity) {
        System.out.println("EmployeeDAO saving employee");
    }
}
