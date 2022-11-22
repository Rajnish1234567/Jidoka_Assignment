package com.inheritence;

public class Students extends Human {

	int fees;
	
	public Students(int id, String name, String address, int fees) {
		super(id, name, address);
		this.fees=fees;
	}
	
	public Students() {
		super();
	}

	@Override
	public void show(){
		System.out.println("Inside students class");
	}
}
