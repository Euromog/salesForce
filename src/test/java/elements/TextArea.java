package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea extends BaseElements {
    String textAreaLocator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//textarea";

    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }

    public TextArea write(String text) {
        sleep(3000);
        WebElement textArea = driver.findElement(By.xpath(String.format(textAreaLocator, label)));
        String textInsideTextArea = textArea.getAttribute("value");
        if (textInsideTextArea.isEmpty()) {
            writeActionMessage(label);
            waiter(textAreaLocator, label);
            findTextArea(label).sendKeys(text);
        }
        return this;
    }

    public WebElement findTextArea(String textAreaName) {
        return driver.findElement(By.xpath(String.format(textAreaLocator, textAreaName)));
    }
}
