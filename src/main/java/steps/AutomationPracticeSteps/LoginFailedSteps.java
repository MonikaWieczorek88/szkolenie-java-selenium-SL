package steps.AutomationPracticeSteps;

import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.LoginPage;

public class LoginFailedSteps {


    LoginPage loginPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }


    @Given("User is on Logging Page")
    public void user_is_on_login_page(){

        loginPage = new LoginPage();
        loginPage.open();
    }

    @When("User enters wrong credentials {} and / or {} and clicks on Sign in button")
    public void user_enters_wrong_credentials_and_clicks_on_sign_in_button(String email, String password){

        loginPage.fillingTheFields(email, password);
    }

    @Then("User is not logged in and user can see error message")
    public void user_is_not_logged_in_and_user_can_see_error_message(){

        loginPage.errorMessage();

    }
}
