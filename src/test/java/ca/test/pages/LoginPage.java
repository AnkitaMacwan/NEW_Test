package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "modal-login-button")
    public WebElement login;
    @FindBy(id = "usernameLogin")
    public WebElement username;
    @FindBy(id = "rawPwdLogin")
    public WebElement password;
    @FindBy(id = "btn_login")
    public WebElement loginbutton;
    @FindBy(xpath = "//*[@id=\"login_err_msg\"]")
    public WebElement validationmessage;

    CommonUtils utils = new CommonUtils();

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login() {
        utils.waitForElements(login, KnowsTestContext.timeout, KnowsTestContext.driver);
        login.click();
    }

    public void username(String user) {
        utils.waitForElements(username, KnowsTestContext.timeout, KnowsTestContext.driver);
        username.sendKeys(user);
    }

    public void password(String pass) {
        utils.waitForElements(password, KnowsTestContext.timeout, KnowsTestContext.driver);
        password.sendKeys(pass);
    }

    public void loginbutton() {
        utils.waitForElements(loginbutton, KnowsTestContext.timeout, KnowsTestContext.driver);
        loginbutton.click();

    }

    public void validation(String errormessage) {
        utils.waitForElements(validationmessage, KnowsTestContext.timeout, KnowsTestContext.driver);
        String actualerrormessage = validationmessage.getText();
        Assert.assertEquals(actualerrormessage, errormessage);
    }
}

