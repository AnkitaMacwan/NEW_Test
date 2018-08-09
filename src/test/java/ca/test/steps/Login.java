package ca.test.steps;

import ca.test.pages.LoginPage;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {

    LoginPage login = new LoginPage(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        KnowsTestContext.driver.get(reader.properties().getProperty("url"));
        KnowsTestContext.driver.manage().window().maximize();
        login.login();

    }

    @When("^User enters '(.*)' and '(.*)'")
    public void user_enters_UserName_and_Password(String username , String password) throws Throwable {
       login.username(username);
       login.password(password);

    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        login.loginbutton();

    }


}
