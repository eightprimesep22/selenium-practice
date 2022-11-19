package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo1 extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/login";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest1(){
        //ID and Name Locators
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test1233@gmail.com");

        driver.findElement(By.name("password")).sendKeys("test123");

        // Link text Locator
        driver.findElement(By.linkText("Forgot Password?")).click();

        //Partial Link text
        driver.findElement(By.partialLinkText("Sign")).click();

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
