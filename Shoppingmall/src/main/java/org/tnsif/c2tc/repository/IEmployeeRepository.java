package org.tnsif.c2tc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.Employee;

public interface IEmployeeRepository  extends JpaRepository<Employee,Long>{

}
