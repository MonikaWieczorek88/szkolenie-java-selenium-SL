package pages.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Page;

public class CartPage extends Page {

    @FindBy(xpath = "//span[contains(., 'In stock')]")
    private WebElement inStockLabel;

    @FindBy(xpath = "//*[@id='total_product_price_1_1_0']")
    private WebElement totalPrice;

    @FindBy(xpath = "//*[@id='product_1_1_0_0']/td[5]/input[2]")
    private WebElement quantityField;

    @FindBy(xpath = "//*[@id='3_13_0_0']/i")
    private WebElement trash1;

    @FindBy(xpath = "//*[@id='1_1_0_0']/i")
    private WebElement trash2;

    @FindBy(xpath = "//*[@id='summary_products_quantity']")
    private WebElement productQuantityLabel;

    @FindBy(xpath = "//*[contains(text(), 'Your shopping cart is empty')]")
    private WebElement emptyCart;


    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {

        driver.get(URL);
    }

    //sprawdzenie dostępności produktu
    public void productAvailabilityCheck() {

        if (inStockLabel.isDisplayed()){
            System.out.println("Product is available");
        } else {
            System.out.println("Product is unavailable");
        }
    }

    //sprawdzenie całkowitej ceny produktu w koszyku
    public void totalPriceCheck() throws InterruptedException {
        Thread.sleep(5000);
        totalPrice.getText();
        System.out.println("Total price of this product: " + totalPrice.getText());
    }

    //metoda zbiorcza - 2 metody połączone w 1 (dostępność i cena produktu)
    public void cartVerification(){
        productAvailabilityCheck();
        try {
            totalPriceCheck();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //zmienianie ilości produktu w koszyku
    public void changeQuantity(String quantity) {
        quantityField.clear();
        quantityField.sendKeys(quantity);
    }

    //usuwanie produktu pierwszego (koszulki) z koszyka
    public void remove1Of2Product(){
        trash1.click();
    }

    //usuwanie produktu drugiego (sukienki) z koszyka
    public void removeTheOnly1Product() {
        trash2.click();
    }

    //usunięcie produktu pierwszego z koszyka z dwoma produktami
    public void verifyCartContent1(){
        remove1Of2Product();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        productQuantityLabel.getText();
        System.out.println("Shopping cart contains: " + productQuantityLabel.getText());
    }

    //usunięcie produktu pierwszego z koszyka z tylko jednym produktem - informacja o pustym koszyku
    public void verifyCartContent2(){
        removeTheOnly1Product();
        emptyCart.getAttribute("innerHTML");
        System.out.println(emptyCart.getAttribute("innerHTML"));
    }

}



