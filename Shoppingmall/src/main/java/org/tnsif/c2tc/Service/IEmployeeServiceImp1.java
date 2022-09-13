package org.tnsif.c2tc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Employee;
import org.tnsif.c2tc.repository.IEmployeeRepository;
@Service
public class IEmployeeServiceImp1 implements IEmployeeService{
@Autowired
IEmployeeRepository repository;
	@Override
	public long addEmployee(Employee employee) {
		Employee e=repository.save(employee);
		if(e!=null)
		return 1;
		else
			return 0;
	}

	@Override
	public Employee UpdateEmployee(Employee employee) {
		Employee e=repository.save(employee);
		return e;
	}

	@Override
	public boolean DeleteEmployee(long id) {
		Employee e=SearchEmployee(id);
		if(e!=null)
		{
			repository.delete(e);
			return true;
		}
		else
		return false;
	}

	@Override
	public Employee SearchEmployee(long id) {
		Employee e=repository.findById(id).get();
		return e;
	}

}
