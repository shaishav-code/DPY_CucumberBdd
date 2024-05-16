package awasomecucumber.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch (browser){
            case "chrome" :
                WebDriverManager.chromedriver().setup();
//                System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe ");
                driver = new ChromeDriver();
                System.out.println("Chrome browser is invoking");
                break;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
//                System.setProperty("Webdriver.gekco.driver","C:\\Users\\pdarshak\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
                driver = new FirefoxDriver();
                System.out.println("Firfox browser is invoking");
                break;
            default:
                throw new IllegalStateException("INVALID BROWSER" + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }

}
