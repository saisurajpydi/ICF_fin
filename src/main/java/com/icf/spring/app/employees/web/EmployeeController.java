package com.icf.spring.app.employees.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
