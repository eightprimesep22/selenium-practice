package seleniumwaits;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestExplicitlyWait extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitlyWaitExample(){
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));

        // Use Explicit wait

        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        username.sendKeys("Prime123@gmai.com");*/
        WebElement username1 = waitUntilVisibilityOfElementLocated(By.id("email"), 5);
        username1.sendKeys("Prime123@gmai.com");

    }

}
