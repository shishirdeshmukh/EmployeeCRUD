package my_package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import my_package.model.*;
import my_package.services.*;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT},allowedHeaders = "*")
public class EmployeeController {

	@Autowired
	EmployeServices empserv;
	

	@GetMapping("api/employee")
	public List <Employee>  GetStudent(){
		return empserv.GetAll();
	}
	
	@PostMapping("api/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empserv.AddEmployee(emp);
	}
	
	@PutMapping("api/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empserv.UpdateEmployee(emp);
	}
	
	@GetMapping("api/employee/{id}")
	public Employee GetEmployeebyID(@PathVariable("id") int id) {
		return empserv.GetEmployeebyID(id);
	}
	
	@DeleteMapping("api/employee/{id}")
	public Employee DeleteEmployee(@PathVariable("id") int id) {
		return empserv.DeleteEmployee(id);
	}
	
	@GetMapping("api/designations")
	public List <Designations>  GetDesignations(){
		return empserv.GetAllDesignations();
	}
	
}
