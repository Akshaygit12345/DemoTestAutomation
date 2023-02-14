package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		System.out.println("We open the yahho.com website");
		driver.findElement(By.id("login-username")).sendKeys("9168949759");
		System.out.println("We enter the user name = abc");
		driver.findElement(By.id("login-signin")).click();
		System.out.println("After enetring username we click on next button");
		Thread.sleep(3000);
		   if(driver.findElement(By.linkText("Help")).isDisplayed())
				{
			       System.out.println("Test case is pass");
				}
		   else
		   {
			   System.out.println("Test case fail");
		   }
		
	}

}
        //recaptcha-anchor-label