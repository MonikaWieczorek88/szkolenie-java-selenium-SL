package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.HomePage;

public class AddingTwoItemsToTheCartSteps {

    HomePage homePage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User is on main page - Home Page")
    public void user_is_on_main_page_home_page() {

        homePage = new HomePage();
        homePage.open();
    }

    @When("User adds one t-shirt and one dress to the cart")
    public void user_adds_one_t_shirt_and_one_dress_to_the_cart() {

        homePage.shoppingProcess2Products();
    }

    @Then("Products are in the cart")
    public void products_are_in_the_cart() {

        homePage.tShirtNameInfo();
        homePage.dressNameInfo();
    }

}
