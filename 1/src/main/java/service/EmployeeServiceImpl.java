package service;
import model.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepository.getEmployeeList();
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.createEmployee(employee);

    }
}
