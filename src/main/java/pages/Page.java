package pages;

import drivers.DriverProvider;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class Page {
    public static String URL;
    protected final WebDriver driver;

    public Page() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public abstract void open();

}
