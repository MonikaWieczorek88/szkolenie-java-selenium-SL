package pages.automationpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.util.concurrent.TimeUnit;

public class CartPage extends Page {

    private static String URL = "http://automationpractice.com/index.php";

    @FindBy(xpath = "//span[contains(., 'In stock')]")
    private WebElement inStockLabel;

    @FindBy(xpath = "//*[@id='total_product_price_1_1_0']")
    private WebElement totalPrice;

    @FindBy(xpath = "//*[@id='product_1_1_0_0']/td[5]/input[2]")
    private WebElement quantityField;

    @FindBy(xpath = "//*[@id='1_1_0_0']/i") // tshirt
    private WebElement trash1;

    @FindBy(xpath = "//*[@id='3_13_0_0']/i") // sukienka
    private WebElement trash2;

    @FindBy(xpath = "//*[contains(text(), 'Your shopping cart is empty')]")
    private WebElement emptyCart;

    @FindBy(id = "summary_products_quantity")
    private WebElement quantityInfo;


    WebDriverWait wait = new WebDriverWait(driver, 5);


    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {

        driver.get(URL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    //sprawdzenie dostępności produktu
    public void productAvailabilityCheck(){
        inStockLabel.isDisplayed();
    }

    //sprawdzenie całkowitej ceny produktu w koszyku
    public String totalPriceCheck(){
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='total_product_price_1_1_0']")));
    String totalPriceInfo = totalPrice.getText();
    System.out.println("Total price of this product: " + totalPriceInfo);
    return totalPriceInfo;
    }

    //zmienianie ilości produktu w koszyku
    public void changeQuantity(String quantity){
        quantityField.clear();
        quantityField.sendKeys(quantity);
    }

    //usuwanie produktu pierwszego (koszulki) z koszyka
    public void removeProduct1() {
        trash1.click();
    }

    //usuwanie produktu drugiego (sukienki) z koszyka
    public void removeProduct2(){
        trash2.click();
    }


    //sprawdzenie ilości produktów w koszyku
    public String quantityInfo(){
        String quantInfo = quantityInfo.getText();
        System.out.println("There are " + quantInfo + " in the cart");
        return quantInfo;
    }

    //informacja o pustym koszyku
    public String emptyCartInfo() {
        String emptyCartInf = emptyCart.getAttribute("innerHTML");
        System.out.println(emptyCartInf);
        return emptyCartInf;
     }

}
