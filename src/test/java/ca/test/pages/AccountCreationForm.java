package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationForm {


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/ul/a[5]/div[2]/h3")
    public WebElement Account;
    @FindBy(id = "addNewUsers")
    public WebElement AddNewAccount;
    @FindBy(xpath = "//div[@class='company_name field-view']/input[@class='field-edit']")
    public WebElement CompanyName;
    @FindBy(xpath = "//select[@id='company_type']")
    public WebElement AccountType;
    @FindBy(xpath = "//div[@class='address_input']/input[@class='field-edit'][1]")
    public WebElement Address;
    @FindBy(xpath = "//div[@class='address_input']/select[@id='country']")
    public WebElement Country;
    @FindBy(xpath = "//div[@class='address_input']/select[@id='province']")
    public WebElement Province;
    @FindBy(xpath = "//div[@class='address_input']/select[@id='city']")
    public WebElement City;
    @FindBy(xpath = "//div[@class='address_input']/input[@id='postal_zip']")
    public WebElement PostalCode;
    @FindBy(xpath = "//div[@class='info-block']/input[@id='email']")
    public WebElement Email;
    @FindBy(xpath = "//div[@class='info-block']/input[@id='phone']")
    public WebElement OfficePhone;
    @FindBy(xpath = "//div[@class='info-block']/input[@id='fax']")
    public WebElement Fax;
    @FindBy(xpath = "//a[@class='widget-button-save']/div[@id='save']")
    public WebElement SaveFirm;
    @FindBy(xpath = "//div[@class='first_name field-view']/input[@class='field-edit'][1]")
    public WebElement FirstName;
    @FindBy(xpath = "//div[@class='first_name field-view']/input[@class='field-edit'][2]")
    public WebElement LastName;
    @FindBy(xpath = "//div[@class='info-block']/input[@class='field-edit'][1]")
    public WebElement JobTitle;
    @FindBy(xpath = "//div[@class='info-block']/input[@class='field-edit'][2]")
    public WebElement userEmail;
    @FindBy(xpath = "//div[@class='info-block']/input[@id='office_phone']")
    public WebElement DirectLine;
    @FindBy(xpath = "//div[@class='info-block']/input[@class='field-edit'][4]")
    public WebElement Extension;
    @FindBy(xpath = "//div[@class='info-block']/input[@id='mobile_phone']")
    public WebElement Mobile;
    @FindBy(xpath = "//div[@class='info-block']/label[1]/input[@id='accept_campaign-0']")
    public WebElement ECommunications;
    @FindBy(xpath = "//div[@class='info-block']/input[@id='note']")
    public WebElement Note;
    @FindBy(xpath = "//div[@class='info-block']/input[@class='field-edit'][7]")
    public WebElement UserName;
    @FindBy(xpath = "//div[@class='info-block']/input[@class='field-edit'][8]")
    public WebElement Password;
    @FindBy(xpath = "//a[@class='widget-button-save']/div[@id='save']")
    public WebElement Save;

    CommonUtils utils = new CommonUtils();


    public AccountCreationForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Accounts() {
        KnowsTestContext.driver.switchTo().frame(KnowsTestContext.driver.findElement(By.className("dashboard-content")));
        utils.waitForElements(Account, KnowsTestContext.timeout, KnowsTestContext.driver);
        Account.click();
        KnowsTestContext.driver.switchTo().defaultContent();
    }

    public void AddNewAcount() {
        utils.waitForElements(AddNewAccount, KnowsTestContext.timeout, KnowsTestContext.driver);
        AddNewAccount.click();
    }

    public void AddCompanyName(String companyname) {
        utils.waitForElements(CompanyName, KnowsTestContext.timeout, KnowsTestContext.driver);
        CompanyName.sendKeys(companyname);
    }

    public void SelectCompanyType(String accounttype) {
        utils.waitForElements(AccountType, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpAccount = new Select(AccountType);
        drpAccount.selectByVisibleText(accounttype);

    }

    public void Address(String address) {
        utils.waitForElements(Address, KnowsTestContext.timeout, KnowsTestContext.driver);
        Address.sendKeys(address);
    }

    public void Country(String country) {
        utils.waitForElements(Country, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCountry = new Select(Country);
        drpCountry.selectByVisibleText(country);
    }

    public void Province(String province) {
        utils.waitForElements(Province, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpProvince = new Select(Province);
        drpProvince.selectByVisibleText(province);
    }

    public void City(String city) throws InterruptedException {
        utils.waitForElements(City, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCity = new Select(City);
        Thread.sleep(5000);
        drpCity.selectByVisibleText(city);
    }

    public void PostalCode(String postalcode) {
        utils.waitForElements(PostalCode, KnowsTestContext.timeout, KnowsTestContext.driver);
        PostalCode.sendKeys(postalcode);

    }

    public void ContactEmail(String email) {
        utils.waitForElements(Email, KnowsTestContext.timeout, KnowsTestContext.driver);
        Email.sendKeys(email);
    }

    public void OfficePhone(String phone) {
        utils.waitForElements(OfficePhone, KnowsTestContext.timeout, KnowsTestContext.driver);
        OfficePhone.sendKeys(phone);
    }

    public void Fax(String fax) {
        utils.waitForElements(Fax, KnowsTestContext.timeout, KnowsTestContext.driver);
        Fax.sendKeys(fax);
    }

    public void SaveFirm() {
        utils.waitForElements(SaveFirm, KnowsTestContext.timeout, KnowsTestContext.driver);
        SaveFirm.click();
    }

    public void FirstName(String firstname) {
        utils.waitForElements(FirstName, KnowsTestContext.timeout, KnowsTestContext.driver);
        FirstName.sendKeys(firstname);
    }

    public void LastName(String lastname) {
        utils.waitForElements(LastName, KnowsTestContext.timeout, KnowsTestContext.driver);
        LastName.sendKeys(lastname);
    }

    public void JobTitle(String jobtiltle) {
        utils.waitForElements(JobTitle, KnowsTestContext.timeout, KnowsTestContext.driver);
        JobTitle.sendKeys(jobtiltle);
    }

    public void userEmail(String useremail) {
        utils.waitForElements(userEmail, KnowsTestContext.timeout, KnowsTestContext.driver);
        userEmail.sendKeys(useremail);
    }

    public void DirectLine(String directline) {
        utils.waitForElements(DirectLine, KnowsTestContext.timeout, KnowsTestContext.driver);
        DirectLine.sendKeys(directline);
    }

    public void Extension(String extension) {
        utils.waitForElements(Extension, KnowsTestContext.timeout, KnowsTestContext.driver);
        Extension.sendKeys(extension);
    }

    public void Mobile(String mobile) {
        utils.waitForElements(Mobile, KnowsTestContext.timeout, KnowsTestContext.driver);
        Mobile.sendKeys(mobile);
    }

    public void Ecommunications() {
        utils.waitForElements(ECommunications, KnowsTestContext.timeout, KnowsTestContext.driver);
        ECommunications.click();
    }

    public void Note(String note) {
        utils.waitForElements(Note, KnowsTestContext.timeout, KnowsTestContext.driver);
        Note.sendKeys(note);
    }

    public void Username1(String username) {
        utils.waitForElements(UserName, KnowsTestContext.timeout, KnowsTestContext.driver);
        UserName.sendKeys(username);
    }

    public void Password1(String password) {
        utils.waitForElements(Password, KnowsTestContext.timeout, KnowsTestContext.driver);
        Password.sendKeys(password);
    }

    public void SaveUser() {
        utils.waitForElements(SaveFirm, KnowsTestContext.timeout, KnowsTestContext.driver);
        SaveFirm.click();
    }
}
