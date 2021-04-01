package com.example.hogskolan.Calculator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;
import java.text.DecimalFormat;

public class CalculatorMethodsTest {

	BasicCalculator basicCalc = new BasicCalculator();
	AdvancedCalculator advCalc = new AdvancedCalculator();
	Random random = new Random();
	static DecimalFormat decRound = new DecimalFormat("#.##");
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	
	@Test
	public void testAdditionWithPositive() {
		double tempRandom = random.nextDouble(); 
		double tempRandom2 = random.nextDouble();
		double tempResult;		
		tempResult = tempRandom + tempRandom2;
		
		assertEquals(basicCalc.addition(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method addition with positive value.");
		LOG.info("Testing method addition with positive value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testAdditionWithNegative() {
		double tempRandom = random.nextDouble()*-1; 
		double tempRandom2 = random.nextDouble();
		double tempResult;	
		tempResult = tempRandom + tempRandom2;
		
		assertEquals(basicCalc.addition(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method addition with negative value.");
		LOG.info("Testing method addition with negative value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testAdditionWithZero() {
		double tempRandom = random.nextDouble()*0; 
		double tempRandom2 = random.nextDouble();
		double tempResult;
		
		tempResult = tempRandom + tempRandom2;
		
		assertEquals(basicCalc.addition(tempRandom, tempRandom2), tempResult, 0);
		
		assertEquals(basicCalc.addition(0, 0), 0, 0);
		
		//System.out.println("Testing method addition with zero.");
		LOG.info("Testing method addition with zero value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	
	@Test
	public void testSubtractionWithPositive() {
		double tempRandom= random.nextDouble(); 
		double tempRandom2= random.nextDouble();
		double tempResult;		
		tempResult = tempRandom - tempRandom2;
		
		assertEquals(basicCalc.subtraction(tempRandom, tempRandom2), tempResult, 0);
			
		//System.out.println("Testing method subtraction with positive value.");
		LOG.info("Testing method subtraction with positive value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testSubtractionWithNegative() {
		double tempRandom= random.nextDouble()*-1; 
		double tempRandom2= random.nextDouble();
		double tempResult;	
		tempResult = tempRandom - tempRandom2;
		
		assertEquals(basicCalc.subtraction(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method subtraction with negative value.");
		LOG.info("Testing method subtraction with negative value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	
	@Test
	public void testSubtractionWithZero() {
		double tempRandom= random.nextDouble()*0; 
		double tempRandom2= random.nextDouble();
		double tempResult;	
		tempResult = tempRandom - tempRandom2;
		
		assertEquals(basicCalc.subtraction(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method subtraction with zero value.");
		LOG.info("Testing method subtraction with zero value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	
	@Test
	public void testMultiplicationWithPositive() {
		double tempRandom= random.nextDouble(); 
		double tempRandom2= random.nextDouble();
		double tempResult;	
		tempResult = tempRandom * tempRandom2;
		
		assertEquals(basicCalc.multiplication(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method multiplication with positive value.");
		LOG.info("Testing method multiplication with the positive value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testMultiplicationWithNegative() {
		double tempRandom= random.nextDouble()*-1; 
		double tempRandom2= random.nextDouble();
		double tempResult;
		
		tempResult = tempRandom * tempRandom2;
		
		assertEquals(basicCalc.multiplication(tempRandom, tempRandom2), tempResult, 0);		
		
		//System.out.println("Testing method multiplication with negative value.");
		LOG.info("Testing method multiplication with negative value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testMultiplicationWithZero() {
		double tempRandom= random.nextDouble()*0; 
		double tempRandom2= random.nextDouble();
		double tempResult;		
		tempResult = tempRandom * tempRandom2;
		
		assertEquals(basicCalc.multiplication(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method multiplication with zero.");
		LOG.info("Testing method multiplication with zero");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	
	
	@Test
	public void testDivisionWithPositive() {
		double tempRandom= random.nextDouble(); 
		double tempRandom2= random.nextDouble();
		double tempResult;	
		tempResult = tempRandom / tempRandom2;
		
		assertEquals(basicCalc.division(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method division with positive value.");
		LOG.info("Testing method division with positive value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testDivisionWithNegative() {
		double tempRandom= random.nextDouble()*-1; 
		double tempRandom2= random.nextDouble();
		double tempResult;	
		tempResult = tempRandom / tempRandom2;
		
		assertEquals(basicCalc.division(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method division with negative value.");
		LOG.info("Testing method division wuth negative value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testDivisionWithZero() {
		double tempRandom= random.nextDouble()*0; 
		double tempRandom2= random.nextDouble();
		double tempResult;
		
		tempResult = tempRandom / tempRandom2;
		
		assertEquals(basicCalc.division(tempRandom, tempRandom2), tempResult, 0);
		assertEquals(basicCalc.division(1, 0), -0.123456789, 0);
		
		//System.out.println("Testing method division with zero.");
		LOG.info("Testing method division with zero");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	
	@Test
	public void testSquareWithPositive() {
		double tempRandom= random.nextDouble(); 		
		double tempResult;		
		tempResult = tempRandom * tempRandom;
		
		assertEquals(advCalc.square(tempRandom), tempResult, 0);
		
		//System.out.println("Testing method square with positive value.");
		LOG.info("Testing method square with pisitive value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));
		
	}
	
	@Test
	public void testSquareWithNegative() {
		double tempRandom= random.nextDouble()*-1; 	
		double tempResult;	
		tempResult = tempRandom * tempRandom;
		
		assertEquals(advCalc.square(tempRandom), tempResult, 0);
		
		//System.out.println("Testing method square with negative value.");
		LOG.info("Testing method square with negative value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testSquareWithZero() {
		double tempRandom= random.nextDouble()*0; 	
		double tempResult;	
		tempResult = tempRandom * tempRandom;
		
		assertEquals(advCalc.square(tempRandom), tempResult, 0);
		
		//System.out.println("Testing method square with zero value.");
		LOG.info("Testing method square with zero value");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testRaisToThePowerOfwithPositive() {
		double tempRandom= random.nextDouble(); 
		double tempRandom2= random.nextDouble();
		double tempResult;		
		tempResult = Math.pow(tempRandom, tempRandom2);
		
		assertEquals(advCalc.raisToThePowerOf(tempRandom, tempRandom2), tempResult, 0);
				
		//System.out.println("Testing method raise to the power of with positive value.");
		LOG.info("Testing method raise to the power of with negative value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testRaisToThePowerOfWithNegative() {
		double tempRandom= random.nextDouble()*-1; 
		double tempRandom2= random.nextDouble();
		double tempResult;
		tempResult = Math.pow(tempRandom, tempRandom2);
		
		assertEquals(advCalc.raisToThePowerOf(tempRandom, tempRandom2), tempResult, 0);
			
		//System.out.println("Testing method raise to the power of with negative base.");
		LOG.info("Testing method raise to the power of with negative base.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testRaisToThePowerOf() {
		double tempRandom= random.nextDouble(); 
		double tempRandom2= random.nextDouble()*-1;
		double tempResult;
		
		tempResult = Math.pow(tempRandom, tempRandom2);
		
		assertEquals(advCalc.raisToThePowerOf(tempRandom, tempRandom2), tempResult, 0);
				
		//System.out.println("Testing method raise to the power ofwith negative value of the exponent.");
		LOG.info("Testing method raise to the power of with negative value of the exponent.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testRaisToThePowerOfWithZeroBase() {
		double tempRandom= random.nextDouble()*0; 
		double tempRandom2= random.nextDouble();
		double tempResult;		
		tempResult = Math.pow(tempRandom, tempRandom2);
		
		assertEquals(advCalc.raisToThePowerOf(tempRandom, tempRandom2), tempResult, 0);

		//System.out.println("Testing method raise to the power of with base value of zero.");
		LOG.info("Testing method raise to the power of with base value of zero.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	@Test
	public void testRaisToThePowerOfWithZeroExponent() {
		double tempRandom= random.nextDouble(); 
		double tempRandom2= random.nextDouble()*0;
		double tempResult;	
		tempResult = Math.pow(tempRandom, tempRandom2);
		
		assertEquals(advCalc.raisToThePowerOf(tempRandom, tempRandom2), tempResult, 0);
		
		//System.out.println("Testing method raise to the power of with exponent value of zero.");
		LOG.info("Testing method raise to the power of with exponent value of zero.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tnumber b =: "+ decRound.format(tempRandom2)+ "\tresult =: " + decRound.format(tempResult));
		
	}
	
	@Test
	public void testSinFunctionwithPositive() {
		double tempRandom= random.nextDouble(); 	
		double tempResult;
		
		tempResult = Math.sin(Math.toRadians(tempRandom));
		
		assertEquals(advCalc.sinFunction(tempRandom), tempResult, 0);
				
		//System.out.println("Testing method sinFunction with positive value.");
		LOG.info("Testing method sinFunction with positive value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	@Test
	public void testSinFunctionWithNegative() {
		double tempRandom= random.nextDouble()*-1; 	
		double tempResult;		
		tempResult = Math.sin(Math.toRadians(tempRandom));
		
		assertEquals(advCalc.sinFunction(tempRandom), tempResult, 0);
				
		//System.out.println("Testing method sinFunction with negative value.");
		LOG.info("Testing method sinFunction with negative value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	@Test
	public void testSinFunctionWithZero() {
		double tempRandom= random.nextDouble()*0; 	
		double tempResult;
		tempResult = Math.sin(Math.toRadians(tempRandom));
		
		assertEquals(advCalc.sinFunction(tempRandom), tempResult, 0);
				
		//System.out.println("Testing method sinFunction with zero value.");
		LOG.info("Testing method sinFunction with zero value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}

	@Test
	public void testInverseSinFunctionWithPositive() {
		double tempRandom= random.nextDouble(); 
		double tempResult;		
		tempResult = Math.asin(tempRandom);
		
		assertEquals(advCalc.inverseSinFunction(tempRandom), tempResult, 0);

				
		//System.out.println("Testing method inverseSinFunction with positive value.");
		LOG.info("Testing method inverseSinFunction with positive value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	@Test
	public void testInverseSinFunctionWithNegative() {
		double tempRandom= random.nextDouble()*-1; 	
		double tempResult;
		
		tempResult = Math.asin(tempRandom);
		
		assertEquals(advCalc.inverseSinFunction(tempRandom), tempResult, 0);
				
		//System.out.println("Testing method inverseSinFunction with negative value.");
		LOG.info("Testing method inverseSinFunction with negative value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	@Test
	public void testInverseSinFunctionWithZero() {
		double tempRandom= random.nextDouble()*0; 		
		double tempResult;
		
		tempResult = Math.asin(tempRandom);
		
		assertEquals(advCalc.inverseSinFunction(tempRandom), tempResult, 0);
				
		//System.out.println("Testing method inverseSinFunction with zero value.");
		LOG.info("Testing method inverseSinFunction with zero value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	
	@Test
	public void testNaturalLogarithmWithPositive() {
		double tempRandom= random.nextDouble(); 
		double tempResult;
		tempResult = Math.log(tempRandom);
		
		assertEquals(advCalc.naturalLogarithm(tempRandom), tempResult, 0);

			
		//System.out.println("Testing method naturalLogarithm with positive value.");
		LOG.info("Testing method naturalLogarithm with positive value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	@Test
	public void testNaturalLogarithmWithNegative() {
		double tempRandom= random.nextDouble()*-1; 
		double tempResult;
		//here is the NaN - not a number, showing that the input is out of range. Must be x>0.
		double x = Double.NaN;
		
		tempResult = Math.log(tempRandom);
		
		assertEquals(advCalc.naturalLogarithm(tempRandom), tempResult, 0);
		
		assertEquals(advCalc.naturalLogarithm(-1),x, 0);
		// here is the the concept of negative infinity -->(1.0 / -0.0)
		//assertEquals(advCalc.naturalLogarithm(0), (1.0 / -0.0), 0);
			
		//System.out.println("Testing method naturalLogarithm with negative value.");
		LOG.info("Testing method naturalLogarithm with negative value.");	
		System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	@Test
	public void testNaturalLogarithmWithZero() {
		double tempRandom= random.nextDouble()*0; 
		double tempResult;	
		tempResult = Math.log(tempRandom);
		
		assertEquals(advCalc.naturalLogarithm(tempRandom), tempResult, 0);
		
		// here is the the concept of negative infinity -->(1.0 / -0.0)
		assertEquals(advCalc.naturalLogarithm(0), (1.0 / -0.0), 0);
			
		//System.out.println("Testing method naturalLogarithm with zero value.");
		LOG.info("Testing method naturalLogarithm with zero value.");	
		//System.out.println("Number a =: " + decRound.format(tempRandom) + "\tresult =: " + decRound.format(tempResult));	
	}
	
	
}

