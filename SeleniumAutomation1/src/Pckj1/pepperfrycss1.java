package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pepperfrycss1 {                                               //MOXIE20100 AKshay Patil
	                                                                       // Assignment No-29 Q-1

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		driver.findElement(By.partialLinkText("Solidwood Office Chairs")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div.cat-wrap-ttl")).click();
		
		if(driver.findElement(By.partialLinkText("Fenna High Back Executive Chair In White Colour")).isDisplayed())
		{
			System.out.println("Test Case is Pass");
			System.out.println("First Executive chair is: Fenna High Back Executive Chair In White Colour ");
		}
		else
		{
			System.out.println("Test Case is Fail");
			System.out.println("First Executive chair is other");
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
             //System.out.println("First Executive chair is other");
            //System.out.println("First Executive chair is: Fenna High Back Executive Chair In White Colour ");