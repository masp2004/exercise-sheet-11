package de.unistuttgart.iste.sqa.pse.sheet11.tests.presence.calculator;

import static org.junit.Assert.assertEquals;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.calculator.BuggyCalculator;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

public class BuggyCalculatorTest2 {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new BuggyCalculator();
	}

	@Test
	public void testAddExact() {
		int result = calculator.addExact(25, 41);
		assertEquals(66, result);
	}

	@Test(expected = ArithmeticException.class)
	public void test2() {
		calculator.addExact(Integer.MAX_VALUE, 1);
	}

	@Test(expected = ArithmeticException.class)
	public void test3() {
		calculator.addExact(Integer.MIN_VALUE, -1);
	}

	@Test
	public void test4() {
		int result = calculator.abs(3);
		assertEquals(3, result);
	}

	@Test
	public void test5() {
		int result = calculator.abs(-4);
		assertEquals(4, result);
	}

	@Test(expected = ArithmeticException.class)
	public void test6() {
		calculator.abs(Integer.MIN_VALUE);
	}

	@Test
	public void test7() {
		int result = calculator.addExact(-2, -4);
		assertEquals(-6, result);
	}

	@Test
	public void test8() {
		int result = calculator.addExact(0, 0);
		assertEquals(0, result);
	}

	@Test
	public void test9() {
		int result = calculator.abs(0);
		assertEquals(0, result);
	}

	@Test
	public void test10() {
		int result = calculator.abs(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, result);
	}
}
