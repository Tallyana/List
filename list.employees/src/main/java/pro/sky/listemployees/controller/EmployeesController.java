package pro.sky.listemployees.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.listemployees.model.Employee;
import pro.sky.listemployees.service.EmployeesService;

import java.util.List;

@RequestMapping("/employees")
@RestController

public class EmployeesController {
    private final EmployeesService employeesService;


    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/find")
    public Employee getEmployeesInfo(@RequestParam String firstName, @RequestParam String lastName) {
        return employeesService.getEmployee(firstName, lastName);
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeesService.addEmployee(lastName, firstName);
    }

    @GetMapping("/remove")
    public void removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
         employeesService.deleteEmployee(lastName, firstName);
    }
    @GetMapping("/find-all")
    public List<Employee> getAll() {
        return employeesService.getAll();
    }
}