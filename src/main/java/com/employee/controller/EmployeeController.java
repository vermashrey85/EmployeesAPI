package com.employee.controller;

import com.employee.model.Employee;
import com.employee.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO empDAO;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return empDAO.findAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee emp) {
        return (Employee) empDAO.save(emp);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id){
//        return  empDAO.findById(id).map(emp -> {
//            empDAO.delete(emp);
//            return ResponseEntity.noContent().build();
//        }).orElseGet(() -> ResponseEntity.notFound().build());
//    }
}
