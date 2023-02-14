package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;             //MOXIE20100 Akshay Patil
                                                            // Assignment No-25

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/");
		
		System.out.println("Firefox driver running successfully");
		WebDriver driver1 = new EdgeDriver();
		driver1.navigate().to("https://www.amazon.com/");
		
		System.out.println("Edge driver running successfully");
		

		

		
		
		
	}

}
