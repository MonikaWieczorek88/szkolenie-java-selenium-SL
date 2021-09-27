package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.HomePage;
import pages.automationpractice.ProductPage;

public class ProductVerification {

    HomePage homePage;
    ProductPage productPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User is on main page \\(Home Page)")
    public void user_is_on_main_page_home_page() {

        homePage = new HomePage();
        homePage.open();

    }

    @When("User clicks on blouse product")
    public void user_clicks_on_blouse_product() {

        homePage.goToProductPage();

    }

    @Then("User can check product's description, price, color, size, composition, styles and properties")
    public void user_can_check_product_s_description_price_color_size_composition_styles_and_properties() {

        productPage = new ProductPage();
        productPage.open();
        productPage.productInfo();
    }

}
