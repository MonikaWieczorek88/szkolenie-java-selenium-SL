package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;

public class AddingOneItemToTheCartSteps {

    HomePage homePage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User is on Home Page")
    public void user_is_on_home_page(){

        homePage = new HomePage();
        homePage.open();
    }

    @When("User adds t-shirt to the cart")
    public void user_adds_tshirt_to_the_cart(){

        homePage.shoppingProcess1Product();
    }
    @Then("T-shirt is in the cart")
    public void tshirt_is_in_the_cart(){

        homePage.tShirtNameInfo();
    }



}




