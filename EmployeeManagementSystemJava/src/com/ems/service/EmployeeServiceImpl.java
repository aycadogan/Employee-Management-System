package com.ems.service;

import com.ems.dao.EmployeeDAO;
import com.ems.dao.EmployeeDAOMySQLImp;
import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO empDAO = new EmployeeDAOMySQLImp();

    @Override
    public void addEmployee(Employee e) {
        empDAO.addEmployee(e);
    }

    @Override
    public void deleteEmployee(int id) {
        empDAO.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(Employee e) {
        empDAO.updateEmployee(e);
    }

    @Override
    public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
        return empDAO.findEmployee(e);
    }

    @Override
    public List<Employee> showAllEmployees() {
        return empDAO.showAllEmployees();
    }
}
