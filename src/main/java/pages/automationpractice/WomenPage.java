package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.util.concurrent.TimeUnit;

public class WomenPage extends Page {

    private static String URL = "http://automationpractice.com/index.php?id_category=3&controller=category";

    @FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
    private WebElement tShirt;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton1;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    private WebElement continueButton;

    @FindBy(xpath = "//img[@alt='Printed Dress']")
    private WebElement dress;

    @FindBy(xpath = "//*//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton2;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    private WebElement checkoutButton;


    public WomenPage() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        driver.get(URL);
    }

    //dodanie koszulki do koszyka (produkt pierwszy)
    public void addTShirtToCart() {
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(tShirt).build().perform();
        addToCartButton1.click();
    }

    //kliknięcie przycisku 'Continue shopping'
    public void continueShopping() {
        continueButton.click();
    }

    //dodanie sukienki do koszyka (produkt drugi)
    public void addDressToCart() {
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(dress).build().perform();
        addToCartButton2.click();
    }

    //przejście do strony koszyka
    public CartPage goToCartPage() {
        checkoutButton.click();
        return new CartPage();
    }

    //dodanie jednego produktu do koszyka i przejście na stronę koszyka
    public CartPage shoppingProcess1Product(){
        addTShirtToCart();
        goToCartPage();
        return new CartPage();
    }

    //dodanie dwóch produktów do koszyka u przejście do koszyka
    public CartPage shoppingProcess2Products(){
        addTShirtToCart();
        continueShopping();
        addDressToCart();
        goToCartPage();
        return new CartPage();
    }
}
