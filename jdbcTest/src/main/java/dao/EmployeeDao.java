package dao;

import java.util.List;

public interface EmployeeDao {

	List <Employee> findAll(); // function to get all employees
	
	Employee findallById (int id); // function to get an employee by id
	
	void save(Employee emp);
	
	void deleteById(int id);
}
