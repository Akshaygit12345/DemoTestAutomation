package Pckj1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexecutor_scrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeAsyncScript("window.scrollBy(0,500)");
		
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
