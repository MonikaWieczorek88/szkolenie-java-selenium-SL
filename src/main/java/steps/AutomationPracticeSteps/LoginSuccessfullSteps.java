package steps.AutomationPracticeSteps;


import drivers.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationpractice.LoginPage;

public class LoginSuccessfullSteps {

    LoginPage loginPage;

    @Before
    public void initTest(){

    }

    @After
    public void afterTest(){

        DriverProvider.flush();
    }

    @Given("User is on Login Page")
    public void user_is_on_login_page(){

        loginPage = new LoginPage();
        loginPage.open();
    }

    @When("User enters correct credentials {} and {} and clicks on Sign in button")
    public void user_enters_correct_credentials_and_clicks_on_sign_in_button(String email, String password){


        loginPage.fillingTheFields(email, password);
    }

    @Then("User is logged in correctly and user can see user info")
    public void user_is_logged_in_correctly_and_user_can_see_user_info(){


        loginPage.userInfo();


    }





}
