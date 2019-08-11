/**
 * 
 */
package com.inc.user.helper;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author apoongavanam
 *
 */
public class LoginHelperTest {

	
	  @BeforeClass public static void beforeClass() {
	  System.out.println("Before Class"); }
	  
	  @Before public void before() { System.out.println("Before Test Case"); }
	  
	  @Test public void isGreaterTest() { System.out.println("Test"); LoginHelper
	  loginHelper = new LoginHelper(); assertTrue("Num 1 is greater than Num 2",
	  loginHelper.isGreater(4, 3)); }
	  
	  @After public void after() { System.out.println("After Test Case"); }
	  
	  @AfterClass public static void afterClass() {
	  System.out.println("After Class"); }
	 

}
