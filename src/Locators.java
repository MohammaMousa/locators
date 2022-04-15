
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constatns.LoginTestsConstants;



public class Locators {

	private static String username = "Qusai@gmail.com";
	private static String password = "123456789";
	private static String websiteLink = "http://a.testaddressbook.com";
	
	//TODO: **Important** download Intellij
	//TODO: Add beforeeach method to open chrome.
	//TODO: Add aftereach method to close chrome.

	@Test
	public static void main(String[] args) {

		// testcase 1 --> tese home button ...

		//TestHomeButtton();

		// testcase 2 --> tese sign In page ...

		//TestSignInPage();
		
		// testcase 3 ---> test when email and password empty

		//EmailAndPasswordEmpty();

		// testcase 4 ---> test when fill email and password
		
		//FillEmailAndPassword();

		// testcase 5---> test when fill email and password empty
		
		//FillEmailAndPasswordEmpty();

		// testcase 6 ---> test when fill password and email empty

		//FillPasswordAndEmailEmpty();
		
		//testAssertTitle();
		testSignInIsClicked();

	}

	@Test
	public static void TestHomeButtton() {

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(websiteLink);
		driver.findElement(By.className("nav-item")).click();
	}
	
	

	@Test
	public static void TestSignInPage() {

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(websiteLink);
		driver.findElement(By.id("sign-in")).click();

	}

	@Test
	public static void EmailAndPasswordEmpty() {

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(websiteLink);
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("");
		driver.findElement(By.id(LoginTestsConstants.session_pass)).sendKeys("");
		driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
	}

	@Test
	public static void FillEmailAndPassword() {

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(websiteLink);
		driver.findElement(By.className("form-control")).sendKeys(username);
		driver.findElement(By.id(LoginTestsConstants.session_pass)).sendKeys(password);
		driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
	}

	@Test
	public static void FillEmailAndPasswordEmpty() {

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(websiteLink);
		driver.findElement(By.className("form-control")).sendKeys(username);
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("");
		driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
	}

	@Test
	public static void FillPasswordAndEmailEmpty() {

		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(websiteLink);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("");
		driver.findElement(By.id(LoginTestsConstants.session_pass)).sendKeys(password);
		driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();

	}
	
	@Test
	public static void testAssertTitle() {
		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://a.testaddressbook.com");
		String ActualTitle = driver.getTitle();
		String ExeptedTitle = "Address Book";
		AssertJUnit.assertEquals(ExeptedTitle, ActualTitle);
	}
	
	@Test
	public static void testSignInIsClicked() {
		System.setProperty("webdriver.chrome.driver", "/Users/qusaimousa/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("sign-in")).click();
		AssertJUnit.assertTrue(driver.findElement(By.id("sign-in")).isSelected());
        System.out.println(driver.findElement(By.id("sig-in")).isSelected());  

		
	}
	

}
