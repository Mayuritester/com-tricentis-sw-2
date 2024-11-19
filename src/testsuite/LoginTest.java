//**Write down the following test in the ‘LoginTest’ class
//1. userShouldNavigateToLoginPageSuccessfully()
//* click on the ‘Login’ link
//* Verify the text ‘Welcome, Please Sign
//Write down the following test in the ‘LoginTest’ class
//1. userShouldNavigateToLoginPageSuccessfully()
//* click on the ‘Login’ link
//* Verify the text ‘Welcome, Please Sign
//In!’
//2. userShouldLoginSuccessfullyWithValidCredentials()
//* click on the ‘Login’ link
//* Enter a valid username
//* Enter a valid password
//* Click on the ‘Login’ button
//* Verify the ‘Welcome to our store’
//text is displayed
//3. verifyTheErrorMessage()
//* click on the ‘Login’ link
//* Enter the invalid username
//* Enter the invalid password
//* Click on the ‘Login’ button
//* Verify the error message ‘Login was unsuccessful.
//Please correct the errors and try again. No customer account found’
package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseURL = "https://demowebshop.tricentis.com/";

    //opening the URL
    @Before
    public void setup (){
        openBrowser (baseURL);
    }
    // method with elements to login and varify the page

    @Test
    public void userShouldNavigateToLoginPageSuccessfully () {
        driver.findElement(By.linkText("Log in")).click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcometextelement = driver.findElement(By.tagName("h1"));
        String actualText = welcometextelement.getText();
        Assert.assertEquals("not redirected to login page", expectedText, actualText);
    }

        @Test
        public void userShouldLoginWithCorrectCredentials(){
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            WebElement userName = driver.findElement(By.name("Email"));
            userName.sendKeys("computer.tester009@gmail.com");
            WebElement passwordField = driver.findElement(By.name("Password"));
            passwordField.sendKeys("Test1234");
            driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
            String expectedText1 = "Welcome to our store";
            WebElement welcomeText = driver.findElement(By.className("topic-html-content-header"));
            String actualText1 = welcomeText.getText();
            Assert.assertEquals("not loged in succefullly", expectedText1, actualText1);

        }

        @Test
        public void verifyTheErrorMessage() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
            WebElement userName = driver.findElement(By.name("Email"));
            userName.sendKeys("computer.tester009@gmail.com");
            WebElement passwordField = driver.findElement(By.name("Password"));
            passwordField.sendKeys("Test123");
            driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
            String expectedMessage = "Login was unsuccessful.\n" +
                    "Please correct the errors and try again. No customer account found";
            driver.findElement(By.xpath("//div[@class = 'validation-summary-errors']")).getText();
            Assert.assertEquals("Error message not displayed", expectedMessage,expectedMessage);


        }
    //close the tabs element
    @After
    public void tearDown(){
        driver.quit();
    }

}
