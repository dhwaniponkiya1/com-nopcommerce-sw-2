package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

public class TopMenuTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        WebElement computerTabElement = driver.findElement(By.linkText("Computers"));
        computerTabElement.click();

        String expectedText = "Computers";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
     public void userShouldNavigateToElectronicsPageSuccessfully(){
        WebElement electronicsTabElement = driver.findElement(By.linkText("Electronics"));
        electronicsTabElement.click();

        String expectedText = "Electronics";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement apparelTabElement = driver.findElement(By.linkText("Apparel"));
        apparelTabElement.click();

        String expectedText = "Apparel";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement downloadsTabElement = driver.findElement(By.linkText("Digital downloads"));
        downloadsTabElement.click();

        String expectedText = "Digital downloads";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement booksTabElement = driver.findElement(By.linkText("Books"));
        booksTabElement.click();

        String expectedText = "Books";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement jewelryTabElement = driver.findElement(By.linkText("Jewelry"));
        jewelryTabElement.click();

        String expectedText = "Jewelry";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement giftCardsTabElement = driver.findElement(By.linkText("Gift Cards"));
        giftCardsTabElement.click();

        String expectedText = "Gift Cards";
        WebElement pageTitleElement = driver.findElement(By.xpath("//h1"));
        String actualText = pageTitleElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
