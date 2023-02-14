package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("moneyiframe");
		
		
		//driver.findElement(By.id("bseindex")).click();
		WebElement frame=driver.findElement(By.id("moneyiframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("bseindex")).click();

	}

}
