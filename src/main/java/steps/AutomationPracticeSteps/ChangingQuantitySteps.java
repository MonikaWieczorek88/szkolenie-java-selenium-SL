package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;

public class ChangingQuantitySteps {

    HomePage homePage;
    CartPage cartPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User has one t-shirt in the cart and goes to Cart Page")
    public void user_has_one_t_shirt_in_the_cart_and_goes_to_cart_page() {

        homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess1Product();

    }

    @When("User can change product's quantity")
    public void user_can_change_product_s_quantity() {

        cartPage = new CartPage();
        cartPage.changeQuantity("2");
    }

    @Then("User can verify product's total price")
    public void user_can_verify_product_s_total_price() {

        cartPage.totalPriceCheck();
    }

}
