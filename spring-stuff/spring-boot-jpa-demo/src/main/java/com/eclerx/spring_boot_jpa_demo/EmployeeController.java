package com.eclerx.spring_boot_jpa_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


//    @GetMapping("/employees")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Employee> fetchAllEmployees(){
        // return employees;
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> fetchEmployeeById(@PathVariable("id") int id){
        Optional<Employee> employeeFound = employeeRepository.findById(id);
        if(!employeeFound.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(employeeFound.get(), HttpStatus.OK);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Void> addEmployee(@RequestBody Employee employee){
        // employees.add(employee);

        employeeRepository.save(employee);
        ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.CREATED);
        return responseEntity;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        Optional<Employee> employeeFound = employeeRepository.findById(id);
        if(employeeFound.isPresent()){
            employee.setId(id);
            employeeRepository.save(employee);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        employeeRepository.deleteById(id);
        // this.employees = employees.stream().filter(e -> e.id != id).toList();
    }




}
