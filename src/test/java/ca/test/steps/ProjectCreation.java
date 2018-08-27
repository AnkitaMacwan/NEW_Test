package ca.test.steps;

import ca.test.pages.LoginPage;
import ca.test.pages.ProjectCreationForm;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectCreation {


    ProjectCreationForm project = new ProjectCreationForm(KnowsTestContext.driver);
    LoginPage login = new LoginPage(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();

    @Given("^User is on ATS login page$")
    public void user_is_on_Project_Tracker_board() throws Throwable {
        KnowsTestContext.driver.get(reader.properties().getProperty("url"));
        KnowsTestContext.driver.manage().window().maximize();
        login.login();


    }

    @Given("^Login to his account with username '(.*)'")
    public void login_to_his_account_with_username_username(String user1) throws Throwable {
        login.username(user1);
    }

    @Given("^password '(.*)'")
    public void password_password(String pass1) throws Throwable {
        login.password(pass1);
    }

    @Given("^click on Login$")
    public void click_on_Login() throws Throwable {
        login.loginbutton();
    }


    @When("^Create a Project$")
    public void create_a_Project() throws Throwable {
        //Thread.sleep(9000);
        project.solution();
        project.startTracking();
        project.projects();
        project.projectList();
        project.createProject();


    }

    @When("^Enter the project name '(.*)'")
    public void enter_the_project_name_Test_Project(String proj) throws Throwable {
        project.projectName(proj);
    }

    @When("^Enter the LeadSourceType '(.*)'")
    public void enter_the_LeadSourceType_Dodge(String type) throws Throwable {
        project.leadSource(type);
    }

    @When("^Enter the LeadSourceNumber '(.*)'")
    public void enter_the_LeadSourceNumber(String numb) throws Throwable {
        project.lead(numb);
    }

    @When("^Enter the Date of Bid '(.*)'")
    public void enter_the_Date_of_Bid(String biddate) throws Throwable {
        project.dateofBid(biddate);
    }

    @When("^Enter the Address '(.*)'")
    public void enter_the_Address_Test(String addr) throws Throwable {
        project.setaddress(addr);
    }

    @When("^Enter the Country '(.*)'")
    public void enter_the_Country_Canada(String count) throws Throwable {
        project.setCountry(count);
    }

    @When("^Enter the Province '(.*)'")
    public void enter_the_Province_Ontario(String provn) throws Throwable {
        project.setProvince(provn);
    }

    @When("^Enter the City '(.*)'")
    public void enter_the_City_Toronto(String cit) throws Throwable {
        project.setcity(cit);
    }

    @When("^Enter the BuildingClass '(.*)'")
    public void enter_the_BuildingClass_Commercial(String bclass) throws Throwable {
        project.buildingClass(bclass);
    }

    @When("^Enter the BuildingType '(.*)'")
    public void enter_the_BuildingType_Bar_and_Restaurant(String type) throws Throwable {
        project.buldingType(type);

    }

    @When("^Enter the SquareFootage '(.*)'")
    public void enter_the_SquareFootage(String sqrft) throws Throwable {
        project.squareFootage(sqrft);
    }

    @When("^Enter the ProjectValuation '(.*)'")
    public void enter_the_ProjectValuation(String prjval) throws Throwable {
        project.projectvaluation(prjval);
    }

    @When("^Enter the ProjectPhase '(.*)'")
    public void enter_the_ProjectPhase_Pre_design(String pp) throws Throwable {
        project.projectPhase(pp);
    }

    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        project.cliclSubmit();
    }

    @Then("^See the Project detail page$")
    public void see_the_Project_detail_page() throws Throwable {
        project.projectDetail();
    }


}
