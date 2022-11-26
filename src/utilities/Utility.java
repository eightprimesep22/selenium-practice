package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

//************************* Alert Methods *****************************************************

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    // Homework 4 Method acceptAlert,dismissAlert,  String getTextFromAlert, sendTextToAlert(String text)

    //************************** Select Class Methods ***********************************************

    /**
     *  This method will select option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    /**
     * This method will select the option by value
     */

    /**
     * This method will select the option by index
     */

    /**
     * This method will select the option by contains text
     */

    //***************************** Window Handle ************************************
    //***************************** Action Class *************************************
// mouseHoverToElement(By by), mouseHoverToElementAndClick(By by)
}
