package steps.AutomationPracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APVerifyPriceAfterChangingQuantitySteps {

    HomePage homePage;
    WomenPage womenPage;
    CartPage cartPage;

    @Given("User is going to Cart Page")
    public void getCartPage() {
    }

    @When("User clicks Women tab and adds one tShirt")
    public void goToWomenCtg() {
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess1Product();

    }

    @Then("User can change product's quantity and verify its total price")
    public void changeQuant() throws InterruptedException {
        cartPage = new CartPage();
        cartPage.changeQuantity("2");
        cartPage.totalPriceCheck();

    }
}




