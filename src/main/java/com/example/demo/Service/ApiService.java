package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {

	@Autowired
	EmployeeRepo repository;
	public Optional<Employee> getEmpo(int id){
		return repository.findById(id);
	}
	public String updateDetails(Employee emp) {
		repository.save(emp);
		return "update";
	}
}
