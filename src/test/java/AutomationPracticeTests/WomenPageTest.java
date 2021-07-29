package AutomationPracticeTests;

import drivers.DriverProvider;
import org.junit.*;
import pages.Page;
import pages.automationpractice.HomePage;
import pages.automationpractice.WomenPage;

public class WomenPageTest extends Page {


    HomePage homePage;
    WomenPage womenPage;

    @BeforeClass
    public static void init() {
    }

    @Before
    public void initEachTest() {
    }


    @Override
    public void open() {
    }

    //weryfikacja dodania jednego produktu do koszyka i przejście do koszyka
    @Test
    public void shoppingProcess1Item() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess1Product();
    }

    //weryfikacja dodania dwóch produktów do koszyka i przejście do koszyka
    @Test
    public void shoppingProcess2Items() {
        homePage = new HomePage();
        womenPage = new WomenPage();
        homePage.open();
        homePage.goToWomenPage();
        womenPage.shoppingProcess2Products();
    }

    @After
    public void after() {
        DriverProvider.flush();
    }

    @AfterClass
    public static void afterClass() {

    }
}
