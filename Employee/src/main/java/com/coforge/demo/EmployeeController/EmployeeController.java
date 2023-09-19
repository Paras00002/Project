package com.coforge.demo.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.demo.model.Employee;
import com.coforge.demo.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService service;

@GetMapping("/getEmpolyee")
public java.util.List<Employee> getall() {
   return service.getEmpDetails();
}

@GetMapping("/getEmpDetails/{id}")
public Employee fetchbyid(@PathVariable int id) {
   return service.getEmpDetailsById(id);

}

}
