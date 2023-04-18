package testsuite;

import browserfectory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
     @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
         WebElement loginBtn = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));

         // Expected Result
         String expectedMessage = "Reset Password";

         // Find the reset password text element and get the text
        WebElement actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
         // Validate actual and expected message

         Assert.assertEquals("Not navigate to reset password page" ,expectedMessage,actualMessage);

     }

      @After
    public void closeBrowser(){
        // Close the Browser
          driver.quit();
      }





}
