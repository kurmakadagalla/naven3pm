package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Guru99 Bank Home Page 
// Guru99 Bank Manager HomePage 

public class Dataproviders { 
	WebDriver driver;
	@BeforeClass
	void Setup()
	{
		driver =new ChromeDriver();
	}
	
	@Test(dataProvider="DP")
	void Login(String id,String pwd)
	{
		driver.get("https://www.demo.guru99.com/v4");
		driver.findElement(By.name("uid")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		
		try {
			driver.switchTo().alert().accept();
			
		}
		catch(NoAlertPresentException ex)
		{
			System.out.println("No Alert");
		}
	 
		
		String Exp_title="Guru99 Bank Manager HomePage";
		String Act_title=driver.getTitle();
		Assert.assertEquals(Exp_title, Act_title);
		
	}
			
		@AfterTest
		void TearDown()
		{
			driver.close();
		}
		
		@DataProvider(name="DP")
		String [][] LoginDate()
		{
			String data[][]= {
					{"khannaia","1234"},
					{"kurma","23456"},
					{"mngr515032","jahevUz"}
					
			}; return data;
		}

}
