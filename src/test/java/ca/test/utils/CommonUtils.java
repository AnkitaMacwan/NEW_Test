package ca.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

    public void waitForElements(WebElement e , int timeout , WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver , timeout);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public WebDriver getDriver(String browserType){
        WebDriver driver = KnowsTestContext.driver ;
        if (browserType.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe");
           driver = new ChromeDriver();
        }else if (browserType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver" , "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        return driver;
    }

}
