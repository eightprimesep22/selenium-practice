package seleniumwaits;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestFluentWait extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void fluentWaitExample() {
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));

        // Use Fluent wait
        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
       /* Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement username = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("email"));
            }
        });*/
        WebElement username = waitForElementWithFluentWait(By.id("email"), 30, 5);

        username.sendKeys("Prime123@gmai.com");

    }

}
