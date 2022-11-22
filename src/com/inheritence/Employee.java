package com.inheritence;

public class Employee extends Human{

	int salary;
	
	public Employee(int id, String name, String address, int salary) {
		super(id, name, address);
		this.salary=salary;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Employee Details");
		System.out.println("id = "+id +"name = "+name+ " address = "+address +"Salary = "+salary);
	}
	
}
