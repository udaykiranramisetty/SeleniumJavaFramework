package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTestNG {
	@Test
	public void test() {
		
		Assert.assertTrue(true); //pass
	}
	@Test
	public void test1() {

		Assert.assertTrue(false); //fail
	}
	@Test
	public void test2() {
	Assert.assertEquals("Test", "Test1"); //fail
	}
	@Test
	public void test3() {
		Assert.assertEquals("Test", "Test"); //fail
	}
	@Test
	public void test4() {
		Assert.assertTrue(false, "Not Matching the expected condition"); //fail
	}
	@Test
	public void test5() {
		Assert.assertFalse(false, "This is Expected"); //pass
	}
	@Test
	public void test6() {
		Assert.assertNotEquals("Test", "Test1"); //pass
	}

}
