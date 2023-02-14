package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    WebDriver driver =new ChromeDriver();
	       
			driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			WebElement Source =driver.findElement(By.id("fourth"));
			
			WebElement target =driver.findElement(By.id("amt7"));
			Actions act=new Actions(driver);
			act.dragAndDrop(Source, target).build().perform();

	}

}
