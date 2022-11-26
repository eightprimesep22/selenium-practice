package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo3 extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest3(){
        //ID
//        driver.findElement(By.cssSelector("#displayed-text")).sendKeys("Prime Testing");

        // Tag and ID
        driver.findElement(By.cssSelector("input#displayed-text")).sendKeys("Prime Testing");

        // Class
        driver.findElement(By.cssSelector(".inputs.displayed-class")).sendKeys("Prime Testing");

        // Tag and Class
        driver.findElement(By.cssSelector("input.inputs.displayed-class")).sendKeys("Prime Testing");

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
