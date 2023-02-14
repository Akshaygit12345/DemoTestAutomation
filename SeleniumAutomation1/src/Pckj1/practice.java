package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver1 = new ChromeDriver();
		Thread.sleep(3000);
		driver1.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
		Thread.sleep(3000);
		driver1.findElement(By.id("identifierId")).sendKeys("abc");
		System.out.println("User Name = abc");
		Thread.sleep(3000);
		driver1.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		System.out.println("Program Run Successfully");
		
		//        (//span[@class='VfPpkd-vQzf8d'])[2]

	}

}
