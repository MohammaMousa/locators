import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://a.testaddressbook.com");
		
		//testcase 1 --> tese home button ...
		
		driver.findElement(By.className("nav-item")).click();
		
		//testcase 2 --> tese sign In page ...

		driver.findElement(By.id("sign-in")).click();
		
		  //testcase 3 ---> test when email and password empty
		  
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("");
		  driver.findElement(By.id("session_password")).sendKeys("");
		  driver.findElement(By.className("btn-primary")).click();
		  
		  //testcase 4 ---> test when fill email and password
		  
		  
		  driver.findElement(By.className("form-control")).sendKeys("Qusai@gmail.com");
		  driver.findElement(By.id("session_password")).sendKeys("123456789");
		  driver.findElement(By.className("btn-primary")).click();
		  
		  //testcase 5---> test when fill email and password empty
		  
		  driver.findElement(By.className("form-control")).sendKeys("Qusai@gmail.com");
		  driver.findElement(By.cssSelector("input#session_password")).sendKeys("");
		  driver.findElement(By.className("btn-primary")).click();
		  
		  //testcase 6 ---> test when fill password and email empty
		  
		  driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("");
		  driver.findElement(By.id("session_password")).sendKeys("123456789");
		  driver.findElement(By.className("btn-primary")).click();
		  
		  
		 
		
		
		
		
	}

}
