package AutomationPracticeTests;

import drivers.DriverProvider;
import org.junit.*;
import pages.automationpractice.HomePage;

public class HomePageTest {


    @BeforeClass
    public static void init() {
        System.out.println("Starting all tests from this class ");
    }

    @Before
    public void initEachTest(){
        System.out.println("Starting particular test from Automation Practice testing suite...");
    }

    //weryfikacja dodania jednego produktu do koszyka i przejścia do koszyka
    @Test
    public void shoppingProcess1Product(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess1Product();
        Assert.assertEquals( "Faded Short Sleeve T-shirts", homePage.tShirtNameInfo());
    }

    //weryfikacja dodania dwóch produktów do koszyka i przejścia do koszyka
    @Test
    public void shoppingProcess2Products(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.shoppingProcess2Products();
        Assert.assertEquals("Printed Dress", homePage.dressNameInfo());
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
