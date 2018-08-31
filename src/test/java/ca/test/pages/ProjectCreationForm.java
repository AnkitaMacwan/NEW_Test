package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProjectCreationForm {

    @FindBy(xpath = "//div[@id='container']/nav[@class='navbar navbar-default']/div[@class='container']/ul[@class='nav navbar-nav']/li[1]/a[@id='solutions_link']")
    public WebElement solutions;
    @FindBy(xpath = "//div[@class='solutions_menu container text-center']/div[@class='row'][2]/div[@class='col-xs-6 menu_item'][4]/a[@class='btn btn-primary']")
    public WebElement startTracking;
    @FindBy(xpath = "//div[@class='col-xs-12']/div[@class='navbar-collapse collapse navbar-responsive-collapse']/ul[@class='nav navbar-nav']/li[@class='dropdown']/a[@id='xmenu2']")
    public WebElement projects;
    @FindBy(xpath = "//div[@class='col-xs-12']/div[@class='navbar-collapse collapse navbar-responsive-collapse']/ul[@class='nav navbar-nav']/li[@class='dropdown open']/ul[@class='dropdown-menu']/li[1]/a")
    public WebElement projectList;
    @FindBy(xpath = "//div[@class='col-xs-6'][2]/div[@class='pull-right']/div/button[@class='btn btn-primary btn-sm']/span")
    public WebElement createProject;
    @FindBy(xpath = "//div[1]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/input[@class='form-control']")
    public WebElement projectName;
    @FindBy(xpath = "//div[2]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/div/div[1]/div/div/div[@class='col-xs-6']/select[@class='form-control']")
    public WebElement leadsourceType;
    @FindBy(xpath = "//div[2]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/div/div[1]/div/div/div[@class='col-xs-6 lsn']/input[@class='form-control']")
    public WebElement leadsourceNumber;
    @FindBy(xpath = "//div[3]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/div[@class='datetime-picker']/div[1]/input[@class='form-control']")
    public WebElement dateofBid;
    @FindBy(xpath = "//div[4]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/input[@class='form-control']")
    public WebElement address;
    @FindBy(xpath = "//div[5]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/fieldset/div[1]/select[@class='form-control']")
    public WebElement country1;
    @FindBy(xpath = "//div[5]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/fieldset/div[2]/select[@class='form-control']")
    public WebElement province1;
    @FindBy(xpath = "//div[5]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/fieldset/div[3]/select[@class='form-control']")
    public WebElement city1;
    @FindBy(xpath = "//div[6]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/fieldset/div[1]/select[@class='form-control']")
    public WebElement buildingclass;
    @FindBy(xpath = "//div[6]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/fieldset/div[2]/select[@class='form-control']")
    public WebElement buildingType;
    @FindBy(xpath = "//div[7]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/input[@class='form-control']")
    public WebElement squareFootage;
    @FindBy(xpath = "//div[9]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/input[@class='form-control']")
    public WebElement projectValuation;
    @FindBy(xpath = "//div[10]/div[@class='form-group form-group-sm']/div[@class='col-sm-9']/select[@class='form-control']")
    public WebElement projectPhase;
    @FindBy(xpath = "//div[@class='modal-footer']/div[@class='text-right']/button[@class='btn btn-primary']")
    public WebElement submit;
    @FindBy(xpath = "//div[@id='widget-MyUploads']/div[@class='panel-body']/div[2]/div[@class='table-responsive']/table[@class='table table-condensed table-hover table-striped']/thead/tr/th[1]")
    public WebElement projectDetail;


    CommonUtils utils = new CommonUtils();


    public ProjectCreationForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void solution() throws InterruptedException {
        utils.waitForElements(solutions, KnowsTestContext.timeout, KnowsTestContext.driver);
        Thread.sleep(10000);
        solutions.click();

    }

    public void startTracking() {
        utils.waitForElements(startTracking, KnowsTestContext.timeout, KnowsTestContext.driver);
        startTracking.click();
    }

    public void projects() {
        utils.waitForElements(projects, KnowsTestContext.timeout, KnowsTestContext.driver);
        projects.click();
    }

    public void projectList() {
        utils.waitForElements(projectList, KnowsTestContext.timeout, KnowsTestContext.driver);
        projectList.click();
    }

    public void createProject() {
        utils.waitForElements(createProject, KnowsTestContext.timeout, KnowsTestContext.driver);
        createProject.click();
    }

    public void projectName(String Name) {
        utils.waitForElements(projectName, KnowsTestContext.timeout, KnowsTestContext.driver);
        projectName.sendKeys(Name);
    }

    public void leadSource(String Type) {
        utils.waitForElements(leadsourceType, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpleadsourceNumber = new Select(leadsourceType);
        drpleadsourceNumber.selectByVisibleText(Type);
    }

    public void lead(String Num) {
        utils.waitForElements(leadsourceNumber, KnowsTestContext.timeout, KnowsTestContext.driver);
        leadsourceNumber.sendKeys(Num);
    }

    public void dateofBid(String date) {
        utils.waitForElements(dateofBid, KnowsTestContext.timeout, KnowsTestContext.driver);
        dateofBid.sendKeys(date);
    }

    public void setaddress(String addres) {
        utils.waitForElements(address, KnowsTestContext.timeout, KnowsTestContext.driver);
        address.sendKeys(addres);
    }

    public void setCountry(String count) {
        utils.waitForElements(country1, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpCoun = new Select(country1);
        drpCoun.selectByVisibleText(count);

    }

    public void setProvince(String prov) {
        utils.waitForElements(province1, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpProv = new Select(province1);
        drpProv.selectByVisibleText(prov);
    }

    public void setcity(String cit) {
        utils.waitForElements(city1, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpcity = new Select(city1);
        drpcity.selectByVisibleText(cit);
    }

    public void buildingClass(String bclass) {
        utils.waitForElements(buildingclass, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpbuildingclass = new Select(buildingclass);
        drpbuildingclass.selectByVisibleText(bclass);
    }

    public void buldingType(String btype) {
        utils.waitForElements(buildingType, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpbuildingType = new Select(buildingType);
        drpbuildingType.selectByVisibleText(btype);
    }

    public void squareFootage(String sqrf) {
        utils.waitForElements(squareFootage, KnowsTestContext.timeout, KnowsTestContext.driver);
        squareFootage.sendKeys(sqrf);
    }

    public void projectvaluation(String projVal) {
        utils.waitForElements(projectValuation, KnowsTestContext.timeout, KnowsTestContext.driver);
        projectValuation.sendKeys(projVal);
    }

    public void projectPhase(String pphase) {
        utils.waitForElements(projectPhase, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpprojectphase = new Select(projectPhase);
        drpprojectphase.selectByVisibleText(pphase);

    }

    public void cliclSubmit() {
        utils.waitForElements(submit, KnowsTestContext.timeout, KnowsTestContext.driver);
        submit.click();
    }

    public void projectDetail() {
        utils.waitForElements(projectDetail, KnowsTestContext.timeout, KnowsTestContext.driver);
        String actual = projectDetail.getText();
        String expected = "Uploaded By";
        Assert.assertEquals(expected, actual);
    }


}
