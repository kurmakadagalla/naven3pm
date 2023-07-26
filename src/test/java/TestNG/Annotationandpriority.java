package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotationandpriority {
	
	WebDriver driver;

	@Test(priority=1)
	void openApp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login()
	{
	 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr515032");
	 driver.findElement(By.name("password")).sendKeys("jahevUz");
	 driver.findElement(By.name("btnLogin")).click();
	 
	 WebElement Image= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/img[1]"));
		
		if(Image.isDisplayed())
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");	
		}
	}


	@Test(priority=3, dependsOnMethods= {"login"})
	void Search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=4, dependsOnMethods= {"openApp"})
	void Teardown()
	{
	driver.close();
	}
}
