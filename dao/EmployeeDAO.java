package springbootApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootApi.model.Employee;
import springbootApi.repository.EmployeeRepository;


@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*To save an employee*/
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	
	/*search all employee*/
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	
	/*Get an Employee*/
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	
	/*Delete an Employee by object*/
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}

}
