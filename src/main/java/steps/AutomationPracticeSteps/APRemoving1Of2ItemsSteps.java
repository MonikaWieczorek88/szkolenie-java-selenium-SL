package steps.AutomationPracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APRemoving1Of2ItemsSteps {

    HomePage homePage;
    WomenPage womenPage;
    CartPage cartPage;

    @Given("User is going to Main Page - Home Page")
    public void getHomePage() {
    }

    @When("User clicks Women tab and adds one tShirt and one dress to his cart")
    public void goingToWomenCtg(){
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess2Products();
    }

    @Then("User can remove one of two products")
    public void removeOneItem() {
        cartPage = new CartPage();
        cartPage.verifyCartContent1();
    }
}




