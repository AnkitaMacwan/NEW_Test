package ca.test.steps;

import ca.test.pages.AccountCreationForm;
import ca.test.pages.LoginPage;
import ca.test.pages.ProjectCreationForm;
import ca.test.pages.QuoteCreationform;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuoteCreation {

    QuoteCreationform quotecreationform = new QuoteCreationform(KnowsTestContext.driver);
    AccountCreationForm accountCreationForm = new AccountCreationForm(KnowsTestContext.driver);
    LoginPage login = new LoginPage(KnowsTestContext.driver);
    ProjectCreationForm projectcreationform = new ProjectCreationForm(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();

    @Given("^login as user '(.*)'")
    public void login_as_other_usres_account_Linda_Fogazzi(String user) throws Throwable {
        projectcreationform.solution();
        projectcreationform.startTracking();
        quotecreationform.loginAs(user);
    }

    @Given("^login to project tracker '(.*)'")
    public void login_to_projecttracker(String site) throws Throwable {
        quotecreationform.site(site);
    }

    @Given("^click on direct login$")
    public void click_on_login() throws InterruptedException {
        quotecreationform.directlogin();
    }

    @When("^create a quote$")
    public void create_a_quote() throws Throwable {
        quotecreationform.quote();
        quotecreationform.addQuote();
    }

    @When("^enter a job name '(.*)'")
    public void enter_a_job_name_AM_test(String jobname) throws Throwable {
        quotecreationform.addJobName(jobname);
    }

    @When("^select a job country '(.*)'")
    public void select_a_job_country_Canada(String country) throws Throwable {
        quotecreationform.jobCountry(country);
    }

    @When("^select a job province '(.*)'")
    public void select_a_job_province_Ontario(String province) throws Throwable {
        quotecreationform.jobProvince(province);
    }

    @When("^select a job city '(.*)'")
    public void select_a_job_city_Toronto(String city) throws Throwable {
        quotecreationform.jobCity(city);
    }

    @When("^enter a job address '(.*)'")
    public void select_a_job_address_test(String address) throws Throwable {
        quotecreationform.jobAddress(address);
    }

    @When("^select job type '(.*)'")
    public void select_job_type_Commercial_Bar_and_Restaurant(String jobtype) throws Throwable {
        quotecreationform.jobType(jobtype);
    }

    @When("^select outside sales rep '(.*)'")
    public void select_outside_sales_rep_Avery_White(String rep) throws Throwable {
        quotecreationform.outsideSalesRep(rep);
    }

    @When("^add a customer '(.*)'")
    public void add_a_customer_Design_Fabrication_Management_Inc(String customer) throws Throwable {
        quotecreationform.customer(customer);
    }

    @When("^enter engineer '(.*)'")
    public void select_engineer_John_A_Wells(String eng) throws Throwable {
        quotecreationform.engineer(eng);
    }

    @When("^enter architect '(.*)'")
    public void select_architect_David_Johnston(String arch) throws Throwable {
        quotecreationform.architect(arch);
    }

    @When("^enter the section title '(.*)'")
    public void enter_the_section_title_test(String title) throws Throwable {
        quotecreationform.sectionTitle(title);
    }

    @When("^enter the product number '(.*)'")
    public void enter_the_product_number_Trespa_Athlon_Unicolor_Color_To_Be_Determined(String productnu) throws Throwable {
        quotecreationform.productNumber(productnu);
    }

    @When("^click on the new section '(.*)'")
    public void click_on_the_new_section(String section) throws Throwable {
        quotecreationform.addSection(section);
    }

    @When("^click on alternative button$")
    public void click_on_alternative_button() throws Throwable {
        quotecreationform.alternativeSection();
    }

    @When("^click on duplicate section$")
    public void click_on_duplicate_section() throws Throwable {
        quotecreationform.duplicateSection();
    }

    @When("^click on showhide section$")
    public void click_on_showhide_section() throws Throwable {
        quotecreationform.showhidesection();
    }

    @When("^click on delete$")
    public void click_on_delete() throws Throwable {
        quotecreationform.delete();
    }

    @When("^Add section comment '(.*)'")
    public void add_section_comment_sectioncomment(String title1) throws Throwable {
        quotecreationform.sectionTitle(title1);
    }

    @When("^insert the special terms '(.*)'")
    public void insert_the_special_terms_Test(String terms) throws Throwable {
        quotecreationform.specialTerms(terms);
    }

    @Then("^click on save$")
    public void click_on_save() throws Throwable {
        quotecreationform.save();
        quotecreationform.quoteLoad();
    }

}
