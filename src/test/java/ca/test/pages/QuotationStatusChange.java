package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class QuotationStatusChange {

      CommonUtils utils = new CommonUtils();

    public QuotationStatusChange(WebDriver driver) {
    }

    public void quotaion(){
          utils.getDriver("firefox");
          KnowsTestContext.driver.get("http://staging.atsspec.local/");
          KnowsTestContext.driver.findElement(By.id("modal-login-button")).click();
          KnowsTestContext.driver.findElement(By.id("usernameLogin")).sendKeys("brandon@atsspec.co");
          KnowsTestContext.driver.findElement(By.id("rawPwdLogin")).sendKeys("B4ck00fU");
          KnowsTestContext.driver.findElement(By.id("btn_login")).click();

      }

}
