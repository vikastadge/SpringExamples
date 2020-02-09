package com.vikastadge.spring.beans;

import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDAO {
    void save(EmployeeEntity employeeEntity);
}
