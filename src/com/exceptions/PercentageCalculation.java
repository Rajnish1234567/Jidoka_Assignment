package com.exceptions;

public class PercentageCalculation {

	public static void calculatePercentage(int marks, int totalSubjects) throws Exception {
		if(marks>=0 && totalSubjects>0)
		{
			System.out.println("Percentage is = "+(marks/totalSubjects)+"%");
		}
		else if(marks<0 && totalSubjects>0) {
			throw new MarksException("Marks can not be less than zero");
		}
		else if(marks>=0 && totalSubjects<=0) {
			throw new SubjectException("There should be atleast one subject");
		}
		else {
			throw new Exception("You did not appeared in any exams");
		}
	}
}
