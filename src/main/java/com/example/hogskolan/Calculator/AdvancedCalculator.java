package com.example.hogskolan.Calculator;

import com.example.hogskolan.Interfaces.AdvancedOperations;
import java.lang.Math. *;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	//this is operation of square by simply multiplying value by itself 
	public double square(double number) {
		double result = number * number;
		return result;
	}
	//this is operation of raising the number by the power of x number 
	public double raisToThePowerOf(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}

	//to find out sine of number x, first application needs to convert it to radians 
	//by dividing it to 180 and then multiplying it by PI with already exsisting java formula
	public double sinFunction(double sin) {
		//if (sin>=-360&&sin<360) {
			double angleInDegrees = sin; 
			double result = Math.sin(Math.toRadians(angleInDegrees));
			return result;
		/*}else {
			System.out.println("Please enter the correct angle value between -360 and 360.");
			return 0.0;
		}	*/
	}
	//The arcsin function is defined between -1 and 1 so it's base suppose to be between that range
	public double inverseSinFunction(double asin) {
		//if (asin>=-1 && asin<=1) {
			double result = Math.asin(asin);
			return result;
		/*}else {
			System.out.println("The argument value is NaN or absolute value is out of base range x[-1; 1].");
			return 0.0;
		}*/
	}

	//Natural logarithm base is e, where e is an irretional and transcendetal number
	//approximately 2,718281828459. So the exponent will be a given number which java formula
	//will automaticly calculate and return value. The exponent value must be x>0.
	public double naturalLogarithm(double natLog) {
		//if(natLog>0) {
			double result = Math.log(natLog);
			return result;
		/*}else {
			System.out.println("The real natural logarithm function ln(x) is defined only when x>0");
			return 0.0;
		}*/
		
		
	}

}


