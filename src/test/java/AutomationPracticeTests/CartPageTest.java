package AutomationPracticeTests;

import drivers.DriverProvider;
import org.junit.*;
import pages.automationpractice.CartPage;
import pages.automationpractice.HomePage;

public class CartPageTest {


    @BeforeClass
    public static void init() {
        System.out.println("Starting all tests from this class ");
    }


    @Before
    public void initEachTest(){
        System.out.println("Starting particular test from Automation Practice testing suite...");
    }

    //dodanie jednego produktu do koszyka oraz sprawdzenie jego dostępności i ceny
    @Test
    public void addOneProductAndVerify(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess1Product();
        CartPage cartPage = new CartPage();
        cartPage.productAvailabilityCheck();
        cartPage.totalPriceCheck();
        Assert.assertEquals(cartPage.quantityInfo(), "1 Product");
    }

    //dodanie dwóch produktów do koszyka
    @Test
    public void addTwoProducts(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess2Products();
        CartPage cartPage = new CartPage();
        Assert.assertEquals("2 Products",cartPage.quantityInfo() );
    }

    //dodanie jednego produktu do koszyka, zwiększenie jego ilości do dwóch i sprawdzenie ceny po zmianie ilości
    @Test
    public void changeQuantityAndVerify() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess1Product();
        CartPage cartPage = new CartPage();
        cartPage.changeQuantity("2");
        Thread.sleep(2000);
        Assert.assertEquals("$33.02", cartPage.totalPriceCheck());
    }

    //usunięcie jednego z dwóch produktów z koszyka
    @Test
    public void remove1Of2Products() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess2Products();
        CartPage cartPage = new CartPage();
        cartPage.removeProduct2();
        Thread.sleep(2000);
        Assert.assertEquals("1 Product", cartPage.quantityInfo() );
    }

    //usunięcie jedynego produktu z koszyka i wyświetlenie informacji o pustym koszyku
    @Test
    public void removeTheOnlyOneProduct() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess1Product();
        CartPage cartPage = new CartPage();
        Thread.sleep(2000);
        cartPage.removeProduct1();
        Assert.assertEquals("Your shopping cart is empty.", cartPage.emptyCartInfo());
    }


    @After
    public void after(){
        DriverProvider.flush();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("All tests finished.");
    }
}
