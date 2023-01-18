package de.unistuttgart.iste.sqa.pse.sheet11.presence.student;

import java.util.Date;

/**
 * A simple Student class just for the purpose of showcasing JUnit tests.
 */
public class Student {
	private final String name;
	private final Date birthday;

	public Student(final String name, final Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	/**
	 * return the student's name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Check if the student was born before a certain date.
	 * For exemplary use only.
	 */
	public boolean bornBefore(final Date date) {
		return birthday.before(date);
	}
}
