package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {

    @Test(description = "Creating new contact")
    public void createAccount() {
        loginPage.openPage()
                .isPageOpened()
                .login(LOGIN, PASSWORD)
                .isPageOpened();

        accountListPage.openPage()
                .isPageOpened()
                .clickNew()
                .create(account)
                .isPageOpened()
                .openDetailsTab()
                .isTabOpened();

        String accountNameActual = accountDetailsPage.getAccountDetails("Account Name");
        String typeActual = accountDetailsPage.getAccountDetails("Type");
        String descriptionActual = accountDetailsPage.getAccountDetails("Description");
        String employeesActualStr = accountDetailsPage.getAccountDetails("Employees");
        Integer employeesActual = Integer.parseInt(employeesActualStr);
        String industryActual = accountDetailsPage.getAccountDetails("Industry");
        String PhoneActual = accountDetailsPage.getAccountDetails("Phone");
        String websiteActual = accountDetailsPage.getAccountDetails("Website");

        assertEquals(accountNameActual, account.getName(), account.getName() + " should be displayed");
        assertEquals(typeActual, account.getType(), account.getType() + " should be displayed");
        assertEquals(employeesActual, account.getEmployees(), account.getEmployees() + " should be displayed");
        assertEquals(descriptionActual, account.getDescription(), account.getDescription() + " should be displayed");
        assertEquals(industryActual, account.getIndustry(), account.getIndustry() + " should be displayed");
        assertEquals(PhoneActual, APPLE_PHONE, APPLE_PHONE + " should be displayed");
        assertEquals(websiteActual, APPLE_WEBSITE, APPLE_WEBSITE + " should be displayed");
    }
}
