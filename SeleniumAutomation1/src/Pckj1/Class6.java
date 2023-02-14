package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                               //MOXIE20100 Akshay Patil
                                                              // Assignment No-27 Q-3

public class Class6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver2 = new ChromeDriver();
		driver2.navigate().to("https://www.ikea.com/in/en/?ref=gwp-start");
		Thread.sleep(3000);
		System.out.println("We open the website ikea.com");
		driver2.findElement(By.className("search-field__input")).sendKeys("table");
		System.out.println("We search for table in searchbox");
		Thread.sleep(3000);

	}

}
