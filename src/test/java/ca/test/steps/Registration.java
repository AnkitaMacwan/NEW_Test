package ca.test.steps;

import ca.test.pages.RegistrationForm;
import ca.test.utils.ConfigReader;
import ca.test.utils.JdbcConnection;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {

    RegistrationForm register = new RegistrationForm(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();
    JdbcConnection jdbc = new JdbcConnection();


    @Given("^User is on ATS Home Page$")
    public void user_is_on_ATS_home_page() throws Throwable {
        KnowsTestContext.driver.get(reader.properties().getProperty("url"));
        KnowsTestContext.driver.manage().window().maximize();

    }

    @Given("^User is going to Registration Page$")
    public void user_is_going_to_registration_page() throws Throwable {
        register.signUp();
    }

    @When("^User enters firstname '(.*)' and lastname '(.*)'")
    public void user_enters_firstname_firstname_and_lastname_lastname(String firstname, String lastname) throws Throwable {
        register.firstName(firstname);
        register.lastName(lastname);

    }


    @When("^User enters username '(.*)'")
    public void user_enters_username(String username) throws Throwable {
        register.userName(username);
    }

    @When("^User enters phonenumber '(.*)'")
    public void user_enters_phonenumber(String phonenumber) throws Throwable {
        register.phoneNumber(phonenumber);
    }

    @When("^User enters emailaddress '(.*)'")
    public void user_enters_emailaddreess(String email) throws Throwable {
        register.emailAdress(email);
    }

    @When("^User enters companyname '(.*)'")
    public void user_enters_companyname(String companyname) throws Throwable {
        register.companyName(companyname);
    }

    @When("^User enters compnaytype '(.*)'")
    public void user_enters_compnaytype(String company) throws Throwable {
        register.companyType(company);
    }

    @When("^User enters address '(.*)'")
    public void user_enters_Address(String address) throws Throwable {
        register.address(address);
    }

    @When("^User enters country '(.*)'")
    public void user_enters_country(String country) throws Throwable {
        register.country(country);
    }

    @When("^User enters province '(.*)'")
    public void user_enters_province(String province) throws Throwable {
        register.province(province);
    }

    @When("^User enters city '(.*)'")
    public void user_enters_location(String city) throws Throwable {
        register.city(city);
    }

    @When("^User enters postalcode '(.*)'")
    public void user_enters_postalcode(String postalcode) throws Throwable {
        register.postalCode(postalcode);
    }

    @When("^User enters reference '(.*)'")
    public void user_enters_reference(String reference) throws Throwable {
        register.reference(reference);
    }

    @When("^User enables ecommunications$")
    public void user_enters_terms() throws Throwable {
        register.eCommunications();
    }


    @When("^User enables terms$")
    public void User_enables_terms() throws Throwable {
        register.termsAndCondition();
    }

    @When("^Click on submit$")
    public void click_on_submit_button() throws Throwable {
        register.submit();

    }


    @Then("^User receives success message$")
    public void user_receives_success_message() throws Throwable {
        register.successMessage();

    }

    @Then("^Compare new user with sql database '(.*)'")
    public void Compare_new_user_with_sql_database(String user) throws Throwable {
        jdbc.jdbcdemo(user);

    }
}
