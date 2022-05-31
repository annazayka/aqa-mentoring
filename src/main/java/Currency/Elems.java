package Currency;

import org.openqa.selenium.WebElement;

public class Elems {
    public String getText(long defaultElem) {
        return this.getText(Timeout.getDefaultElem());
    }

    public String getAttribute(String name) {
        return this.find(Timeout.getDefaultElem()).getAttribute(name);
    }
    public WebElement find(long defaultElem) {
        return this.find(Timeout.getDefaultElem());
    }
}


