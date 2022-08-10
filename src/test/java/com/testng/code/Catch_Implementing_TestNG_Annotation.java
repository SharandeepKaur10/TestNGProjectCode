package com.testng.code;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Catch_Implementing_TestNG_Annotation {
@BeforeTest
public void launchBrowser()
{
	
System.out.println("launch browser logic");
}
//if @Test is not there the class is not executable.
//so always add @Test
//before and after annotations canot run without @Test.but @Test can run without other annotations.
@Test
public void iAMMust()
{
	System.out.println(" @Test is must");
}

/*@AfterTest
*public void tierDown()
*{
*	System.out.println("my code is over");
*}
*/}