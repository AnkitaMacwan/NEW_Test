package ca.test.steps;

import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;

public class GetPostSteps {
    @When("^Get the status of auth service '(.*)' and '(.*)' and '(.*)'")
    public void i_perform_the_GET_request_http_staging_atsspec_local_dashboard_v_status_and(String url, String endpoint, String code) throws Throwable {
        given().when().get(url + endpoint).then().statusCode(Integer.parseInt(code));

    }

    // given().when().get("http://staging.atsspec.local/dashboard2/v2/status").then().body(containsString("up"));

    // given().when().get("http://staging.atsspec.local/auth2/v2/status").then().body("payload.auth.status", equalTo("down"));
    // RestAssured.baseURI = "http://staging.atsspec.local/auth2/v2";
    //given().urlEncodingEnabled(true).param("username", "peter@atsspec.co").param("password", "Ats123456")
    // .post("/login").then().statusCode(200);

}




