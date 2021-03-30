package com.example.hogskolan.Calculator;

import com.example.hogskolan.Interfaces.AdvancedOperations;

import java.lang.Math. *;

public class AdvancedCalculator implements AdvancedOperations {

	
	public double square(double number) {
		double result = number * number;
		return result;
	}

	public double raisToThePowerOf(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}
	//needs testing, add if stmnt
	//to find out sine of number x, first application needs to convert it to radians 
	//by dividing it to 180 and then multiplying it by PI.
	public double sinFunction(double sin) {
		if (sin>=-360&&sin<360) {
			double result = Math.round((sin/180)* Math.PI);
			return result;
		}else {
			System.out.println("Please enter the correct angle value between -360 and 360.");
			return 0.0;
		}	
	}
	//needs testing 
	public double inverseSinFunction(double asin) {
		if (asin>=-1 && asin<=1) {
			double result = Math.asin(asin);
			return result;
		}else {
			System.out.println("The argument value is NaN or absolute value is greater than 1.");
			return 0.0;
		}
	}

	//needs testing
	public double naturalLogarithm(double natLog) {
		if(natLog>0) {
			double result = Math.log(natLog);
			return result;
		}else {
			System.out.println("The real natural logarithm function ln(x) is defined only when x>0");
			return 0.0;
		}
		
		
	}

}
