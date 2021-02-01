package com.keerti_epam.mavenproject.expression;

public class Validator {
	public static boolean validateExp(Expression exp) {
		if(exp==null)
			return false;
		return exp.getSign()!=null && exp.getFirst()!=null && exp.getSecond() !=null;
	}
}
