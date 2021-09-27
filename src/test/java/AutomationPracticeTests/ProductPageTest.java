package AutomationPracticeTests;

import drivers.DriverProvider;
import org.junit.*;
import pages.automationpractice.ProductPage;

public class ProductPageTest {


    @BeforeClass
    public static void init() {
        System.out.println("Starting all tests from this class ");
    }

    @Before
    public void initEachTest(){
        System.out.println("Starting particular test from Automation Practice testing suite...");
    }

    //weryfikacja informacji na stronie produktu
    @Test
    public void productInfoVerify(){
        ProductPage productPage = new ProductPage();
        productPage.open();
        Assert.assertEquals("Short sleeved blouse with feminine draped sleeve detail.", productPage.getDescription());
        Assert.assertEquals("$27.00", productPage.getPrice());
        Assert.assertEquals("Black", productPage.getColor());
        Assert.assertEquals("S", productPage.getSize());
        Assert.assertEquals("Cotton", productPage.getComposition());
        Assert.assertEquals("Casual", productPage.getStyles());
        Assert.assertEquals("Short Sleeve", productPage.getProperties());
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
