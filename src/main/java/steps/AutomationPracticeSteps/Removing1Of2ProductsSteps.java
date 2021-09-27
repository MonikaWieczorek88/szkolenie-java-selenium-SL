package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;

public class Removing1Of2ProductsSteps {

    HomePage homePage;
    CartPage cartPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User has two items in the cart and goes to Cart Page")
    public void user_has_two_items_in_the_cart_and_goes_to_cart_page() {

        homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess2Products();
    }

    @When("User removes one of two products")
    public void user_removes_one_of_two_products() throws InterruptedException {

        cartPage = new CartPage();
        cartPage.removeProduct2();
        Thread.sleep(2000);
    }

    @Then("User has one product in the cart")
    public void user_has_one_product_in_the_cart() {

        cartPage.quantityInfo();
    }
}

