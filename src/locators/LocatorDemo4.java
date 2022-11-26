package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest4() {
        //Relative xpath
       /* WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("Mobile");*/

        //xpath with or
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name = 'q']")).sendKeys("Mobile");

        // xpath with and
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder= 'Search store']")).sendKeys("mobile");

        // xpath with contains()
        driver.findElement(By.xpath("//input[contains(@id, 'small')]")).sendKeys("Mobile");

        // xpath with starts-with
        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Search')]")).sendKeys("Mobile");

        // xpath with text()
        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();

        // xpath with chained
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
