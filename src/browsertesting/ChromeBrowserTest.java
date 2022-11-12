package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise Window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        // Get Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page source: " + driver.getPageSource());

        //Navigate to Login page
//        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
//        driver.navigate().to(loginUrl);

        //Navigate to Login page by clicking on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Find the email field element and send the email
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type email to email field
        emailField.sendKeys("test123@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");


        // Close the browser
        driver.quit();
    }

}
