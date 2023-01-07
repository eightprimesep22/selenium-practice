package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }


    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
       // Find log in link and click on login link
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));

        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text
//       WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
       String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

       // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage, actualMessage);

    }


    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        clickOnElement(By.linkText("Log in"));
        // Find the email field element and send the email
        /*WebElement emailField = driver.findElement(By.id("Email"));
        // Type email to email field
        emailField.sendKeys("test123@gmail.com");*/
        sendTextToElement(By.id("Email"),"test123@gmail.com");

        // Find the password field element
       /* WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");*/
        sendTextToElement(By.name("Password"),"tes123");

        // Find the login button and click on it
       /* WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();*/
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
//        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        // Validate actual and expected message
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void testDown(){
        closeBrowser();
    }

}
