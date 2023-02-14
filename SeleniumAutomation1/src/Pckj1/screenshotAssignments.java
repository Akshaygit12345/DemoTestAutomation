package Pckj1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
                                              //MOXIE20100 Akshay Patil
                                             // Assignment No-36 Q-1

public class screenshotAssignments {
	
	static WebDriver driver;
	
	static void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File target=new File("E:\\Automation\\Screenshot/"+System.currentTimeMillis()+".png");
		FileHandler.copy(source,target);
        
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.manage().window().maximize();
		screenshot(driver);
		
		System.out.println("Screenshot takes Successfully");
		

	}

}
