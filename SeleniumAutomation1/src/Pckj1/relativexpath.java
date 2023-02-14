package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://parivahan.gov.in/parivahan/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@Class='form-control form-text']")).sendKeys("vahan");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'G20')]")).click();
		driver.switchTo().alert().dismiss();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control form-text'and@id='edit-search-block-form--2']")).sendKeys("dealer");
		driver.findElement(By.xpath("//input[@id='edit-keys']")).sendKeys("dealer");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();

	}

}
