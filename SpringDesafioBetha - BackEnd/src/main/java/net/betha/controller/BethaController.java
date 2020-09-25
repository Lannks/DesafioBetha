package net.betha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.betha.exception.ResourceNotFoundException;
import net.betha.model.Employee;
import net.betha.repository.BethaRepository;

@RestController
@RequestMapping("/api/v1/")
public class BethaController {

	@Autowired
	private BethaRepository bethaRepository;
	
	//todos os employees
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return bethaRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/employees")
	public Employee creatEmployee(@RequestBody Employee employee) {
		return bethaRepository.save(employee);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employee = bethaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Id não encontrado :" + id));
		return ResponseEntity.ok(employee);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
		Employee employee = bethaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Id não encontrado :" + id));
		
		employee.setPendente_fl((employeeDetails.getPendente_fl()));
		employee.setInicio((employeeDetails.getInicio()));
		employee.setFim((employeeDetails.getFim()));
		
		Employee updatedEmployee = bethaRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	
}
