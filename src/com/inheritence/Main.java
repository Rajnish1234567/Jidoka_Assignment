package com.inheritence;

public class Main {

	public static void main(String[] args) {
		System.out.println("Using child class reference and child class object");
		Students s1= new Students();
		s1.show();
		s1.run();
		
		System.out.println("Using super class reference and child class object");
		Human h1= new Students();
		h1.show();
		h1.run();
	}
}
