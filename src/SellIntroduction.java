import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/qusaimousa/Documents/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iherb.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		 
		
		
	}

}
