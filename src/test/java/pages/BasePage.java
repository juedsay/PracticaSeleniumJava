package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

   protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);

    static{
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
    }
        public BasePage(WebDriver driver){
            BasePage.driver = driver;
            wait = new WebDriverWait(driver, 10);
        }

        public void navigateTo(String url){
            driver.get(url);
        }
}

