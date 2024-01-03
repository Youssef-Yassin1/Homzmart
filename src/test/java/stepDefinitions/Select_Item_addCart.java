package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static stepDefinitions.Hook.driver;
import static stepDefinitions.Hook.wait;

public class Select_Item_addCart {
    public static double p;
    @Given("Select the second item")
    public void Select_the_second_item() throws InterruptedException {

        Locators.outdoorButton(driver).click();
        Thread.sleep(2000);
        Locators.mouseHover(driver);
        Locators.scrollDown(driver);
        Thread.sleep(3000);
        Locators.item(driver).click();
    }

    @When("Add to cart")
    public void Add_to_cart() throws InterruptedException {
        Thread.sleep(2000);
      Locators.addToCart(driver).click();
    }

    @And("Validate the item is added to cart")
    public void Validate_the_item_is_added_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        Locators.popUpMsg(driver).isDisplayed();
        System.out.println(Locators.popUpMsg(driver).getText());
    }
    @Then("Click on cart icon")
    public void Click_on_cart_icon() throws InterruptedException {
        Thread.sleep(5000);
       Locators.cartIcon(driver).click();
    }

    @And("Click on go to cart")
    public void Click_on_go_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        Locators.goToCart(driver).click();
        Thread.sleep(5000);
    }

    @Then("Validate the total price is equal to the item price you got")
    public void Validate_the_total_price_is_equal_to_the_item_price_you_got() {
        Locators.itemPrice(driver).getText();
        String price = Locators.itemPrice(driver).getText();
        int p = Integer.parseInt(price);
        String totalPrice = Locators.totalPrice(driver).getText();
        String intValue = totalPrice.replaceAll("[^0-9]", "");
        Assert.assertEquals(p,intValue);
    }
}