package AutomationPracticeTests;

import drivers.DriverProvider;
import org.junit.*;
import pages.Page;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class CartPageTest extends Page {

    HomePage homePage;
    WomenPage womenPage;
    CartPage cartPage;

    @BeforeClass
    public static void init() {
    }

    @Before
    public void initEachTest() {
    }

    @Override
    public void open() {
    }

    //dodanie jednego produktu do koszyka oraz sprawdzenie jego dostępności i ceny
    @Test
    public void cartVerify1Product() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        cartPage = new CartPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess1Product();
        cartPage.cartVerification();
    }

    //dodanie dwóch produktów do koszyka
    @Test
    public void cartVerify2Products() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess2Products();
    }

    //dodanie jednego produktu do koszyka, zwiększenie jego ilości do dwóch i sprawdzenie ceny po zmianie ilości
    @Test
    public void changeQuantityVerify() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        cartPage = new CartPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess1Product();
        cartPage.changeQuantity("2");
        try {
            cartPage.totalPriceCheck();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //usunięcie jednego z dwóch produktów z koszyka
    @Test
    public void remove1Of2Products() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        cartPage = new CartPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess2Products();
        cartPage.remove1Of2Product();
        cartPage.verifyCartContent1();
    }

    //usunięcie jedynego produktu z koszyka i wyświetlenie informacji o pustym koszyku
    @Test
    public void removeTheOnlyOneProduct() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        cartPage = new CartPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess1Product();
        cartPage.removeTheOnly1Product();
        cartPage.verifyCartContent2();
    }

    @After
    public void after() {
        DriverProvider.flush();
    }

    @AfterClass
    public static void afterClass() {
    }

}
