package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                   //MOXIE20100 Akshay Patil
                                                   // Assignment No-27 Q-1

public class Class4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		System.out.println("We open the yahho.com website");
		driver.findElement(By.id("login-username")).sendKeys("abc");
		System.out.println("We enter the user name = abc");
		driver.findElement(By.id("login-signin")).click();
		System.out.println("After enetring username we click on next button");
		
		
		

	}

}
