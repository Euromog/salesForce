package tests;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test(description = "Creating new contact")
    public void createContact() {
        loginPage.openPage()
                .isPageOpened()
                .login(LOGIN, PASSWORD)
                .isPageOpened();

        accountListPage.openPage()
                .isPageOpened()
                .clickNew()
                .create(account)
                .isPageOpened();
    }

}
