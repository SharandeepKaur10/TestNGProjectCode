package com.testng.code;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tri_Combo_TestNG {

	//@BeforeMethod+@Test+@AfterMethod
	@BeforeMethod()
	public void beforeMethodTest()
	{
		System.out.println("beginning of logic");
	}
	@Test
	public void testcase1()
	{
		System.out.println("logic 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("logic 2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("logic 3");
	}
	@AfterMethod()
	public void afterMethodTest()
	{
		System.out.println("logic ending");
	}
}
