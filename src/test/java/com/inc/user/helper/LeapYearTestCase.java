/**
 * 
 */
package com.inc.user.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Ananthan
 *
 */
public class LeapYearTestCase {

	@Test
	public void leapTestPassBy2000() {
		String msg = "Year 2000 should be a leap year.";
		boolean result = LeapYear.checkYear(2000);
		assertEquals(msg, true, result);
	}

	@Test
	public void leapTestPassBy2004() {
		String msg = "Year 2004 should be a leap year.";
		boolean result = LeapYear.checkYear(2004);
		assertEquals(msg, true, result);
	}

	@Test
	public void leapTesFailsBy1900() {
		String msg = "Year 1900 should not be a leap year.";
		boolean result = LeapYear.checkYear(1900);
		assertEquals(msg, false, result);
	}

	@Test
	public void leapTestFailBy2005() {
		String msg = "Year 2005 should not be a leap year.";
		boolean result = LeapYear.checkYear(2005);
		assertEquals(msg, false, result);
	}

}
