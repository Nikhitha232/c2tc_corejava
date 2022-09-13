package org.tnsif.c2tc.Service;

import org.tnsif.c2tc.entities.Employee;

public interface IEmployeeService {

	long addEmployee(Employee employee);

	Employee UpdateEmployee(Employee employee);

	boolean DeleteEmployee(long id);

	Employee SearchEmployee(long id);

}
