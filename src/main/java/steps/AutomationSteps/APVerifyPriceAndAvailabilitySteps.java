package steps.AutomationSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APVerifyPriceAndAvailabilitySteps {

    HomePage homePage;
    WomenPage womenPage;
    CartPage cartPage;

    @Given("User is on Cart Page")
    public void getToCartPage(){
    }

    @When("User clicks Women tab and add one tShirt to the cart")
    public void goingToWomenCategory() {
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess1Product();
        cartPage = new CartPage();
        cartPage.cartVerification();
    }


    @Then("User can see what is products's total price and if product is available")
    public void seeThePrice(){
        }

}


