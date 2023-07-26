package TestNG;

import java.awt.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping {
	
	WebDriver driver;
	
	@Test(priority=1, groups= {"sanity", "regression"})
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
	}

	
	@Test(priority=2, groups= {"sanity", "regression"})
	void login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr513562");
		driver.findElement(By.name("password")).sendKeys("YbutUrA");
		driver.findElement(By.name("btnLogin")).click();
		
		WebElement Image=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/img[1]"));
		
		if(Image.isDisplayed())
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}

    @Test(priority=3, groups={"Sanity"})
	void Search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=4, groups={"regression"})
	void CloseApp()
	{
		driver.close();
	}

}
