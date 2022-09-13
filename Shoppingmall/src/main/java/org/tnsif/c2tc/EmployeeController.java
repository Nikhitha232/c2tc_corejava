package org.tnsif.c2tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.c2tc.Service.IEmployeeService;
import org.tnsif.c2tc.entities.Employee;

@RestController
public class EmployeeController {
	@Autowired
	IEmployeeService service;
	@PostMapping("/addEmployee")
	public String AddEmployee(@RequestBody Employee employee)
	{
		long count=service.addEmployee(employee);
		return(count + "no of values got added");
	}
	@PutMapping("/updateEmployee")
	public Employee UpdateEmployee(@RequestBody Employee employee)
	{
		return service.UpdateEmployee(employee);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable long id)
	{
		boolean success=service.DeleteEmployee(id);
		if(success)
			return "Deletion Successful";
		else
			return "Deletion Failed";
	}
	@GetMapping("/SearchEmployee/{id}")
	public Employee SearchEmployee(@PathVariable long id)
	{
		return service.SearchEmployee(id);
	}
	}
	


