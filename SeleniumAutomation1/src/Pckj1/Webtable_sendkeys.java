package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	       
		driver.navigate().to("https://seleniumpractise.blogspot.com/");
		driver.findElement(By.xpath("//div[@class='container']//div//div//input[2]")).sendKeys("123");
		//String cellvalue=cell.getText();
		//System.out.println(cellvalue);


	}

}
