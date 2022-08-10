package com.testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Is {
	public static WebDriver driver;
	SoftAssert softassert=new SoftAssert();

@Test
public void validations()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	boolean signinLink=driver.findElement(By.className("signin")).isDisplayed() && driver.findElement(By.className("signin")).isEnabled();
	softassert.assertTrue(signinLink);
	driver.findElement(By.className("signin")).click();
}


@Test(dependsOnMethods="validations")
public void validations1()
{
	
	boolean loginBox=driver.findElement(By.id("login1")).isDisplayed() && driver.findElement(By.id("login1")).isEnabled();
	softassert.assertTrue(loginBox);
	driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
	
	
}
@Test(dependsOnMethods={"validations", "validations1"})
public void validations2()
{
	boolean passwordbox=driver.findElement(By.id("password")).isDisplayed() && driver.findElement(By.id("password")).isEnabled();
	softassert.assertTrue(passwordbox);
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	
}

	

@Test(dependsOnMethods= {"validations", "validations1", "validations2"})
public void validations3()
{
	boolean checkbox;
	if(checkbox=driver.findElement(By.id("remember")).isSelected())
	{
		softassert.assertTrue(checkbox);
	
	boolean signinbtn;
	if(signinbtn=driver.findElement(By.className("signinbtn")).isDisplayed())
	
		{softassert.assertTrue(signinbtn);
	driver.findElement(By.className("signinbtn")).click();
		}}
	else
	{
		System.out.println("cannot sign in");
	}

}
}