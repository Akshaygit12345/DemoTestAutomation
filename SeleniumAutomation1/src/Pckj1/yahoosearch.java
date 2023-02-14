package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                         //MOXIE20100 Akshay Patil
                                                        // Assignment No-28 Q-3

public class yahoosearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://sg.search.yahoo.com/");
		driver.findElement(By.linkText("Help")).click();
		if(driver.findElement(By.linkText("Mobile")).isDisplayed())
		{
	       System.out.println("1st Test case is pass");
		}
       else
        {
	       System.out.println("Test case fail");
        }
		driver.navigate().back();
		driver.findElement(By.linkText("Privacy")).click();
		
		if(driver.findElement(By.linkText("Third Parties")).isDisplayed())
		{
	       System.out.println("2nd Test case is pass");
		}
       else
        {
	       System.out.println("Test case fail");
        }
		driver.navigate().back();
		driver.findElement(By.linkText("Terms")).click();
		if(driver.findElement(By.partialLinkText("legacy Yahoo")).isDisplayed())
		{
	       System.out.println("3rd Test case is pass");
		}
       else
        {
	       System.out.println("Test case fail");
        }
		driver.navigate().back();
		driver.findElement(By.linkText("Privacy dashboard")).click();
		if(driver.findElement(By.linkText("Dashboard")).isDisplayed())
		{
	       System.out.println("4th Test case is pass");
		}
       else
        {
	       System.out.println("Test case fail");
        }
		driver.navigate().back();
		driver.findElement(By.linkText("Advertise")).click();
		if(driver.findElement(By.partialLinkText("Checking the")).isDisplayed())
		{
	       System.out.println("5th Test case is pass");
		}
       else
        {
	       System.out.println("Test case fail");
        }

	}

}
