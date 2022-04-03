package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployeeList();
    public void createEmployee(Employee employee);
}

