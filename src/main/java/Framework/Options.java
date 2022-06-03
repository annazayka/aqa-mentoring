package Framework;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Options extends ChromeOptions {

    private ChromeOptions options = new ChromeOptions();

    public Options setPageLoadStrategy(PageLoadStrategy strategy) {
        options.setPageLoadStrategy(strategy);
        return this;
    }

    public Options openBrowserFullScreen() {
        options.addArguments("--start-fullscreen");
        return this;
    }

    public ChromeOptions getOptions() {
        return options;
    }

}