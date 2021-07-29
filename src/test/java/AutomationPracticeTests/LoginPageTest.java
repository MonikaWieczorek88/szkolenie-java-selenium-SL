package AutomationPracticeTests;

import drivers.DriverProvider;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.junit.*;
import org.openqa.selenium.By;
import pages.Page;
import pages.automationpractice.HomePage;
import pages.automationpractice.LoginPage;



public class LoginPageTest extends Page {

    HomePage homePage;
    LoginPage loginPage;


    @BeforeClass
    public static void init() {
    }


    @Override
    public void open() {
    }

    //logowanie z poprawnymi - istniejącymi danymi (utworzono wcześniej takie konto)
    @Test
    public void corectLoginTest() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        homePage.open();
        homePage.goToLoginPage();
        loginPage.fillingTheFields("monika.tester.88@gmail.com", "test123");

    }

    //logowanie z niestniejącymi danymi
    @Test
    public void failedLoginTest() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        homePage.open();
        homePage.goToLoginPage();
        loginPage.fillingTheFields("randomemail@gmail.com", "111");

    }


    @After
    public void after() {

        DriverProvider.flush();

    }

    @AfterClass
    public static void afterClass() {

    }
}
