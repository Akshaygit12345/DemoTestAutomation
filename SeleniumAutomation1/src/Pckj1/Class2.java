package Pckj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                               // MOXIE20100 Akshay Patil
                                               // Assignment No-26 Q-1

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(2000);
		
		
		driver.close();
		
		

	}

}
