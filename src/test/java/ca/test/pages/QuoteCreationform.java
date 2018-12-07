package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuoteCreationform {

    @FindBy(xpath = "//*[@id=\"login-site\"]")
    public WebElement loginAs;
    @FindBy(xpath = "//button[@id='login-as-user']")
    public WebElement directlogin;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/ul/a[6]/div[2]/h3")
    public WebElement Quotations;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/a[1]")
    public WebElement CreateQuote;
    @FindBy(xpath = "//*[@id=\"quote-edit-form\"]/div/div[5]/div[1]/input[1]")
    public WebElement JobName;
    @FindBy(xpath = "//select[@id='job-country']")
    public WebElement Country;
    @FindBy(xpath = "//select[@id='job-province']")
    public WebElement Province;
    @FindBy(xpath = "//select[@id='job-city']")
    public WebElement City;
    @FindBy(xpath = "//*[@id=\"quote-edit-form\"]/div/div[5]/div[1]/input[2]")
    public WebElement JobAddress;
    @FindBy(xpath = "//select[@id='job_type']")
    public WebElement JobType;
    @FindBy(xpath = "//select[@id='outside_rep']")
    public WebElement OutsideSalesRep;
    @FindBy(xpath = "//input[@id='customers_autocomplete']")
    public WebElement Customer;
    @FindBy(xpath = "//input[@id='engineer_name']")
    public WebElement Engineer;
    @FindBy(xpath = "//input[@id='architect_name']")
    public WebElement Architect;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[2]/input")
    public WebElement SectionTitle;
    @FindBy(xpath = "//div[@class='section_header left']/input[@class='section-field header-field']")
    public WebElement SectionHeader;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[6]/div[2]/div[2]/input")
    public WebElement Productnumber;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[1]/div[1]/span[2]")
    public WebElement NewSection;
    @FindBy(xpath = "//*[@id=\"section-block-1\"]/div[2]/input")
    public WebElement Newsectiontitle;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[1]/div[1]/span[3]")
    public WebElement AlternativeSection;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[1]/div[1]/span[4]")
    public WebElement DuplicateSection;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[1]/div[1]/span[5]")
    public WebElement ShowHideSection;
    @FindBy(xpath = "//*[@id=\"section-block-0\"]/div[1]/div[1]/span[6]")
    public WebElement DeleteScetion;
    @FindBy(xpath = "//div[@id='section-block-1']/div[@class='section_comments_bar']/div[@class='section_buttons']/span[@class='comment_button quote_icon']")
    public WebElement AddSectionComment;
    @FindBy(xpath = "//*[@id=\"quote-edit-form\"]/div/div[13]/textarea[1]")
    public WebElement SpecialTerms;
    @FindBy(xpath = "//div[@class='quote-info-wrap info-block section notes-area']/textarea[2]")
    public WebElement Comments;
    @FindBy(xpath = "//div[@class='uploadingFile']/input[@class='input']")
    public WebElement ChooseFile;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    public WebElement quoteload;
    @FindBy(xpath = "//*[@id=\"quote-edit-form\"]/div/div[1]/div/button")
    public WebElement Save;


    CommonUtils utils = new CommonUtils();

    public QuoteCreationform(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void loginAs(String userid) throws InterruptedException {
        KnowsTestContext.driver.get("http://hotfix.atsspec.local/crm/index/page/#?page=details&type=user&id=" + userid + "");
        // Thread.sleep(20000);
    }

    public void site(String site) throws InterruptedException {
        utils.waitForElements(loginAs, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpsite = new Select(loginAs);
        drpsite.selectByVisibleText(site);
        //Thread.sleep(10000);

    }

    public void directlogin() throws InterruptedException {
        ((JavascriptExecutor) KnowsTestContext.driver).executeScript("arguments[0].scrollIntoView(true);", directlogin);
        directlogin.click();
        Thread.sleep(1000);
        KnowsTestContext.driver.switchTo().alert().accept();


    }

    public void quote() throws InterruptedException {
        KnowsTestContext.driver.switchTo().frame(KnowsTestContext.driver.findElement(By.className("dashboard-content")));
        //Thread.sleep(5000);
        utils.waitForElements(Quotations, KnowsTestContext.timeout, KnowsTestContext.driver);
        Quotations.click();
        KnowsTestContext.driver.switchTo().defaultContent();
    }

    public void addQuote() {
        utils.waitForElements(CreateQuote, KnowsTestContext.timeout, KnowsTestContext.driver);
        CreateQuote.click();
    }

    public void addJobName(String jobname) {
        utils.waitForElements(JobName, KnowsTestContext.timeout, KnowsTestContext.driver);
        JobName.sendKeys(jobname);
    }

    public void jobCountry(String country) {
        utils.waitForElements(Country, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCountry = new Select(Country);
        drpCountry.selectByVisibleText(country);
    }

    public void jobProvince(String province) {
        utils.waitForElements(Province, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpProvince = new Select(Province);
        drpProvince.selectByVisibleText(province);
    }

    public void jobCity(String city) throws InterruptedException {
        utils.waitForElements(City, KnowsTestContext.timeout, KnowsTestContext.driver);
        Thread.sleep(7000);
        Select drpCity = new Select(City);
        drpCity.selectByVisibleText(city);
    }

    public void jobAddress(String address) {
        utils.waitForElements(JobAddress, KnowsTestContext.timeout, KnowsTestContext.driver);
        JobAddress.sendKeys(address);
    }

    public void jobType(String jobtype) {
        utils.waitForElements(JobType, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpJobtype = new Select(JobType);
        drpJobtype.selectByVisibleText(jobtype);
    }

    public void outsideSalesRep(String outsiderep) throws InterruptedException {
        Thread.sleep(5000);
        Select drpoutsiderep = new Select(OutsideSalesRep);
        drpoutsiderep.selectByVisibleText(outsiderep);
    }

    public void customer(String customer) throws InterruptedException {
        Customer.sendKeys(customer);
        String Xpath = "//a[@class='ui-corner-all' and contains(text(),'" + customer + "')]";
        Thread.sleep(5000);
        KnowsTestContext.driver.findElement(By.xpath(Xpath)).click();
    }

    public void engineer(String engineer) throws InterruptedException {
        Engineer.sendKeys(engineer);
        String Xpath = "//a[@class='ui-corner-all' and contains(text(),'" + engineer + "')]";
        Thread.sleep(5000);
        KnowsTestContext.driver.findElement(By.xpath(Xpath)).click();

    }

    public void architect(String engineer) throws InterruptedException {
        Architect.sendKeys(engineer);
        String Xpath = "//a[@class='ui-corner-all' and contains(text(),'" + engineer + "')]";
        Thread.sleep(5000);
        KnowsTestContext.driver.findElement(By.xpath(Xpath)).click();
    }

    public void sectionTitle(String sectiontitle) {
        utils.waitForElements(SectionTitle, KnowsTestContext.timeout, KnowsTestContext.driver);
        SectionTitle.sendKeys(sectiontitle);
    }

    public void sectionHeader(String header) {
        utils.waitForElements(SectionHeader, KnowsTestContext.timeout, KnowsTestContext.driver);
        SectionHeader.sendKeys(header);
    }

    public void productNumber(String productnumber) throws InterruptedException {
        ((JavascriptExecutor) KnowsTestContext.driver).executeScript("arguments[0].scrollIntoView(true);", Productnumber);
        Productnumber.sendKeys(productnumber);
        String Xpath = "//a[@class='ui-corner-all' and contains(text(),'" + productnumber + "')]";
        Thread.sleep(5000);
        KnowsTestContext.driver.findElement(By.xpath(Xpath)).click();

    }

    public void addSection(String sectiontitle) {
        utils.waitForElements(NewSection, KnowsTestContext.timeout, KnowsTestContext.driver);
        NewSection.click();
        Newsectiontitle.sendKeys(sectiontitle);
    }

    public void alternativeSection() {
        utils.waitForElements(AlternativeSection, KnowsTestContext.timeout, KnowsTestContext.driver);
        AlternativeSection.click();

    }

    public void duplicateSection() {
        utils.waitForElements(DuplicateSection, KnowsTestContext.timeout, KnowsTestContext.driver);
        DuplicateSection.click();

    }

    public void delete() {
        utils.waitForElements(DeleteScetion, KnowsTestContext.timeout, KnowsTestContext.driver);
        ShowHideSection.click();
    }

    public void showhidesection() {
        utils.waitForElements(ShowHideSection, KnowsTestContext.timeout, KnowsTestContext.driver);
        ShowHideSection.click();
    }

    public void specialTerms(String specialTerms) {
        utils.waitForElements(SpecialTerms, KnowsTestContext.timeout, KnowsTestContext.driver);
        SpecialTerms.sendKeys(specialTerms);
    }

    public void save() {
        utils.waitForElements(Save, KnowsTestContext.timeout, KnowsTestContext.driver);
        Save.click();
    }

    public void quoteLoad() {
        utils.waitForElements(quoteload, KnowsTestContext.timeout, KnowsTestContext.driver);
        String actual = quoteload.getText();
        String expected = ("VIEW QUOTE DETAILS");
        Assert.assertEquals(actual, expected);
    }

}
