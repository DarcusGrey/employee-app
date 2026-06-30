package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employees;

    // GET request to fetch all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees.findAll();
    }

    // POST request to add a new Employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        if (employees.existsById(employee.getId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Employee id already exists.");
        }

        employees.save(employee);
        return employee;
    }

    @PutMapping("/{id}")
    public Employee putEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        Employee algo = employees.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee id doesn't exists."));
        algo.setName(employee.getName());
        algo.setAge(employee.getAge());
        return algo;
    }

    @DeleteMapping("/{id}")
    public void removeEmployee(@PathVariable Integer id) {
        if(!employees.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee id doesn't exists.");
        }
        employees.deleteById(id);
    }
}