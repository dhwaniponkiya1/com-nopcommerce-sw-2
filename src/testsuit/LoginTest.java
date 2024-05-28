package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. TopMenuTest
 * 3. RegisterTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

public class LoginTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();

        Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement emailElement = driver.findElement(By.id("Email"));
        WebElement passwordElement = driver.findElement(By.id("Password"));
        emailElement.sendKeys("prime123@gmail.com");
        passwordElement.sendKeys("prime123");

        //click on login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //logout element
        WebElement logoutLink = driver.findElement(By.linkText("Log out"));
        String expectedText = "Log out";
        String actualText = logoutLink.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailElement = driver.findElement(By.id("Email"));
        WebElement passwordElement = driver.findElement(By.id("Password"));
        emailElement.sendKeys("test123@gmail.com");
        passwordElement.sendKeys("Test@354");

        //click on login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement errorTextElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText = errorTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
