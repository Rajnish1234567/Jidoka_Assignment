package com.inheritence;

public class Human {
	int id;
	String name;
	String address;
	
	
	public Human() {
		super();
	}

	public Human(int id,String name, String address){
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}

	public void run() {
		System.out.println("Human is Running");
	}
	public void show() {
		System.out.println("Inside parent method....");
	}

}
