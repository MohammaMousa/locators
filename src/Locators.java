
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import constatns.LoginTestsConstants;
import config.properties.Properties;

import static org.testng.AssertJUnit.assertEquals;

public class Locators {

    private static String username = "Qusai@gmail.com";
    private static String password = "123456789";

    public static WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", Properties.DRIVER_PATH);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void CloseBrowser() {
        driver.close();
    }


    public static void main(String[] args) {
    }

    @Test
    public static void TestHomeButtton() {
        driver.navigate().to(Properties.BROWSER_LINK);
        driver.findElement(By.className("nav-item")).click();
        String actualResult = driver.getTitle();
        String exeptedResult = "Address Book";
        assertEquals(exeptedResult, actualResult);

    }


    @Test
    public static void TestSignInPage() {
        driver.navigate().to(Properties.SIGNIN_LINK);
        driver.findElement(By.id("sign-in")).click();
        String actualResult = driver.getTitle();
        String exeptedResult = "Address Book - Sign In";
        assertEquals(exeptedResult, actualResult);


    }

    @Test
    public static void EmailAndPasswordEmpty() {
        driver.navigate().to(Properties.SIGNIN_LINK);
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("");
        driver.findElement(By.id(LoginTestsConstants.SESSSION_PASSWORD)).sendKeys("");
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
       String notice = driver.findElement(By.className("alert")).getText();
        String actualResult = notice;
        String exeptedResult = "Bad email orpassword.";
        Assert.assertNotEquals(exeptedResult, actualResult);
    }

    @Test
    public static void FillEmailAndPassword() {

        driver.navigate().to(Properties.SIGNIN_LINK);
        driver.findElement(By.className("form-control")).sendKeys(username);
        driver.findElement(By.id(LoginTestsConstants.SESSSION_PASSWORD)).sendKeys(password);
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
        String notice = driver.findElement(By.className("alert")).getText();
        Boolean verifyResult = notice.equalsIgnoreCase("Bad email or password.");
        AssertJUnit.assertNotNull(verifyResult);
    }

    @Test
    public static void FillEmailAndPasswordEmpty() {


        driver.navigate().to(Properties.SIGNIN_LINK);
        driver.findElement(By.className("form-control")).sendKeys(username);
        driver.findElement(By.cssSelector("input#session_password")).sendKeys("");
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
        String notice = driver.findElement(By.className("alert")).getText();
        Boolean verifyResult = notice.equalsIgnoreCase("Bad email or password..");
        Assert.assertFalse(verifyResult);
    }

    @Test
    public static void FillPasswordAndEmailEmpty() {

        driver.navigate().to(Properties.SIGNIN_LINK);
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("");
        driver.findElement(By.id(LoginTestsConstants.SESSSION_PASSWORD)).sendKeys(password);
        driver.findElement(By.className(LoginTestsConstants.BTN_PRIMARY)).click();
        String notice = driver.findElement(By.className("alert")).getText();
        Boolean verifyResult = notice.equalsIgnoreCase("Bad email or password.");
        Assert.assertTrue(verifyResult);

    }


}
