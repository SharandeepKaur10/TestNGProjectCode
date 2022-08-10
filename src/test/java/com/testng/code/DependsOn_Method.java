package com.testng.code;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn_Method {
	@Test
	public void oneTestCase()
	{
		System.out.println("logic 1");
		Assert.fail("failing the test case");
	}
	@Test(dependsOnMethods="oneTestCase", alwaysRun=true)
	public void twoTestCase()
	{
		System.out.println("logic 2");
	}
	@Test(dependsOnMethods={"oneTestCase", "twoTestCase"})
	public void threeTestCase()
	{
		System.out.println("logic 3");
		
	}
	@Test
	public void fourTestCase()
	{
		System.out.println("logic 4");
	}
	@Test(enabled=false)
	public void fiveTestCase()
	{
		System.out.println("logic 5");
	}
}
