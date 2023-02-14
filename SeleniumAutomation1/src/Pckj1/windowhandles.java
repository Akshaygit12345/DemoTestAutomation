package Pckj1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	       
		driver.navigate().to("https://www.pepperfry.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ftr-social-link youtube']")).click();
		Set<String> handle=driver.getWindowHandles();
				Iterator it=handle.iterator();
		String parent=(String) it.next();
		String child=(String) it.next();
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Table");
		
		
		
		

	}

}
