package Pckj1;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver =new ChromeDriver();
	       
		driver.navigate().to("https://www.google.co.in/");
		Cookie cokkie1=new Cookie("Google","www.google.com");
		driver.manage().addCookie(cokkie1);
		driver.navigate().to("https://www.facebook.com/");
		Cookie cokkie2=new Cookie("facebook","www.facebook.com");
		
		System.out.println(cokkie2.getName());
		System.out.println(cokkie2.getValue());
		
		//driver.manage().deleteCookieNamed("Facebook");
		
		try {
			System.out.println(driver.manage().getCookieNamed("Facebook").getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
