package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.Page;

import java.util.concurrent.TimeUnit;

public class ProductPage extends Page {

    private static String URL = "http://automationpractice.com/index.php?id_product=2&controller=product";

    @FindBy(xpath = "//*[@id='short_description_content']/p")
    private WebElement description;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr[1]/td[2]")
    private WebElement compositions;

    @FindBy(xpath = "//*[@id=\"our_price_display\"]")
    private WebElement price;

    @FindBy(xpath = "//*[@id=\"color_11\"]")
    private WebElement color;

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    private WebElement sizeList;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr[2]/td[2]")
    private WebElement styles;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr[3]/td[2]")
    private WebElement properties;


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        driver.get(URL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getDescription() {
        String descriptionInfo = description.getText();
        System.out.println(descriptionInfo);
        return descriptionInfo;
    }

    public String getPrice() {
        String priceInfo = price.getText();
        System.out.println(priceInfo);
        return priceInfo;
    }

    public String getColor() {
        String colorInfo = color.getAttribute("title");
        System.out.println(colorInfo);
        return colorInfo;
    }

    public String getSize() {
        Select sizeList = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
        String sizeInfo = sizeList.getFirstSelectedOption().getText();
        System.out.println("Default selected size is " + sizeInfo);
        return sizeInfo;
    }

    public String getComposition() {
        String compositionInfo = compositions.getText();
        System.out.println(compositionInfo);
        return compositionInfo;
    }

    public String getStyles() {
        String styleInfo = styles.getText();
        System.out.println(styleInfo);
        return styleInfo;
    }

    public String getProperties() {
        String propertiesInfo = properties.getText();
        System.out.println(propertiesInfo);
        return propertiesInfo;
    }

    //metoda zbiorcza - informacje o produkcie
    public void productInfo(){
        getDescription();
        getPrice();
        getColor();
        getSize();
        getComposition();
        getStyles();
        getProperties();
    }

}








