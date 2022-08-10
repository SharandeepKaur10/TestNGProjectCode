package com.testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_CheckPoints_Selnium {
//getTitle()
	//getCurrentUrl()
	//isEnabled()
	//isDisplayed()
	//isSelected()
	public static WebDriver driver;
	SoftAssert softassert =new SoftAssert();
	@Test
	public void getTitleMethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		String Title="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		System.out.println(driver.getCurrentUrl());
		String currentURL="https://www.rediff.com/";
		softassert.assertEquals(driver.getTitle(),"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");//false
	softassert.assertEquals("https://www.rediff.com",driver.getCurrentUrl());
	if(driver.getTitle().equals(Title) && driver.getCurrentUrl().equals(currentURL))
	{
		driver.findElement(By.className("signin")).click();
	System.out.println("The title of new page is:" + driver.getTitle() + "and current url is: " + driver.getCurrentUrl());
	String currentURL1= "https://mail.rediff.com/cgi-bin/login.cgi";
	String Title1="Rediffmail";
	if(driver.getTitle().equals(Title1) && driver.getCurrentUrl().equals(currentURL1))
	{
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		//driver.findElement(By.className("signinbtn")).click();)
	System.out.println("The title of inbox page is:" +driver.getTitle());
	System.out.println("the current url of inbox page is: " +driver.getCurrentUrl());
			if(driver.getTitle().equals("Rediffmail"))
			{
				driver.findElement(By.className("rd_logout")).click();
			WebElement signoutMessage=driver.findElement(By.xpath("//div[@class= 'panel']/child::p[1])"));
			//softassert.assertTrue(signoutMessage.isDisplayed());
			//driver.findElement(By.xpath(//p[contains(text(), )]))
			driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
			}
	}
	}
	else
	
	{
		System.out.println("title and current url are incorrect");
		}
	softassert.assertAll();
	}
}
