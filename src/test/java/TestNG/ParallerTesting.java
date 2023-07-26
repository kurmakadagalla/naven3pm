package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

  public class ParallerTesting {
     WebDriver driver;
	
	@Test(priority=1)
    @Parameters({"browser"})
	void OpenApp(String PB)
	{
		if(PB.equals("Chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(PB.endsWith("Edge"))
		{
			driver =new EdgeDriver();
		}
		else
		{
			driver =new FirefoxDriver();
		}
		driver.get("https://www.demo.guru99.com/v4");
	}

	
	@Test(priority=2)
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

    @Test(priority=3)
	void Search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=4)
	void CloseApp()
	{
		driver.close();
	}


}
