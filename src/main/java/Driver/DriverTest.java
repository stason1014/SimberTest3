package Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {

    public static ChromeDriver getChromeDriver() {
        String path = System.getProperty("user.dir");
        String chromeDriverPath = path + "\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }
}