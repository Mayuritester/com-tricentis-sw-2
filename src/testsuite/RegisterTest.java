//**class
//1. userShouldNavigateToRegisterPageSuccessfully()
//* click on the ‘Register’ link
//* Verify the text ‘Register’
//2. userSholdRegisterAccountSuccessfully
//* click on the ‘Register’ link
//* Select the gender radio button
//* Enter the First name
//* Enter the Last name
//* Enter Email address
//* Enter Password
//* Enter Confirm password
//* Click on the ‘Register’ button
//* Verify the text 'Your registration completed’

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterTest extends BaseTest {

String baseURL = "https://demowebshop.tricentis.com/";

//Method to open the URL
@Before
public void setup (){
    openBrowser (baseURL);
}

@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
    WebElement registerlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
    registerlink.click();
    String expectedText = "Register";
    WebElement register = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
    String actualText = register.getText();
    Assert.assertEquals("Page didnt divert to Register page", expectedText, actualText);
}

@Test
    public void userSholdRegisterAccountSuccessfully (){
    WebElement registerlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
    registerlink.click();
    WebElement radioButton = driver.findElement(By.id("gender-female"));
    radioButton.click();
    driver.findElement(By.id("FirstName")).sendKeys("Seema");
    driver.findElement(By.id("LastName")).sendKeys("Patel");
    driver.findElement(By.id("Email")).sendKeys("computer.tester009@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("Test1234");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234");
    driver.findElement(By.id("register-button")).click();
    String expectedText = "Your registration completed";
    WebElement register = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
    String actualText = register.getText();
    Assert.assertEquals("Registration completed message not displayed", expectedText, actualText);

}

@After

    public  void teardown(){
    driver.quit();
}




    }


