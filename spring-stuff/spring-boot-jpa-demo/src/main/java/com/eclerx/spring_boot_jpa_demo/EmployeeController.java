package com.eclerx.spring_boot_jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<>();
    {
        employees.add(new Employee(1,"Ravi", 34343.34));
        employees.add(new Employee(5,"Priya", 44343.34));
        employees.add(new Employee(3,"Raj", 24343.34));
    }

//    @GetMapping("/employees")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Employee> fetchAllEmployees(){
        // return employees;
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> fetchEmployeeById(@PathVariable("id") int id){
        Employee employee = employees.stream().filter(e -> e.id == id).findFirst().orElse(null);
        if(employee == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
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
//        = new ArrayList<>();
        ResponseEntity<Void> responseEntity = null;
        for(int i=0; i< employees.size(); i++){
            Employee e = employees.get(i);
            if(e.id == id){
                employees.set(i, employee);
                responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        if(responseEntity == null){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        this.employees = employees.stream().filter(e -> e.id != id).toList();
    }




}
