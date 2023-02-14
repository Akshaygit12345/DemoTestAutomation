package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploaderbysendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver =new ChromeDriver();
	       
			driver.navigate().to("https://the-internet.herokuapp.com/upload");
			driver.manage().window().maximize();
			driver.findElement(By.id("file-upload")).sendKeys("E:\\Assignment1\\Assignment No-1 Part-1.PNG");
			driver.findElement(By.id("file-submit")).click();

	}

}
