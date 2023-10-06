package de.unistuttgart.iste.sqa.pse.sheet11.tests.presence.student;


import de.unistuttgart.iste.sqa.pse.sheet11.presence.student.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * This class is for explanatory use only.
 */
public class StudentTest {
	private Student student;

	@BeforeAll
	public void setUp() {
		Date birthdate = new Date(100, 1, 1);
		student = new Student("Max Mustermann", birthdate);
	}

	@Test
	public void testCorrectValue() {
		assertEquals("Max Mustermann", student.getName());
	}

	@Test
	public void testWrongValue() {
		assertEquals("Paule", student.getName());
	}

	@Test
	public void testBoolean() {
		Date now = new Date();
		assertTrue(student.bornBefore(now));
	}

	@Test
	public void testNull() {
		student.bornBefore(null);
	}

	@Test
	public void testNullException() {
		assertThrows(NullPointerException.class, () -> student.bornBefore(null));
	}
}
