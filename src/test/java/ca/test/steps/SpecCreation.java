package ca.test.steps;

import ca.test.pages.LoginPage;
import ca.test.pages.ProjectCreationForm;
import ca.test.pages.SpecCreationPage;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpecCreation {

    SpecCreationPage speccreation = new SpecCreationPage(KnowsTestContext.driver);
    LoginPage loginpage = new LoginPage(KnowsTestContext.driver);
    ProjectCreationForm projectcreation = new ProjectCreationForm(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();

    @Given("^User go to ATS Home Page$")
    public void user_go_to_ATS_Home_Page() throws Throwable {
        KnowsTestContext.driver.get(reader.properties().getProperty("url"));
        KnowsTestContext.driver.manage().window().maximize();
        loginpage.login();
    }

    @Given("^enter the username '(.*)' and '(.*)'")
    public void enter_the_username_brandon_atsspec_co_and_B_ck_fU(String user2, String pass2) throws Throwable {
        loginpage.username(user2);
        loginpage.password(pass2);
    }

    @Given("^hit on login button$")
    public void hit_on_login_button() throws Throwable {
        loginpage.loginbutton();
    }

    @Given("^go to spec site$")
    public void go_to_spec_site() throws Throwable {
        projectcreation.solution();
        speccreation.buildonOwn();
    }

    @When("^user clicks on Create New Project$")
    public void user_clicks_on_Create_New_Project() throws Throwable {
        speccreation.clickonCreateNewproject();
    }

    @When("^insert the internal No '(.*)'")
    public void insert_the_internal_No(String interno) throws Throwable {
        speccreation.internalNo(interno);
    }

    @When("^insert the spec name '(.*)'")
    public void insert_the_spec_name_QA_Test(String specname) throws Throwable {
        speccreation.specName(specname);
    }

    @When("^insert the building class '(.*)'")
    public void insert_the_building_class_Commercial(String bldclass) throws Throwable {
        speccreation.buildClass(bldclass);
    }

    @When("^insert the building type '(.*)'")
    public void insert_the_building_type_Bar_and_Restaurant(String bldtype) throws Throwable {
        speccreation.builType(bldtype);
    }

    @When("^insert the State '(.*)'")
    public void insert_the_State_California(String stt) throws Throwable {
        speccreation.state(stt);
    }

    @When("^insert the City '(.*)'")
    public void insert_the_City_Aptos(String cit) throws Throwable {
        speccreation.city(cit);
    }

    @When("^insert the Address '(.*)'")
    public void insert_the_Address_Test(String add1) throws Throwable {
        speccreation.add(add1);
    }

    @When("^insert the square footage '(.*)'")
    public void insert_the_square_footage(String sqft) throws Throwable {
        speccreation.squareFt(sqft);
    }

    @When("^insert your name '(.*)'")
    public void insert_your_name_(String urname) throws Throwable {
        speccreation.urname(urname);
    }

    @When("^click on Create$")
    public void click_on_Create() throws Throwable {
        speccreation.create();
    }

//    @Then("^verify the created spec$")
//    public void verify_the_created_spec() throws Throwable {
//        speccreation.specLoad();
//    }

    @When("^add a room '(.*)'")
    public void add_a_room(String rm) throws Throwable {
        speccreation.addRoom(rm);
    }

    @When("^add a product category '(.*)'")
    public void add_a_product_category(String product) throws Throwable {
        speccreation.addProductcategory(product);
    }

    @When("^add product Type '(.*)'")
    public void add_any_product(String productType) throws Throwable {
        speccreation.addProductType(productType);
    }

    @When("^add product '(.*)'")
    public void save_the_drawing(String product) throws Throwable {
        speccreation.addProduct(product);
    }

    @When("save the drawing$")
    public void save_the_drawing() {
        speccreation.savespec();
        speccreation.saveAndContinue();
    }

    @Then("^verify the created spec$")
    public void verify_the_created_spec() throws Throwable {
        speccreation.specLoad();
    }
}

