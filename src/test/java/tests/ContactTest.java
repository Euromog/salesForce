package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContactTest extends BaseTest {

    @Test(description = "Creating new contact")
    public void createContact() {
        loginPage.openPage()
                .isPageOpened()
                .login(LOGIN, PASSWORD)
                .isPageOpened();
        contactListPage.openPage()
                .isPageOpened()
                .clickNew()
                .create(contact)
                .isPageOpened()
                .openDetailsTab()
                .isTabOpened();

        String nameActual = contactDetailsPage.getAccountDetails("Name");
        String titleActual = contactDetailsPage.getAccountDetails("Title");
        String emailActual = contactDetailsPage.getAccountDetails("Email");
        String phoneActual = contactDetailsPage.getAccountDetails("Phone");
        String mobileActual = contactDetailsPage.getAccountDetails("Mobile");
        String departmentActual = contactDetailsPage.getAccountDetails("Department");
        String faxActual = contactDetailsPage.getAccountDetails("Fax");

        String nameExpected = contact.getSalutation() + " " + contact.getFirstName() + " " + contact.getMiddleName() + " " + contact.getLastName() + " " + contact.getSuffix();
        assertEquals(nameActual, nameExpected, nameExpected + " should be displayed");
        assertEquals(titleActual, contact.getTitle(), contact.getTitle() + " should be displayed");
        assertEquals(emailActual, contact.getEmail(), contact.getEmail() + " should be displayed");
        assertEquals(phoneActual, contact.getPhone(), contact.getPhone() + " should be displayed");
        assertEquals(mobileActual, contact.getMobile(), contact.getMobile() + " should be displayed");
        assertEquals(departmentActual, contact.getDepartment(), contact.getDepartment() + " should be displayed");
        assertEquals(faxActual, contact.getFax(), contact.getFax() + " should be displayed");
    }
}
