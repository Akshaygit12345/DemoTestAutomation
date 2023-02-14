package Pckj1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertandDropDown {

	public static void main(String[] args) throws InterruptedException {       //MOXIE20100 Akshay Patil
		                                                                       //Assignment No-30
		// TODO Auto-generated method stub
		
		    WebDriver driver =new ChromeDriver();
        
			driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
		
	        driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Akshay");
	        
	        driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("patil");
	        
	        driver.findElement(By.id("newpasswd")).sendKeys("patil123");
	        
	        driver.findElement(By.id("newpasswd1")).sendKeys("patil123");
	        
	        driver.findElement(By.cssSelector("input[name^='alte']")).sendKeys("patil@gmail.com");
	        
	        driver.findElement(By.id("mobno")).sendKeys("1234567891");
	        
	        driver.findElement(By.id("Register")).click();
	        
	        System.out.println("---------- Alert Popup for select Date ----------");
	        
	       String Alert1=driver.switchTo().alert().getText();
		       System.out.println(Alert1);
		       if(Alert1.contains("date")) 
		       {
		    	   System.out.println("1st Test Case is Pass");
		       }
		       else {
		    	   System.out.println("1stTest case is fail");
		       }
		       driver.switchTo().alert().accept();
		       
	       Select s1=new Select( driver.findElement(By.cssSelector("select[name^='DOB_Day']")));
	        
	       s1.selectByValue("05");
	       driver.findElement(By.id("Register")).click();
	       
	       System.out.println("---------- Alert Popup for select Month ----------");
	       
	       String Alert2=driver.switchTo().alert().getText();
	       System.out.println(Alert2);
	       if(Alert2.contains("month")) 
	       {
	    	   System.out.println("2nd Test Case is Pass");
	       }
	       else {
	    	   System.out.println("2nd Test case is fail");
	       }
	       driver.switchTo().alert().accept();
	       Select s2=new Select( driver.findElement(By.cssSelector("select[name^='DOB_Month']")));
	       s2.selectByValue("05");
	       driver.findElement(By.id("Register")).click();
	       
	       System.out.println("---------- Alert Popup for select Year ----------");
	       
	       String Alert3=driver.switchTo().alert().getText();
	       System.out.println(Alert3);
	       if(Alert3.contains("year")) 
	       {
	    	   System.out.println("3rd Test Case is Pass");
	       }
	       else {
	    	   System.out.println("3rd Test case is fail");
	       }
	       driver.switchTo().alert().accept();
	       Select s3=new Select( driver.findElement(By.cssSelector("select[name^='DOB_Year']")));
	       s3.selectByValue("2021");
	       
	       
	        
	}

}
