

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import constatns.LoginTestsConstants;
import config.properties.Properties;

public class Locators {

    private static String username = "Qusai@gmail.com";
    private static String password = "123456789";

    public static WebDriver driver;
@AfterTest
public void closeTab(){
    driver = new ChromeDriver();
    driver.close();


}

    public static void main(String[] args) {
    }

    @Test
    public static void TestHomeButtton() {


        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com");
        driver.findElement(By.className("nav-item")).click();
    }


    @Test
    public static void TestSignInPage() {

        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com");
        driver.findElement(By.id("sign-in")).click();

    }

    @Test
    public static void EmailAndPasswordEmpty() {

        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("");
        driver.findElement(By.id(LoginTestsConstants.SESSSION_PASSWORD)).sendKeys("");
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
    }

    @Test
    public static void FillEmailAndPassword() {

        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.className("form-control")).sendKeys(username);
        driver.findElement(By.id(LoginTestsConstants.SESSSION_PASSWORD)).sendKeys(password);
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
    }

    @Test
    public static void FillEmailAndPasswordEmpty() {

        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.className("form-control")).sendKeys(username);
        driver.findElement(By.cssSelector("input#session_password")).sendKeys("");
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
    }

    @Test
    public static void FillPasswordAndEmailEmpty() {

        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("");
        driver.findElement(By.id(LoginTestsConstants.SESSSION_PASSWORD)).sendKeys(password);
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();

    }

    @Test
    public static void testAssertTitle() {
        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com");
        String ActualTitle = driver.getTitle();
        String ExeptedTitle = "Address Book";
        AssertJUnit.assertEquals(ExeptedTitle, ActualTitle);
    }

    @Test
    public static void testSignInIsClicked() {
        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com");
        driver.findElement(By.id("sign-in")).click();
        AssertJUnit.assertFalse(driver.findElement(By.id("sign-in")).isSelected());


    }


}
