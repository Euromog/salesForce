package tests;

import models.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountDetails accountDetails;
    AccountListPage accountListPage;
    NewAccountModal newAccountModal;
    Account account;
    public static final String LOGIN = "evgeniy.makuta.job-mc1u@force.com";
    public static final String PASSWORD = "werq1234";

    public void setAccount(Account account) {
        this.account = account;
    }

    public void createInstances() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountDetails = new AccountDetails(driver);
        accountListPage = new AccountListPage(driver);
        newAccountModal = new NewAccountModal(driver);
        account = new Account.Builder()
                .withName("Apple")
                .withWebSite("tut.by")
                .withType("Analyst")
                .withDescription("Hello World!")
                .withParentAccount("Evgeniy1")
                .withPhone("123456789")
                .withIndustry("Energy")
                .withEmployees(5)
                .withBillingAddress("Pushkina 10/4")
                .withBillingCity("Minsk")
                .withBillingStreet("Pushkina 10")
                .withBillingState("Minsk2")
                .withBillingZip("12345")
                .withBillingCountry("Belarus")
                .withShippingAddress("Pobeda 26/3")
                .withShippingStreet("Pobeda 26")
                .withShippingCity("Mogilev")
                .withShippingState("Mogilev2")
                .withShippingZip("212112")
                .withShippingCountry("Belgium")
                .build();
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        createInstances();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}