package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;

public class VerifyingAvailabilityAndPriceSteps {

    HomePage homePage;
    CartPage cartPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User is going to Home Page")
    public void user_is_going_to_home_page() {

        homePage = new HomePage();
        homePage.open();
    }

    @When("User is adding one t-shirt to the cart")
    public void user_is_adding_one_t_shirt_to_the_cart() {

        homePage.shoppingProcess1Product();
    }

    @Then("User is going to Cart Page")
    public void user_is_going_to_cart_page() {

        cartPage = new CartPage();

    }

    @And("User can see product's availabilty and price")
    public void user_can_see_product_s_availabilty_and_price() {

        cartPage.productAvailabilityCheck();
        cartPage.totalPriceCheck();

    }
}