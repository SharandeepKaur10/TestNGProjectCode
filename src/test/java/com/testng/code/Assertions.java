package com.testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
//Hard assert
	//Soft assert
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
	}
	@Test
	public void loginCredentials()
	{
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}
	@AfterTest
	public void logOut() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.className("rd_loout")).click();
}
}
