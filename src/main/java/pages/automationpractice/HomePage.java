package pages.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Page;

import java.util.concurrent.TimeUnit;

public class HomePage extends Page {

    private static String URL = "http://automationpractice.com/index.php";


    @FindBy(linkText = "Sign in")
    private WebElement signInButton;

    @FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
    private WebElement tShirt;

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton1;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    private WebElement continueButton;

    @FindBy(xpath = "//img[@alt='Printed Dress']")
    private WebElement dress;

    @FindBy(xpath = "//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton2;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    private WebElement checkoutButton;

    @FindBy(xpath = "//img[@alt='Blouse']")
    private WebElement blouse;

    @FindBy(xpath = "//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")
    private WebElement tShirtName;

    @FindBy(xpath = "//*[@id=\"product_3_13_0_0\"]/td[2]/p/a")
    private WebElement dressName;


    public HomePage(){

        PageFactory.initElements(driver, this);
    }

    public void open(){

        driver.get(URL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
    public void goToCheckout(){
        checkoutButton.click();
    }

    //przejście do strony produktu
    public ProductPage goToProductPage(){
        blouse.click();
        return new ProductPage();
    }

    //dodanie jednego produktu do koszyka i przejście na stronę koszyka
    public CartPage shoppingProcess1Product(){
        addTShirtToCart();
        goToCheckout();
        return new CartPage();
    }

    //dodanie dwóch produktów do koszyka i przejście na stronę koszyka
    public CartPage shoppingProcess2Products(){
        addTShirtToCart();
        continueShopping();
        addDressToCart();
        goToCheckout();
        return new CartPage();
    }

    //przejście do strony logowania
    public LoginPage goToLoginPage() {
        signInButton.click();
        return new LoginPage();
    }

    //wypisanie informacji o produkcie pierwszym
    public String tShirtNameInfo(){
        String tShirtInfo = tShirtName.getText();
        System.out.println(tShirtInfo);
        return tShirtInfo;
    }

    //wypisanie informacji o produkcie drugim
    public String dressNameInfo(){
        String dressInfo = dressName.getText();
        System.out.println(dressInfo);
        return dressInfo;
    }

}
