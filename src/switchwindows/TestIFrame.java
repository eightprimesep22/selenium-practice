package switchwindows;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestIFrame extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchIFrameExample() {
        // Switch to frame
        driver.switchTo().frame("courses-iframe");
        //Find the element inside the frame and send text
        sendTextToElement(By.xpath("//input[@id='search']"), "Prime Testing");

        //Switch to default content
        driver.switchTo().defaultContent();

        //Send text to search box
        sendTextToElement(By.id("name"), "Jay");
    }
}
