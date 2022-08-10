package com.testng.code;

import org.testng.annotations.Test;

public class Enablememt_Disablement_TestCase {

	@Test
	public void oneTestCase()
	{
		System.out.println("logic 1");
	}
	@Test(enabled=false)
	public void twoTestCase()
	{
		System.out.println("logic 2");
	}
	@Test
	public void threeTestCase()
	{
		System.out.println("logic 3");
		
	}
	@Test
	public void fourTestCase()
	{
		System.out.println("logic 4");
	}
	@Test(enabled=true)
	public void fiveTestCase()
	{
		System.out.println("logic 5");
	}
}
