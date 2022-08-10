package com.testng.code;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence_TestNG_Annotation_Execution {
	@BeforeSuite
	public void beforeSuiteTest()
	{
		System.out.println("before suite annotation");
	}
	@BeforeTest
	public void beforeTestTest()
	{
		System.out.println("before test annotation");
	}
	@BeforeClass
	public void beforeClassTest()
	
	{System.out.println("before class annotation");
	}
	@BeforeMethod
	public void beforeMethodTest()
	
	{System.out.println("before method annotation");
	}
	@Test
	public void checkTest() {
		System.out.println("@test annotation");
	}
	@AfterMethod
	public void afterMethodTest()
	{
		System.out.println("after method annotation");
	}
	
	@AfterClass
	public void afterClassTest()
	{
		System.out.println("after class annotation");
	}
	@AfterTest
	public void afterTestTest()
	{
		System.out.println("after test annotation");
	}
	
	@AfterSuite
	public void afterSuiteTest()
	{
		System.out.println("after suite annotation");
	}
	

}
