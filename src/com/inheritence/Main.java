package com.inheritence;

public class Main {

	public static void main(String[] args) {
		Human e1= new Employee(1,"ram","patna",10000);
		e1.showDetails();
		
		Employee e2= new Employee(1,"ram","patna",10000);
		e1.showDetails();
		
		Human h1= new Human(1,"ram","patna");
		h1.showDetails();
	}
}
