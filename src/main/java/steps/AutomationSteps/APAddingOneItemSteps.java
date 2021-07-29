package steps.AutomationSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APAddingOneItemSteps {

    HomePage homePage;
    WomenPage womenPage;

    @Given("User is on Home Page")
    public void gettingHomePage(){
    }

    @When("User clicks Women tab and add tShirt to the cart")
    public void goingToWomenCategory(){
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess1Product();
    }

    @Then("User can see what is in the cart")
    public void goToTheCart(){

    }
}









