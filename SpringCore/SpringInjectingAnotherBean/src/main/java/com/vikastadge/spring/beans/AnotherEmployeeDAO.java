package com.vikastadge.spring.beans;

public class AnotherEmployeeDAO implements IEmployeeDAO {
    @Override
    public void save(EmployeeEntity employeeEntity) {
        System.out.println("AnotherEmployeeDAO saving employee");
    }
}
