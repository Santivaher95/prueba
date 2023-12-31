package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;




public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("Webdriver.chrome.driver", "C:/chromedriver_win64/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
        
    }
    
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}