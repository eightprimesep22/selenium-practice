package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeOptionsExample {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); // Disable browser notifications
        options.addArguments("--incognito"); // Open Browser in private window.
        options.addArguments("--headless"); // Open headless browser

        String baseUrl = "https://courses.letskodeit.com/practice";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Page title " + driver.getTitle());
    }
}
