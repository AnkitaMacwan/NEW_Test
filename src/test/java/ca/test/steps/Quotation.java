package ca.test.steps;

import ca.test.pages.QuotationStatusChange;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Quotation {

    QuotationStatusChange quote = new QuotationStatusChange(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();


    @Given("^Login to users account$")
    public void login_to_users_account() throws Throwable {
       quote.quotaion() ;
    }

    @When("^User navigate to quotation list page$")
    public void user_navigate_to_quotation_list_page() throws Throwable {
        ;
    }

    @When("^click on quote ids$")
    public void click_on_quote_ids() throws Throwable {
        ;
    }

    @Then("^Change quote status from inprogress to quoted$")
    public void change_quote_status_from_inprogress_to_quoted() throws Throwable {
      ;
    }

}
