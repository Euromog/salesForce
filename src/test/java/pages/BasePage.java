package pages;

import base.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage extends Waiter {
    WebDriver driver;
    WebDriverWait wait;
    public static final String URL = "https://evolution2.lightning.force.com/lightning/";
    public static final String BASE_URL = "https://evolution2.my.salesforce.com/";

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract BasePage openPage();

    public abstract BasePage isPageOpened();
}
