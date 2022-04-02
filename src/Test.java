import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

		
		driver.findElement(By.cssSelector("input.whsOnd")).sendKeys("Qusai");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mousa");
		
		
	}

}
