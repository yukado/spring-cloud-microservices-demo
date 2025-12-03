package dev.yukado.employee.controller;

import dev.yukado.employee.model.Employee;
import dev.yukado.employee.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}

