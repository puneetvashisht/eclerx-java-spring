package com.eclerx.spring_boot_demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();
    {
        employees.add(new Employee(1,"Ravi", 34343.34));
        employees.add(new Employee(5,"Priya", 44343.34));
        employees.add(new Employee(3,"Raj", 24343.34));
    }

//    @GetMapping("/employees")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Employee> fetchAllEmployees(){
        return employees;
    }

    @PostMapping("/")
    public void addEmployee(@RequestBody Employee employee){
        employees.add(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
//        = new ArrayList<>();
        for(int i=0; i< employees.size(); i++){
            Employee e = employees.get(i);
            if(e.id == id){
                employees.set(i, employee);
            }
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        this.employees = employees.stream().filter(e -> e.id != id).toList();
    }




}
