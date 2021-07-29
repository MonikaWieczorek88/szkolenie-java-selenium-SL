package steps.AutomationPracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class APChangingQuantitySteps {

    HomePage homePage;
    WomenPage womenPage;
    CartPage cartPage;

    @Given("User goes to Cart Page")
    public void getToCartPage(){
    }

    @When("User clicks Women tab and adds one tShirt to his cart")
    public void goToWomenCat() {
        homePage = new HomePage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage = new WomenPage();
        womenPage.shoppingProcess1Product();


    }
    @Then("User can change product's quantity")
    public void changeQuantity(){
        cartPage = new CartPage();
        cartPage.changeQuantity("2");
    }
}







