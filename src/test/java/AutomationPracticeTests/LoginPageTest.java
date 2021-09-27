package AutomationPracticeTests;

import drivers.DriverProvider;
import org.junit.*;
import pages.automationpractice.LoginPage;

public class LoginPageTest {



    @BeforeClass
    public static void init() {
        System.out.println("Starting all tests from this class ");
    }

    @Before
    public void initEachTest(){
        System.out.println("Starting particular test from Automation Practice testing suite...");
    }

    //logowanie z poprawnymi - istniejącymi danymi (utworzono wcześniej takie konto)
    @Test
    public void correctLoginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.fillingTheFields("monika.tester.88@gmail.com", "test123");
        Assert.assertEquals("Monika Wieczorek", loginPage.userInfo());
    }

    //logowanie z niestniejącymi danymi
    @Test
    public void failedLogintest(){

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.fillingTheFields("randomemail@gmail.com", "111");
        Assert.assertEquals("There is 1 error", loginPage.errorMessage());
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
