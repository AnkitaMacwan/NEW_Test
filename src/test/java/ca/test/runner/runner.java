package ca.test.runner;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/Login.feature",
        glue = "ca.test.steps",
        format = {"pretty", "html:Reports"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}

)

public class runner {
    @BeforeClass
    public static void setUp() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setProjectName(Runner.class.getName());
    }

    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("64 bit", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}


