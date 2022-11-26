package alertexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlert extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample(){
        clickOnElement(By.id("alertbtn"));  // Click on Alert button
        // driver.switchTo().alert(); // Crating alert Object reference and switch to alert
        switchToAlert();
        String text = driver.switchTo().alert().getText();  // Getting the text from alert
        System.out.println(text);
        driver.switchTo().alert().accept(); // Accept alert
//        driver.switchTo().alert().sendKeys("Jay"); // Send text to alert
    }

}
