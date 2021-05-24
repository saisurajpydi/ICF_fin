package com.icf.spring.app.employees.web.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
//import com.howtodoinjava.demo.entity.EmployeeEntity;
 import com.icf.spring.app.employees.web.jpa.EmployeeEntity;
@Repository
public interface EmployeeRepository 
        extends JpaRepository<EmployeeEntity, Long> {
 
}