package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hook {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @Before
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://homzmart.com/en/");
        driver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}