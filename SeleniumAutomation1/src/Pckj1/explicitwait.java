package Pckj1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class explicitwait {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File target=new File("E:\\Automation\\Screenshot/"+System.currentTimeMillis()+".png");
		FileHandler.copy(source,target);
		
        
		
		driver.findElement(By.linkText("Create Account")).click();
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		File source1=screenshot.getScreenshotAs(OutputType.FILE);
		File target1=new File("E:\\Automation\\Screenshot/"+System.currentTimeMillis()+".png");
		FileHandler.copy(source1,target1);
        

	}

}
