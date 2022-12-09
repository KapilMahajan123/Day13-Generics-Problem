package com.Generics.java;

/**
 * 
 * @author Kapil
 *
 */
public class MaximumTestGenerics<T>{
	
	/**
	 * here i have used Generic functions.
	 * here T is the type of data.
	 */
	T num1, num2, num3, num4;
	
	/*
	 * Here this one is parameterised constructor having these parameters to initiate the values.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	public MaximumTestGenerics(T num1, T num2, T num3, T num4)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;

	}
	/*
	 * In this method it will check the values
	 * And give the maximum as an output.
	 */
	public static <T extends Comparable<T>> T maximumAmongFour(T num1, T num2, T num3, T num4) {

		T maximum = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximum = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximum = num2;
		else if (num3.compareTo(num4) > 0)
			maximum = num3;
		else
			maximum = num4;
		return maximum;		 //Gradually it will return the maximum.


	}
	
	//print
	public static void main(String[] args) {
		System.out.println("The max Number Among Four String numbers is:-\n "+maximumAmongFour("Orange", "Dragonfruit", "Apple", "Mango"));
		System.out.println("The max Number Among Four Integer numbers is:-\n "+maximumAmongFour(14, 56, 27, 40));
		System.out.println("The max Number Among Four Float numbers is:-\n "+maximumAmongFour(39.6f, 78.7f, 99.8f, 53.1f));	
		}

}
