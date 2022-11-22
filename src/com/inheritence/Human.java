package com.inheritence;

public class Human {
	int id;
	String name;
	String address;
	
	Human(int id,String name, String address){
	this.id=id;
	this.name=name;
	this.address=address;
	}

	public void showDetails() {
		System.out.println("id = "+id +", name =" +name + ", address = "+address );
	}

}
