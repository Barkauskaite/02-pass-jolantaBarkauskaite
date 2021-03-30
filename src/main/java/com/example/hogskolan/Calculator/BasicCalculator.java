package com.example.hogskolan.Calculator;

import com.example.hogskolan.Interfaces.BasicOperations;

public class BasicCalculator implements BasicOperations {

	
	public double addition(double a, double b) {
		double result = a + b;
		return result;
	}

	
	public double subtraction(double a, double b) {
		double result = a - b;
		return result;
	}

	
	public double multiplication(double a, double b) {
		double result = a * b;
		return result;
	}

	@Override
	public double devision(double a, double b) {
		if( b==0.0 ) {
			System.out.println("You cannot divide by zero.");
			return -0.123456789;
		}else {
			double result = a / b;
			return result;
		}	
	}
}
