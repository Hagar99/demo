package dao;

import java.util.Date;

public class Employee {
	
	  private  int id;
	  private  String name;
	  private  boolean gender ;
	  private  Date  birth_date ;
	  private  double salary; 
	
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, boolean gender, Date birth_date, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birth_date = birth_date;
		this.salary = salary;
	}

	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
