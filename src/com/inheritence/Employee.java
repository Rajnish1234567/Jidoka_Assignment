package com.inheritence;

public class Employee extends Human{

	int salary;
	
	public Employee(int id, String name, String address, int salary) {
		super(id, name, address);
		this.salary=salary;
	}
	
	public Employee() {
		super();
	}

	@Override
	public void show(){
		System.out.println("Inside employee class");
	}
	
}
