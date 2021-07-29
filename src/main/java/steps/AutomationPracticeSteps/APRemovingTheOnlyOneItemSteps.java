package steps.AutomationPracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APRemovingTheOnlyOneItemSteps {

    HomePage homePage;
    WomenPage womenPage;
    CartPage cartPage;

    @Given("User is going to Home Page")
    public void goingToHomePage() {
    }

    @When("User clicks Women tab and adds tShirt to his cart")
    public void goingToWomenCat() {
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess1Product();
    }

    @Then("User can remove the only one product from the cart")
    public void removeTheOnlyOneItem() {
        cartPage = new CartPage();
        cartPage.verifyCartContent2();
    }
}

