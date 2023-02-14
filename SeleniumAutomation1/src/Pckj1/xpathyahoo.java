package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                  //MOXIE20100 Akshay Patil
                                                 // Assignment No-34
         
public class xpathyahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		driver.manage().window().maximize();
		
		//Element locate using xpath by start with method
		driver.findElement(By.xpath("//a[starts-with(@id,'create')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'input-with-icon icon-name')]")).sendKeys("Akshay");
		
		//Element locate using xpath by contains method
		driver.findElement(By.xpath("//input[contains(@id,'usernamereg-lastName')]")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[starts-with(@id,'usernamereg-userId')]")).sendKeys("akshaypatil720");
		
		//Element locate using xpath by basic method
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@916894975988");
		driver.findElement(By.xpath("//input[@id='usernamereg-birthYear'and@name='birthYear']")).sendKeys("1996");
		boolean a=driver.findElement(By.xpath("//button[text()='Continue']")).isEnabled();
		System.out.println(a);
		driver.findElement(By.xpath("//a[@class='js-link-feedback']")).click();
		
		String str=driver.getTitle();
		System.out.println(str);
		if(str.contains("Ya"))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Unverified");
		}
		
		
	}

}
