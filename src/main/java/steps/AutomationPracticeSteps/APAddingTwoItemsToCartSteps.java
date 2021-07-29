package steps.AutomationPracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APAddingTwoItemsToCartSteps {

    HomePage homePage;
    WomenPage womenPage;

    @Given("User goes to Home Page")
    public void goToHomePage(){
    }

    @When("User clicks Women tab and adds tShirt and dress to the cart")
    public void goToWomenCategory(){
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess2Products();
    }

    @Then("User can see what is in his cart")
    public void goingToTheCart(){
    }
}


