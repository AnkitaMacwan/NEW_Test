package ca.test.steps;

import ca.test.pages.AccountCreationForm;
import ca.test.pages.LoginPage;
import ca.test.pages.ProjectCreationForm;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountCreation {
    AccountCreationForm accountcreation = new AccountCreationForm(KnowsTestContext.driver);
    LoginPage login = new LoginPage(KnowsTestContext.driver);
    ProjectCreationForm projectcreationform = new ProjectCreationForm(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();


    @When("^create a firm$")
    public void create_a_firm() throws Throwable {
        projectcreationform.solution();
        projectcreationform.startTracking();
        accountcreation.Accounts();
        accountcreation.AddNewAcount();
    }

    @When("^enter the companyname '(.*)'")
    public void enter_the_Test_firm(String company) throws Throwable {
        accountcreation.AddCompanyName(company);
    }

    @When("^enter the companytype '(.*)'")
    public void enter_the_Architect(String companytype) throws Throwable {
        accountcreation.SelectCompanyType(companytype);
    }

    @When("^enter the address '(.*)'")
    public void enter_the_ATS(String address) throws Throwable {
        accountcreation.Address(address);
    }

    @When("^enter the country1 '(.*)'")
    public void enter_the_Canada(String country) throws Throwable {
        accountcreation.Country(country);
    }

    @When("^enter the province1 '(.*)'")
    public void enter_the_Ontario(String province) throws Throwable {
        accountcreation.Province(province);
    }

    @When("^enter the city1 '(.*)'")
    public void enter_the_Toronto(String city) throws Throwable {
        accountcreation.City(city);
    }

    @When("^enter the zipcode '(.*)'")
    public void enter_the_M_v_g(String postalcode) throws Throwable {
        accountcreation.PostalCode(postalcode);
    }

    @When("^enter the email '(.*)'")
    public void enter_the_ankita_atssec_com(String email) throws Throwable {
        accountcreation.ContactEmail(email);
    }

    @When("^enter the officephone '(.*)'")
    public void enter_the_officephone(String phone) throws Throwable {
        accountcreation.OfficePhone(phone);
    }

    @When("^enter the fax '(.*)'")
    public void enter_the_fax(String fax) throws Throwable {
        accountcreation.Fax(fax);
    }

    @When("^save the firm$")
    public void save_the_firm() throws Throwable {
        accountcreation.SaveFirm();
    }

    @When("^enter the firstname '(.*)'")
    public void enter_the_AnkitaTest(String firstname) throws Throwable {
        accountcreation.FirstName(firstname);
    }

    @When("^enter the lastname '(.*)'")
    public void enter_the_Macwan(String lastname) throws Throwable {
        accountcreation.LastName(lastname);
    }

    @When("^enter the jobtitle '(.*)'")
    public void enter_the_ankita_ats_co(String jobtitle) throws Throwable {
        accountcreation.JobTitle(jobtitle);
    }

    @When("^enter the emailuser '(.*)'")
    public void enter_the_emailuser(String useremail) throws Throwable {
        accountcreation.userEmail(useremail);
    }

    @When("^enter the directline '(.*)'")
    public void enter_the_directline(String directline) throws Throwable {
        accountcreation.DirectLine(directline);
    }

    @When("^enter the extension '(.*)'")
    public void extension(String extension) throws Throwable {
        accountcreation.Extension(extension);
    }

    @When("^enter the mobile '(.*)'")
    public void mobile(String mobile) throws Throwable {
        accountcreation.Mobile(mobile);
    }

    @When("^select the ecommunications$")
    public void select_the_ecommunications() throws Throwable {
        accountcreation.Ecommunications();
    }

    @When("^enter a note '(.*)'")
    public void enter_a_note(String note) throws Throwable {
        accountcreation.Note(note);
    }

    @When("^enter username1 '(.*)'")
    public void enter_username_aamacwan(String username1) throws Throwable {
        accountcreation.Username1(username1);
    }

    @When("^enter password1 '(.*)'")
    public void enter_password_Ats(String password) throws Throwable {
        accountcreation.Password1(password);
    }

    @Then("^save the user$")
    public void save_the_user() throws Throwable {
        accountcreation.SaveUser();
    }

}
