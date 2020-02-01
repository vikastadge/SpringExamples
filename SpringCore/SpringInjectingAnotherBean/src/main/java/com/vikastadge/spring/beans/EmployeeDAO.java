package com.vikastadge.spring.beans;

public class EmployeeDAO implements IEmployeeDAO {
    @Override
    public void save(EmployeeEntity employeeEntity){
        System.out.println("DAO saving employee");
    }
}
