package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *  Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 */

public class RegisterTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        String expectedText = "Register";
        WebElement title = driver.findElement(By.xpath("//h1"));
        String actualText = title.getText();

        Assert.assertEquals(expectedText,actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        WebElement femaleElement = driver.findElement(By.id("gender-female"));
        femaleElement.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("dhwani");

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("ponkiya");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[text()='9']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[text()='March']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[text()='2001']")).click();

        driver.findElement(By.id("Email")).sendKeys("test5@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("test22");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test22");

        //click on register button
        driver.findElement(By.id("register-button")).click();

        //verify text
        String expectedText = "Your registration completed";
        String registrationSuccessText = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(expectedText, registrationSuccessText);


    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
