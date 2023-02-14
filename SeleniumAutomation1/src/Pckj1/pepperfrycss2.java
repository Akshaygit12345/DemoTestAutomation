package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                      //MOXIE20100 AKshay Patil
                                                     // Assignment No-29 Q-2
public class pepperfrycss2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.pepperfry.com/grievance_redressal.html?type=footer");
		
		
		driver.findElement(By.linkText("Gift Cards")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#gft-crd-no")).sendKeys("12345678910111213");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id=gft-crd-pin]")).sendKeys("123456");
		
		
		  if(driver.findElement(By.cssSelector("div[class^='select-cta inpt-box']")).isEnabled())
		  {
			     System.out.println("Button is Enabled");
		  }
	      else
		  { 
	    	     System.out.println("Button is Disabled");
		  }
		  
		 
	}

}
