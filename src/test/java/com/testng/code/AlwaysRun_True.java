package com.testng.code;

import org.testng.annotations.Test;

public class AlwaysRun_True {

	@Test
	public void oneTestCase()
	{
		System.out.println("logic 1");
	}
	@Test
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
	@Test(alwaysRun=true, enabled=false)
	public void fiveTestCase()
	{
		System.out.println("logic 5");
	}
}
