//**Create the package ‘browserfactory’ and create the
//class with the name ‘BaseTest’ inside the
//‘browserfactory’ package. And write the browser setup
//code inside the class ‘BaseTest’.

package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    //WebDriver variable
    public static WebDriver driver;

   //method for all the browser
    public void openBrowser(String baseURL){
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


    }

    public void closebrowser () {driver.quit();}




}
