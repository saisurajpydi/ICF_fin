package com.icf.spring.app.employees.web;

//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;// DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.icf.spring.app.employees.web.jpa.*;
import com.icf.spring.app.employees.web.facade.*;
//import com.howtodoinjava.demo.entity.EmployeeEntity;
//import com.howtodoinjava.demo.exception.RecordNotFoundException;
//import com.howtodoinjava.demo.service.EmployeeService

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/get")
	public String getEmployees(){
		return String.format("Hello %s!", "Sai");
	}
	
	@GetMapping("/get")
	public String getEmployee(@RequestParam(value = "name") String id){
		return String.format("Hello %s!", "Sai");
	}
	
	@PostMapping("/post")
	public String createEmployee(){
		return String.format("Hello %s!", "Sai");
	}
	
	@PutMapping("/put")
	public String updateEmployee(){
		return String.format("Hello %s!", "Sai");
	}
	
	@DeleteMapping("/delete")
	public String deleteEmp(){
		return String.format("Hello %s!", "Sai");
	}
	////
    @Autowired
    EmployeeService service;
 
    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        List<EmployeeEntity> list = service.getAllEmployees();
 
        return new ResponseEntity<List<EmployeeEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id) 
                                                    throws RecordNotFoundException {
        EmployeeEntity entity = service.getEmployeeById(id);
 
        return new ResponseEntity<EmployeeEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @PostMapping
    public ResponseEntity<EmployeeEntity> createOrUpdateEmployee(EmployeeEntity employee)
                                                    throws RecordNotFoundException {
        EmployeeEntity updated = service.createOrUpdateEmployee(employee);
        return new ResponseEntity<EmployeeEntity>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) 
                                                    throws RecordNotFoundException {
        service.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }
}
