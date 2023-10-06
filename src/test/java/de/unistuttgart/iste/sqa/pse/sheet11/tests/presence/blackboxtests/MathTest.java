package de.unistuttgart.iste.sqa.pse.sheet11.tests.presence.blackboxtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.blackboxtests.Math;

/**
 * Tests for the black-box-tests exercise on sheet 11.
 */
public class MathTest {

	
	@Test
	public void test() {
		assertEquals(1, Math.floorDiv(2, 2));
	}
	
	// TODO: insert more testcases for 
	
	
}