package pro.sky.listemployees.service;

import org.springframework.stereotype.Service;
import pro.sky.listemployees.error.EmployeeAlreadyAddedException;
import pro.sky.listemployees.error.EmployeeNotFoundException;
import pro.sky.listemployees.error.EmployeeStoragelsFullException;
import pro.sky.listemployees.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeesService {
    private final List<Employee> employeeList = new ArrayList<>();
    private final Integer maxSize = 10;


    public void deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employeeList.contains(employee)) {
            throw new EmployeeNotFoundException(firstName, lastName);
        }
        employeeList.remove(employee);
    }

    public Employee getEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employeeList.contains(employee)) {
            throw new EmployeeNotFoundException(firstName, lastName);
        }
       return employee;
    }

    public Employee addEmployee(String lastName, String firstName) {
        if (employeeList.size()>= maxSize){
           throw  new EmployeeStoragelsFullException();

        }
        Employee worker = new Employee(lastName,firstName);
        if (employeeList.contains(worker)){
        throw new EmployeeAlreadyAddedException(firstName,lastName);
        }
        employeeList.add(worker);
        return worker;
    }
    public List<Employee> getAll(){
       return Collections.unmodifiableList(employeeList);
    }

}












