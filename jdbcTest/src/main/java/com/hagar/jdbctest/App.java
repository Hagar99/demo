
package com.hagar.jdbctest;
import dao.EmployeeDao;
import dao.EmployeeDaoImple;

public class App {
	
	public static void main(String[] args) {

		
	EmployeeDao employeeDao = new EmployeeDaoImple();
	
	employeeDao.findAll();
	
	}
}
