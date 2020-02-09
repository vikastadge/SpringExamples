package com.vikastadge.spring.beans;

import org.springframework.stereotype.Repository;

@Repository
public class AnotherEmployeeDAO implements IEmployeeDAO {

    public AnotherEmployeeDAO(){
        System.out.println("init AnotherEmployeeDAO");
    }

    @Override
    public void save(EmployeeEntity employeeEntity) {
        System.out.println("Anotherempdao called");
    }
}
