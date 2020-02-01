package com.vikastadge.spring.beans;

public class EmployeeService {

    private IEmployeeDAO dao;

    public IEmployeeDAO getDao() {
        return dao;
    }

    public void setDao(IEmployeeDAO dao) {
        this.dao = dao;
    }

    public void save(EmployeeEntity employeeEntity){
        System.out.println("Service saving employee");
        dao.save(employeeEntity);
    }

}
