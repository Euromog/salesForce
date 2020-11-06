package tests;

import models.Account;
import models.Contact;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountDetailsPage accountDetailsPage;
    AccountListPage accountListPage;
    NewAccountModal newAccountModal;
    ContactDetailsPage contactDetailsPage;
    ContactListPage contactListPage;
    NewContactModal newContactModal;
    Account account;
    Contact contact;
    public static final String LOGIN = "evgeniy.makuta.job-mc1u@force.com";
    public static final String PASSWORD = "werq1234";
    public static final String ACCOUNT_NAME = "Apple";
    public static final String APPLE_PHONE = "+1 408-996-1010";
    public static final String APPLE_WEBSITE = "https://www.apple.com/";
    public void setAccount(Account account) {
        this.account = account;
    }
    public static String getAccountName() {
        return ACCOUNT_NAME;
    }

    public void createInstances() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        accountListPage = new AccountListPage(driver);
        newAccountModal = new NewAccountModal(driver);
        contactListPage = new ContactListPage(driver);
        contactDetailsPage = new ContactDetailsPage(driver);
        newContactModal = new NewContactModal(driver);
        account = new Account.Builder()
                .withName(ACCOUNT_NAME)
                .withWebSite("tut.by")
                .withType("Analyst")
                .withDescription("Hello World!")
                .withParentAccount("Evgeniy1")
                .withPhone("123456789")
                .withIndustry("Energy")
                .withEmployees(5)
                .withBillingAddress("Vlasmarkt 37")
                .withBillingCity("Minsk")
                .withBillingStreet("Pushkina 10")
                .withBillingState("Minsk")
                .withBillingZip("12345")
                .withBillingCountry("Belarus")
                .withShippingAddress("prospekt Pushkina 44")
                .withShippingStreet("Pobeda 26")
                .withShippingCity("Brest")
                .withShippingState("Mogilev")
                .withShippingZip("212112")
                .withShippingCountry("Belgium")
                .build();

        contact = new Contact.Builder()
                .withFirstName("Ivan")
                .withMiddleName("Ivanovich")
                .withLastName("Ivanov")
                .withSalutation("Ms.")
                .withSuffix("van")
                .withAccountName("Apple")
                .withTitle("Company")
                .withEmail("email@email.com")
                .withPhone("12345678")
                .withMobile("7654321")
                .withReportsTo("Evgeniy")
                .withDepartment("IT")
                .withFax("2221111")
                .withMailingAddress("Nationalestraat 101")
                .withMailingStreet("Street")
                .withMailingCity("Minsk")
                .withMailingZip("21212")
                .withMailingState("Minsk")
                .withMailingCountry("Belarus")
                .build();
    }

    @BeforeSuite
    public void setDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    }

    @BeforeMethod
    public void setUp() {
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