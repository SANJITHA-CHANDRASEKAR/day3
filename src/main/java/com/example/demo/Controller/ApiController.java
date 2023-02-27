package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
@Autowired
	EmployeeRepo repo;
@Autowired
	ApiService service;

@GetMapping("/getall")
	List<Employee> getAll(){
		return repo.findAll();
	}

@PostMapping("/post")
public String create(@RequestBody Employee stu) {
	return service.updateDetails(stu);
}

}
