package com.testng.code;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG_Annotations {
public static WebDriver driver;
@BeforeTest
public void launchBrowser()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
}
@Test(dependsOnMethods="launchBrowser")
public void loginCredentials()
{
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Seleniumpanda@rediffmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	Assert.fail("failing the testcase");
}
@AfterTest(dependsOnMethods= {"launchBrowser", "loginCredentials"})
public void logOut() throws Exception {
	Assert.assertEquals(true, 0<1);
	Thread.sleep(5000);
	Assert.assertTrue(true!=false);
	driver.findElement(By.className("rd_logout")).click();

}
}
