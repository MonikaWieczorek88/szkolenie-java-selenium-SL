package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;

public class RemovingTheOnlyOneItemSteps {

    HomePage homePage;
    CartPage cartPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User has one product in the cart and goes to Cart Page")
    public void user_has_one_product_in_the_cart_and_goes_to_cart_page() {

        homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess1Product();
    }

    @When("User removes the only one product")
    public void user_removes_the_only_one_product() throws InterruptedException {

        cartPage = new CartPage();
        cartPage.removeProduct1();
        Thread.sleep(2000);
    }

    @Then("User can see information about empty cart")
    public void user_can_see_information_about_empty_cart() {

        cartPage.emptyCartInfo();
    }

}
