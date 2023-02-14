package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imglink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    WebDriver driver =new ChromeDriver();
	       
			driver.navigate().to("https://parivahan.gov.in/parivahan/");
			driver.findElement(By.linkText("About Us")).click();
			driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).click();
			String str=driver.getTitle();
			if (str.contains("Home"))
			{
				System.out.println("You are on right page");
			}
			else 
			{
				System.out.println("You are on wrong page");
			}

	}

}
