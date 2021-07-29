package pages.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Page;


public class LoginPage extends Page {

    private static String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy (id = "passwd")
    private WebElement passwordInput;

    @FindBy (id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy (xpath = "\"//*[@id=\\\"center_column\\\"]/div[1]/p\"")
    private  WebElement errorMessage;


    @Override
    public void open() {
        driver.get(URL);
    }

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    //wypełnienie pola 'Email address'
    public void setEmailInput(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    //wypełnienie pola 'Password'
    public void setPasswordInput(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    //kliknięcie przycisku 'Sign in'
    public void clickSignInButton() {

        signInButton.click();
    }

    //metoda zbiorcza - 3 metody połączone w 1
    public void fillingTheFields(String email, String password) {
        setEmailInput(email);
        setPasswordInput(password);
        clickSignInButton();
    }


}
//gotowe