package de.unistuttgart.iste.sqa.pse.sheet11.tests.presence.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.calculator.BuggyCalculator;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.calculator.Calculator;


public class BuggyCalculatorTest2 {

	private Calculator calculator;

	@BeforeAll
	public void setUp() {
		calculator = new BuggyCalculator();
	}

	@Test
	public void testAddExact() {
		int result = calculator.addExact(25, 41);
		assertEquals(66, result);
	}

	@Test
	public void test2() {
		assertThrows(ArithmeticException.class, () -> calculator.addExact(Integer.MAX_VALUE, 1));
	}

	@Test
	public void test3() {
		assertThrows(ArithmeticException.class, () -> calculator.addExact(Integer.MIN_VALUE, -1));
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

	@Test
	public void test6() {
		assertThrows(ArithmeticException.class, () -> calculator.abs(Integer.MIN_VALUE));
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
