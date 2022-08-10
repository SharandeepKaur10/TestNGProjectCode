package com.testng.code;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
//if u r not using priority in all testcases testNG will follow alphabetical order as per method.
//priority starts from 0 and go onwards.if two testcases have same priority it will be executed alphabetically.
public class Only_TestCases {

	@Test(priority=0)
	public void oneTestCase()
	{
		System.out.println("logic 1");
	}
	@Test(priority=2)
	public void twoTestCase()
	{
		System.out.println("logic 2");
	}
	@Test(priority=1)
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
