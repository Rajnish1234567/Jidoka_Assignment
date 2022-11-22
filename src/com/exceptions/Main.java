package com.exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total marks");
		int marks=sc.nextInt();
		System.out.println("Enter total subjects");
		int subjects=sc.nextInt();
		try {
			PercentageCalculation.calculatePercentage(marks, subjects);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
