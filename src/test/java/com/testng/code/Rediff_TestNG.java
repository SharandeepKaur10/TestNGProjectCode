package com.testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG {
	public static WebDriver driver;
	@Test
	public void logincheck()
	{
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			WebElement username=driver.findElement(By.xpath("//input[@id='login1']"));
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			if (username.isEnabled()&& username.isDisplayed()&& password.isEnabled()&& password.isDisplayed())
			{username.sendKeys("Seleniumpanda@rediffmail.com");
			password.sendKeys("Selenium@123");
			driver.findElement(By.className("signinbtn")).click();
			driver.findElement(By.className("skiplink")).click();
			driver.findElement(By.className("rd_logout")).click();
			driver.quit();
			}
			else
			{
				System.out.println("username and password webelements dont exist");
	}
	
	}
}
