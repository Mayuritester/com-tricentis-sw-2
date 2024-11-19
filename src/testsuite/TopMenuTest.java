//**1. userShouldNavigateToComputerPageSuccessfully()
//* click on the ‘COMPUTERS’ Tab
//* Verify the text ‘Computers’
//2. userShouldNavigateToElectronicsPageSuccessfully()
//* click on the ‘ELECTRONICS’ Tab
//* Verify the text ‘Electronics’
//3. userShouldNavigateToApparelAndShoesPage
//Successfully()
//* click on the ‘APPAREL & SHOES’ Tab
//* Verify the text ‘Apparel & Shoes’
//4.
//userShouldNavigateToDigitalDownloadsPageSuccessfully()
//* click on the ‘DIGITAL DOWNLOADS’ Tab
//* Verify the text ‘Digital downloads’
//5. userShouldNavigateToBooksPageSuccessfully()
//* click on the ‘BOOKS’ Tab
//* Verify the text ‘Books’
//6. userShouldNavigateToJewelryPageSuccessfully()
//* click on the ‘JEWELRY’ Tab
//* Verify the text ‘Jewelry’
//7. userShouldNavigateToGiftCardsPageSuccessfully()
//* click on the ‘GIFT CARDS’ Tab
//* Verify the text ‘Gift Cards’
package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseURL = "https://demowebshop.tricentis.com/";

    @Before
    public void setup() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
        String expectedText = "Computers";
        WebElement computer = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualText = computer.getText();
        Assert.assertEquals("not directed to computer page", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
        String expectedText1 = "Electronics";
        WebElement electronic = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualText1 = electronic.getText();
        Assert.assertEquals("not directed to eletronic page", expectedText1, actualText1);
    }

    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
        String expectedText2 = "Apparel & Shoes";
        WebElement apparelandShoes = driver.findElement(By.xpath("//h1[contains(text(),'Apparel & Shoes')]"));
        String actualText2 = apparelandShoes.getText();
        Assert.assertEquals("not directed to Apparel and shoes page", expectedText2, actualText2);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();
        String expectedText2 = "Digital downloads";
        WebElement digitaldownloads = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualText2 = digitaldownloads.getText();
        Assert.assertEquals("not directed to Digital downloads page", expectedText2, actualText2);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        String expectedText = "Books";
        WebElement books = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualText = books.getText();
        Assert.assertEquals("not directed to Books page", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
        String expectedText = "Jewelry";
        WebElement jewelry = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualText = jewelry.getText();
        Assert.assertEquals("not directed to Jewelry page", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[7]/a[1]")).click();
        String expectedText2 = "Gift Cards";
        WebElement giftCards = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualText2 = giftCards.getText();
        Assert.assertEquals("not directed to Gift Cards page", expectedText2, actualText2);

    }

    @After
    public void teardown() {
        driver.quit();
    }
}

