package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                //MOXIE20100 Akshay Patil
                                               // Assignment No-28 Q-2

public class gmailverify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("9168949759");
		System.out.println("User Name = 9168949759");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		System.out.println("We enter username and click on next button");
		Thread.sleep(3000);
		if(driver.findElement(By.className("VfPpkd-vQzf8d")).isDisplayed())
		{
	       System.out.println("Your Test case is pass");
		}
        else
        {
	       System.out.println("Test case fail");
        }

		


	}

}
