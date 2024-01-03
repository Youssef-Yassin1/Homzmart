package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static stepDefinitions.Hook.driver;

public class Locators {

    public static WebElement homePage(WebDriver driver) {
        return driver.findElement(By.id("HEADER_MAIN_LOGO"));
    }
    public static WebElement outdoorButton(WebDriver driver) {
        return driver.findElement(By.id("HEADER_MENU_BAR_CATEGORY_11"));
    }
    public static WebElement outdoorPage(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div/div[1]/div[2]/section/div[2]/div/div/h1"));
    }
    public static WebElement item(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/a/div[1]/div[1]/img"));
    }
    public static WebElement itemPrice(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/p"));
    }
    public static WebElement addToCart(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div/section[1]/div[2]/div[2]/div[2]/div[2]/div/button"));
    }
    public static WebElement popUpMsg(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]"));
    }

    public static WebElement cartIcon(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[1]/header/div[1]/div[2]/div[4]"));
    }
    public static WebElement goToCart(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"HEADER_CART_BRIEF_GO_TO_CART_BUTTON\"]"));
    }
    public static WebElement totalPrice(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div/div[1]/div[2]/div/div[3]/span[2]/b"));
    }
    public static void scrollDown(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public static void mouseHover(WebDriver driver) {
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[1]/header/div[1]/div[2]/div[3]/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }
}