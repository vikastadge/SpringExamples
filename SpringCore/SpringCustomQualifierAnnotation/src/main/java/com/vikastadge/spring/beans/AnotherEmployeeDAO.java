package com.vikastadge.spring.beans;

import org.springframework.stereotype.Repository;


@Repository
@AnotherEmployeeDAOType
public class AnotherEmployeeDAO implements IEmployeeDAO {

    @Override
    public void save(EmployeeEntity employeeEntity) {
        System.out.println("Anotherempdao called");
    }
}
