package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

}