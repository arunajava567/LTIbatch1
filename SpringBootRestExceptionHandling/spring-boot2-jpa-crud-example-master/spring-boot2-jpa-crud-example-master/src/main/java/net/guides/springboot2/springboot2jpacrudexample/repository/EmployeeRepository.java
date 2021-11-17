package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

@Repository
//@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
	 
	@Query("select c.id from Employee c where c.id=3")
	//@Query(value = "SELECT id FROM Employee e where e.firstName='abc'")
	long findMinId();
	
	@Query(value = "SELECT u FROM Employee u ORDER BY id")
	List<Employee> findOrderAll();
	
	@Query(value="select  e from Employee e where e.firstName='srikar'")
	List<Employee> findEmpSrikar();
}
