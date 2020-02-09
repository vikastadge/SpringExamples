package com.vikastadge.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
@EmployeeDAOType
public class EmployeeDAO implements IEmployeeDAO {

    @Override
    public void save(EmployeeEntity employeeEntity) {
        System.out.println("EmployeeDAO saving employee");
    }
}
