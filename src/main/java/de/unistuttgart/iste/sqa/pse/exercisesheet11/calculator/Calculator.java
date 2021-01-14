package de.unistuttgart.iste.sqa.pse.exercisesheet11.calculator;

/**
 * 
 *
 */
public interface Calculator {

	/*
	 * @ensures summand1 + summand2 <= Integer.MAX_VALUE & summand1 + summand2 >=
	 * Integer.MIN_VALUE ==> \result summand1 + summand2
	 * 
	 * @ensures summand1 + summand2 > Integer.MAX_VALUE ==> overflow
	 * 
	 * @ensures summand1 + summand2 < Integer.MIN_VALUE ==> underflow
	 */
	/**
	 * calculate the sum of two integer values.
	 * 
	 * if the sum is greater than {@linkplain Integer#MAX_VALUE Integer.MAX_VALUE} a
	 * overflow happens and if the sum smaller than {@linkplain Integer#MIN_VALUE
	 * Integer.MIN_VALUE} an underflow happens
	 * 
	 * @param summand1 first summand
	 * @param summand2 second summand
	 * @return the sum
	 */
	public int add(final int summand1, final int summand2);

	/*
	 * @ensures divisor != 0 ==> \result = correctly rounded quotient
	 * @ensures divisor = 0 ==> exception
	 */
	/**
	 * Calculates the quotient of two integer values.
	 * 
	 * The result is correctly rounded. That is, the result is rounded up for
	 * decimals greater than or equal to 0.5 and rounded down for decimal smaller
	 * than 0.5.
	 *
	 * @param dividend number to be divided
	 * @param divisor  number to divide by
	 * @return the quotient
	 * @throws ArithmeticException if {@code divisor} is zero
	 */
	public int divide(int dividend, int divisor);

}