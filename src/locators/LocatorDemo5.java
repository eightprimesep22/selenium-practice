package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest5() {
        // Self --- Select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/self::a")).getText();
        System.out.println(text);  // IDBI Bank

        // Parent --- Select the parent of the current node (always one)
        text = driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/parent::td")).getText();
        System.out.println(text); // IDBI Bank

        //Child --- Select the children of current node (one or many)
        List<WebElement> children = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements : " + children.size());  // 5

        //Ancestor --- Select all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr")).getText();
        System.out.println(text); // IDBI Bank A 48.95 50.95 + 4.09
        //Descendant -- Select all descendants (children, grand children etc)
        // Homework ////a[contains(text(),'IDBI Bank')]/ancestor::tr/descendant::*

        // Following -- Select everything in document after the closing tag of the current node.
        // Homework //a[contains(text(),'IDBI Bank')]/ancestor::tr/following::tr

        // Following-Sibling  -- Select all siblings after the current node
        //a[contains(text(),'IDBI Bank')]/ancestor::tr/following-sibling::tr

        // Preceding -- Select all nodes that appear before the current node in the document
        //a[contains(text(),'IDBI Bank')]/ancestor::tr/preceding::tr

        // Preceding-sibling -- Select all siblings before the current node
        //a[contains(text(),'IDBI Bank')]/ancestor::tr/preceding-sibling::tr


    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
