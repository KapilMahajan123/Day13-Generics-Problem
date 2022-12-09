package com.Generics.java;

/**
 * 
 * @author Kapil
 *
 */
public class MaximumTestGenerics {
	
	/*
	 * Given three Floats and find maximum.
	 * First i have taken number one is maximumNumber
	 * then used compare to method 
	 */
	public static Float maximumFloat(Float num1, Float num2, Float num3) {

		Float maximumNumber = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumNumber = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumNumber = num2;
		else
			maximumNumber = num3;
		return maximumNumber;

	}
	
	//print maximum Float numbers
	public static void main(String[] args) {
		System.out.println("Maximum Float Number Among 3 will be :- " + maximumFloat(70.6f, 40.7f, 50.8f));
	}

}
