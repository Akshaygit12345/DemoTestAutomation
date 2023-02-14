package Pckj1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;             
                                                //MOXIE20100 Akshay Patil
                                               // Assignment No-36 Q-2

public class rediffscreenAssignments {
    static WebDriver driver;
	
	static void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File target=new File("E:\\Automation\\Screenshot/"+System.currentTimeMillis()+".png");
		FileHandler.copy(source,target);
        
	} 
	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("(//a[@class='backgurus'])[2]")).click();
		screenshot(driver);
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		driver.findElement(By.xpath("(//a[@class='backvid'])[2]")).click();
		screenshot(driver);
		driver.navigate().back();
		
		
		
		
		driver.findElement(By.xpath("(//a[@class='backnews'])[4]")).click();
		screenshot(driver);
		driver.navigate().back();
		
		
		
		driver.findElement(By.xpath("(//a[@class='backgetahead'])[3]")).click();
		screenshot(driver);
		driver.navigate().back();
		
		
		
		driver.findElement(By.xpath("(//a[@class='backshop'])[5]")).click();
		screenshot(driver);
		driver.navigate().back();
		
		
		
		
	}



}
