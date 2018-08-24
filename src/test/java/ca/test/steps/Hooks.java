package ca.test.steps;

import ca.test.utils.CommonUtils;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    CommonUtils utils = new CommonUtils();
    ConfigReader reader = new ConfigReader();

    @Before

    public void statup() throws IOException {
        KnowsTestContext.driver = utils.getDriver(reader.properties().getProperty("browser"));
    }

    @After
    public void tearDown() {
        KnowsTestContext.driver.close();

    }

}
