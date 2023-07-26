package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		
		//complete Screen
		
		/*TakesScreenshot TS=(TakesScreenshot)driver;
		
		File LoginPage =TS.getScreenshotAs(OutputType.FILE);
		
		File Logintrg =new File("C:\\Users\\hp\\eclipse-workspace\\naven3pm\\Screenshot\\Login.png");
		
		FileUtils.copyFile(LoginPage, Logintrg);*/
		
		//Element
		
		WebElement guru99 =driver.findElement(By.xpath("//h2"));
		
		File guru =guru99.getScreenshotAs(OutputType.FILE);
		File gurutrg =new File("C:\\Users\\hp\\eclipse-workspace\\naven3pm\\Screenshot\\guruText.png");
		FileUtils.copyFile(guru, gurutrg);
		
	
	}

}
