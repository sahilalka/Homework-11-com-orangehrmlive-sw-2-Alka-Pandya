package testsuite;

import browserfectory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "= https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {


        // Find the email field element and send the email
        driver.findElement(By.name("username")).sendKeys("Admin");


        // Find the password field element and send the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Find the login button and click on it
        driver.findElement(By.xpath("//button[@type='submit']"));

        //Expected Result
        String expectedMessage = "Dashboard";

        // Find the Log out text element and get the text
        WebElement actualMessage = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }

    @After
    public void closeBrowser() {
        // Close the Browser
        driver.quit();
    }
}











