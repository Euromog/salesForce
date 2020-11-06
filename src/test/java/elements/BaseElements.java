package elements;

import base.Waiter;
import org.openqa.selenium.WebDriver;

public class BaseElements extends Waiter {
    WebDriver driver;
    public String label;

    public BaseElements(WebDriver driver, String label) {
        super(driver);
        this.driver = driver;
        this.label = label;
    }

    public void writeActionMessage(String text) {
        System.out.println(String.format("Writing text '%s' into input with label '%s'", text, label));
    }
}
