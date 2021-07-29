package pages.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Page;

public class HomePage extends Page {

    private static String URL = "http://automationpractice.com/index.php";

    @FindBy(linkText = "Sign in")
    private WebElement signInButton;

    @FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
    private WebElement tShirt;

    @FindBy(xpath = "//img[@alt='Printed Dress']")
    private WebElement dress;

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton2;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenTab;




    public HomePage() {

        PageFactory.initElements(driver, this);
    }


    @Override
    public void open() {
        driver.get(URL);
    }


    //przejście do strony logowania
    public LoginPage goToLoginPage() {
        signInButton.click();
        return new LoginPage();
    }

    //przejście do zakładki Women
    public WomenPage goToWomenPage() {
        womenTab.click();
        return new WomenPage();
    }

}
