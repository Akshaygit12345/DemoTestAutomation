package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath_text_startwith_endwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//u[text()='Create a new account']
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
		//driver.findElement(By.xpath("//u[text()='Forgot Password?']")).click();
		//driver.findElement(By.xpath("//input[starts-with(@name,'pro')]")).click();

	}

}
