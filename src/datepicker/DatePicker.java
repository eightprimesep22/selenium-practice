package datepicker;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class DatePicker extends Utility {
    String baseUrl = "https://www.redbus.in/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void selectDate() {

        String year = "2025";
        String month = "May";
        String date = "5";
        clickOnElement(By.id("onward_cal")); // Opens the date picker
        while (true) {
            String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            // Nov 2022
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//button[normalize-space()='>']"));
            }
        }

        // Select Date
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)){
                dt.click();
                break;
            }

        }


    }
}
