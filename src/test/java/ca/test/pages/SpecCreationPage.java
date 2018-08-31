package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SpecCreationPage {

    @FindBy(xpath = "//div[@class='solutions_menu container text-center']/div[@class='row'][2]/div[@class='col-xs-6 menu_item'][1]/a[@class='btn btn-primary']")
    public WebElement BuildonOwn;
    @FindBy(xpath = "//div/div[@class='row']/div[@class='col-xs-5 pull-left']/a[@class='create-spec btn btn-primary hvr-glow']")
    public WebElement CreateNewProject;
    @FindBy(xpath = "//div[@id='div_internalno']/div[@class='col-xs-12']/input[@id='internalno']")
    public WebElement InternalNo;
    @FindBy(xpath = "//div[@id='div_projectname']/div[@class='col-xs-12']/input[@id='projectname']")
    public WebElement SpecName;
    @FindBy(xpath = "//div[@id='div_building_type']/div[@class='col-xs-12']/select[@id='building_type']")
    public WebElement BuildingClass;
    @FindBy(xpath = "//div[@id='div_building_type2']/div[@class='form-group ']/div[@class='col-xs-12']/select[@id='building_type2']")
    public WebElement BuildingType;
    @FindBy(xpath = "//div[@id='div_province']/div[@class='col-xs-12']/select[@id='province']")
    public WebElement State;
    @FindBy(xpath = "//div[@id='div_city']/div[@class='col-xs-12']/select[@id='city']")
    public WebElement City;
    @FindBy(xpath = "//div[@id='div_address']/div[@class='col-xs-12']/input[@id='address']")
    public WebElement Address;
    @FindBy(xpath = "//div[@id='div_area']/div[@class='col-xs-12']/input[@id='area']")
    public WebElement Area;
    @FindBy(xpath = "//div[@id='div_yourname']/div[@class='col-xs-12']/select[@id='yourname']")
    public WebElement YourName;
    @FindBy(xpath = "//div[@class='form-group'][7]/div[@class='col-xs-24']/div[@class='btn pull-right']/input[@id='submit']")
    public WebElement Create;
    @FindBy(xpath = "//div[@class='your-rooms-holder col-xs-18']/div[@class='group-of-rooms panel-group']/div[1]/a")
    public WebElement SpecLoad;

    CommonUtils utils = new CommonUtils();

    public SpecCreationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void buildonOwn() throws InterruptedException {
        utils.waitForElements(BuildonOwn, KnowsTestContext.timeout, KnowsTestContext.driver);
        BuildonOwn.click();
    }

    public void clickonCreateNewproject() {
        utils.waitForElements(CreateNewProject, KnowsTestContext.timeout, KnowsTestContext.driver);
        CreateNewProject.click();
    }

    public void internalNo(String internalno) {
        utils.waitForElements(InternalNo, KnowsTestContext.timeout, KnowsTestContext.driver);
        InternalNo.sendKeys(internalno);
    }

    public void specName(String sname) {
        utils.waitForElements(SpecName, KnowsTestContext.timeout, KnowsTestContext.driver);
        SpecName.sendKeys(sname);
    }

    public void buildClass(String bldclass) {
        utils.waitForElements(BuildingClass, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpbuildclass = new Select(BuildingClass);
        drpbuildclass.selectByVisibleText(bldclass);
    }

    public void builType(String bldType) {
        utils.waitForElements(BuildingType, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpbuildType = new Select(BuildingType);
        drpbuildType.selectByVisibleText(bldType);
    }

    public void state(String stt) {
        utils.waitForElements(State, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpstate = new Select(State);
        drpstate.selectByVisibleText(stt);
    }

    public void city(String ct) throws InterruptedException {
        utils.waitForElements(City, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpcit = new Select(City);
        Thread.sleep(9000);
        drpcit.selectByVisibleText(ct);
    }

    public void add(String add) {
        utils.waitForElements(Address, KnowsTestContext.timeout, KnowsTestContext.driver);
        Address.sendKeys(add);
    }

    public void squareFt(String sqft) {
        utils.waitForElements(Area, KnowsTestContext.timeout, KnowsTestContext.driver);
        Area.sendKeys(sqft);
    }

    public void urname(String urnm) {
        utils.waitForElements(YourName, KnowsTestContext.timeout, KnowsTestContext.driver);
        Select drpurName = new Select(YourName);
        drpurName.selectByVisibleText(urnm);

    }

    public void create() {
        utils.waitForElements(Create, KnowsTestContext.timeout, KnowsTestContext.driver);
        Create.click();
    }

    public void specLoad() {
        utils.waitForElements(SpecLoad, KnowsTestContext.timeout, KnowsTestContext.driver);
        String actual = SpecLoad.getText();
        String expected = ("No rooms added, please click here or in the left menu to add a room");
        Assert.assertEquals(actual, expected);
    }
}
