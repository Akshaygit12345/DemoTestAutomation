package Pckj1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_And_doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		

		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).perform();
		
				
		
	

	}

}
