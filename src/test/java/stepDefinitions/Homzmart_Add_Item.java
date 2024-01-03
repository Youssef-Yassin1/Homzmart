package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static stepDefinitions.Hook.driver;

public class Homzmart_Add_Item {
    @Given("The website homepage is displayed")
    public void The_website_homepage_is_displayed(){
        Locators.homePage(driver).isDisplayed();
    }
    @When("Click on outdoor button")
    public void Click_on_outdoor_button() throws InterruptedException {
        Thread.sleep(3000);
        Locators.outdoorButton(driver).click();
        Thread.sleep(3000);
    }
    @Then("Validate the outdoor page is displayed")
    public void Validate_the_outdoor_page_is_displayed() throws InterruptedException {
        Thread.sleep(3000);
        Locators.outdoorPage(driver).isDisplayed();
    }
}