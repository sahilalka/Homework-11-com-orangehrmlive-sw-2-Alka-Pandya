package browserfectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        // Give key and value
        System.setProperty("Web driver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Launching the Url
        driver.get(baseUrl);
        // Maximize window
        driver.manage().window().maximize();
        // Give implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
       public void closeBrowser(){
        driver.quit();  // Close the Browser
       }


}
