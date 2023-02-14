package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
                                                             //MOXIE20100 Akshay Patil
                                                            // Assignment No-27 Q-2

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver1 = new ChromeDriver();
		Thread.sleep(3000);
		driver1.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
		Thread.sleep(3000);
		driver1.findElement(By.id("identifierId")).sendKeys("prakshay1996@gmail.com");
		System.out.println("User Name = abc");
		Thread.sleep(3000);
		driver1.findElement(By.id("identifierNext")).click();
		System.out.println("We enter username and click on next button");
		Thread.sleep(3000);
		
         
	}

}
