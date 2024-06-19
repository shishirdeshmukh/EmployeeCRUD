package my_package.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import my_package.model.*;
import my_package.repository.*;

@Service
public class EmployeServices {

	@Autowired 
	EmployeRepository emprepo;

	
	public Employee AddEmployee(Employee emp) {	
		Employee e = emprepo.save(emp);
		return e;
	}
	
public Employee UpdateEmployee(Employee emp) {
		Employee e = emprepo.save(emp);
		return e;
	}

public List<Employee> GetAll(){
	
	return emprepo.findAll();
	
}

public Employee GetEmployeebyID(int id) {
	Employee emp = emprepo.findById(id).get();
	return emp;
}

public Employee DeleteEmployee(int id) {
	Employee emp = GetEmployeebyID(id);
	
	emprepo.delete(emp);
	return emp;
	
}

@Autowired
DesignationRepository depo;


public List<Designations> GetAllDesignations(){
	
	return depo.findAll();
	
}

	
}




