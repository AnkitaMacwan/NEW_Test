package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

    @FindBy(xpath = "//div[@class='col-xs-16 col-xs-offset-4']/a[@class='btn btn-primary']")
    public WebElement SignUp;
    @FindBy(xpath = "//div[@class='col-sm-12 full-name'][1]/input[@class='form-control']")
    public WebElement FirstName;
    @FindBy(xpath = "//div[@class='col-sm-12 full-name'][2]/input[@class='form-control']")
    public WebElement LastName;
    @FindBy(xpath = "//div[2]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/input[@class='form-control']")
    public WebElement UserName;
    @FindBy(xpath = "//div[3]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/input[@class='form-control']")
    public WebElement Phone;
    @FindBy(xpath = "//div[4]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/input[@class='form-control'] ")
    public WebElement Email;
    @FindBy(xpath = "//div[6]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/input[@class='form-control']")
    public WebElement CompanyName;
    @FindBy(xpath = "//div[7]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/fieldset/div[1]/select[@class='form-control']")
    public WebElement CompanyType;
    @FindBy(xpath = "//div[8]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/input[@class='form-control']")
    public WebElement Address;
    @FindBy(xpath = "//div[9]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/fieldset/div[1]/select[@class='form-control']")
    public WebElement Country;
    @FindBy(xpath = "//div[9]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/fieldset/div[2]/select[@class='form-control']")
    public WebElement Province;
    @FindBy(xpath = "//div[9]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/fieldset/div[3]/select[@class='form-control']")
    public WebElement City;
    @FindBy(xpath = "//div[10]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/input[@class='form-control']")
    public WebElement PostalCode;
    @FindBy(xpath = "//div[12]/div[@class='form-group form-group-sm']/div[@class='col-sm-8']/fieldset/div[1]/select[@class='form-control'] ")
    public WebElement Refernce;
    @FindBy(xpath = "//*[@id=\"registration-app\"]/div/div/form/div[13]/div/div/fieldset/div[1]/div/input")
    public WebElement ECommunications;
    @FindBy(xpath = "//*[@id=\"registration-app\"]/div/div/form/div[14]/div/div/div/input")
    public WebElement TermsandConditions;
    @FindBy(xpath = "//div[@class='registration-form container']/div/form[@class='form form-horizontal']/div[@class='text-right']/button[@class='btn btn-primary']")
    public WebElement Submit;
    @FindBy(xpath = "//*[@id=\"registration-app\"]/div/div/h2")
    public WebElement SuccessMessage;
    @FindBy(xpath = "//small[@class='text-danger' and contains(text(),'Required')]/../preceding-sibling::*")
    public WebElement requirederrormessage;


    CommonUtils utils = new CommonUtils();

    public RegistrationForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void signUp() {
        utils.waitForElements(SignUp, KnowsTestContext.timeout, KnowsTestContext.driver);
        SignUp.click();
    }

    public void firstName(String firstname) {
        utils.waitForElements(FirstName, KnowsTestContext.timeout, KnowsTestContext.driver);
        FirstName.sendKeys(firstname);
    }

    public void lastName(String lastname) {
        utils.waitForElements(LastName, KnowsTestContext.timeout, KnowsTestContext.driver);
        LastName.sendKeys(lastname);
    }

    public void userName(String username) {
        utils.waitForElements(UserName, KnowsTestContext.timeout, KnowsTestContext.driver);
        UserName.sendKeys(username);
    }

    public void phoneNumber(String phonenumber) {
        utils.waitForElements(Phone, KnowsTestContext.timeout, KnowsTestContext.driver);
        Phone.sendKeys(phonenumber);
    }

    public void emailAdress(String email) {
        utils.waitForElements(Email, KnowsTestContext.timeout, KnowsTestContext.driver);
        Email.sendKeys(email);
    }

    public void companyName(String companyname) {
        utils.waitForElements(CompanyName, KnowsTestContext.timeout, KnowsTestContext.driver);
        CompanyName.sendKeys(companyname);
    }

    public void companyType(String companytype) {
        utils.waitForElements(CompanyType, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCompanyType = new Select(CompanyType);
        drpCompanyType.selectByVisibleText(companytype);
    }

    public void address(String address) {
        utils.waitForElements(Address, KnowsTestContext.timeout, KnowsTestContext.driver);
        Address.sendKeys(address);
    }

    public void country(String country) {
        utils.waitForElements(Country, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCountry = new Select(Country);
        drpCountry.selectByVisibleText(country);
    }

    public void province(String province) {
        utils.waitForElements(Province, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpProvince = new Select(Province);
        drpProvince.selectByVisibleText(province);
    }

    public void city(String city) {
        utils.waitForElements(City, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCity = new Select(City);
        drpCity.selectByVisibleText(city);
    }

    public void postalCode(String postalcode) {
        utils.waitForElements(PostalCode, KnowsTestContext.timeout, KnowsTestContext.driver);
        PostalCode.sendKeys(postalcode);
    }

    public void reference(String reference) {
        utils.waitForElements(Refernce, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpReference = new Select(Refernce);
        drpReference.selectByVisibleText(reference);
    }

    public void eCommunications() {
        utils.waitForElements(ECommunications, KnowsTestContext.timeout, KnowsTestContext.driver);
        ECommunications.click();
    }

    public void termsAndCondition() {
        utils.waitForElements(TermsandConditions, KnowsTestContext.timeout, KnowsTestContext.driver);
        TermsandConditions.click();
    }

    public void submit() {
        utils.waitForElements(Submit, KnowsTestContext.timeout, KnowsTestContext.driver);
        Submit.click();
    }

    public void successMessage() {
        utils.waitForElements(SuccessMessage, KnowsTestContext.timeout, KnowsTestContext.driver);
        String actualText = SuccessMessage.getText();
        String expectedText = ("Congratulations!\n" +
                "You’ve successfully signed up to ATS Spec.");
        Assert.assertEquals(expectedText, actualText);
    }

    public void requiredMessage(String name) {
        utils.waitForElements(requirederrormessage, KnowsTestContext.timeout, KnowsTestContext.driver);
        String actualMessage = requirederrormessage.getAttribute(name);
        String expected = "Required";
        Assert.assertEquals(expected, actualMessage);
    }


}
