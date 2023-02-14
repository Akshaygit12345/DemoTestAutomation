package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

                                                         //MOXIE20100 Akshay Patil
                                                        // Assignment No-35

public class scrollhorizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://www.vogue.es/micros/tendencias-moda-anos-80/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		
		js.executeScript("window.scrollBy(2000,0)");
		
		
		

		
		System.out.println("Successfully Scroll to Horizontal");
		
		


	}

}
