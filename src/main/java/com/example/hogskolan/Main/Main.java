package com.example.hogskolan.Main;

import com.example.hogskolan.Calculator.BasicCalculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator basicCalc = new BasicCalculator();
		//System.out.println(basicCalc.addition(2.0, 3.0));
		//System.out.println(basicCalc.addition(-2.0, 3.0));
		
		//System.out.println(basicCalc.subtraction(3.0, 2.0));
		//System.out.println(basicCalc.subtraction(2.0, 3.0));
		
		//System.out.println(basicCalc.multiplication(2.0, 3.0));
		//System.out.println(basicCalc.multiplication(-2.0, 3.0));
		
		System.out.println(basicCalc.devision(6.0, 3.0));
		System.out.println(basicCalc.devision(2.0, 4.0));
		
	}

}
