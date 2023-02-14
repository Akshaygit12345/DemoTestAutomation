package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltiphandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	       
		driver.navigate().to("https://parivahan.gov.in/parivahan/");
		WebElement searchbox=driver.findElement(By.id("edit-search-block-form--2"));
		String tooltip=searchbox.getAttribute("title");
		System.out.println(tooltip);

	}

}
