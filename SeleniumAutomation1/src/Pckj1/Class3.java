package Pckj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		                                                               //MOXIE20100 Akshay Patil
		                                                               // Assignment No-26 Q-2

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.lenskart.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https:www.gmail.com");
		Thread.sleep(3000);
	
		
		
		driver.navigate().back();
		
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		
		System.out.println(title);
		Thread.sleep(4000);
	
		
		
		driver.navigate().forward();
		driver.manage().window().maximize();
		
		String title1=driver.getTitle();
		
		System.out.println(title1);
	
		
		
		
	    if(title1.contains("Flipkart"))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
	    Thread.sleep(3000);
		driver.close();
		
		

	}

}
