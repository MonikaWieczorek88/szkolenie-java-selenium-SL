package steps.AutomationPracticeSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.automationpractice.LoginPage;

public class APLoginFailedSteps {

    LoginPage loginPage;

    @Given("User is on Login Page")
    public void getToLoginPage(){
    }

    @When("User enters wrong credentials {} and / or {} and clicks on Sign in button")
    public void loginFailed(final String email , final String password){

            loginPage = new LoginPage();
            loginPage.open();
            loginPage.fillingTheFields(email, password);
    }

    @Then("User can see error message")
    public void getErrorMessage(){
    }
}



