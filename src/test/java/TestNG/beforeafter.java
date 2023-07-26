package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeafter {
	
	WebDriver driver;
	
	@BeforeMethod
	
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/");
	}
	
	@Test
	
	void Login()
	{
		System.out.println("ID Password");
	}
	
	@Test
	
	void search()
	{
		System.out.println("Product");
	}
	
	@AfterMethod
	
	void CloseApp()
	{
		driver.close();
	}
	
	
	

}
