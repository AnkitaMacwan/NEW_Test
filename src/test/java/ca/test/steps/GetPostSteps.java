package ca.test.steps;

import com.jayway.restassured.RestAssured;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPostSteps {
    public static String response;


    @When("^Get the status of auth service '(.*)' and '(.*)' and '(.*)'")
    public static void i_perform_the_GET_request_http_staging_atsspec_local_dashboard_v_status_and(String url, String endpoint, String code) throws Throwable {
        given().when().get(url + endpoint).then().statusCode(Integer.parseInt(code));

    }

    @When("^login to users account '(.*)' and '(.*)' and '(.*)' and '(.*)'")
    public static void login_to_users_account_username_and_passord(String url, String username1, String password1, String endpoint) throws Throwable {
        RestAssured.baseURI = url;
        response = given().urlEncodingEnabled(true).param("username", username1).param("password", password1).post(endpoint).then().extract().path("payload.auth.token").toString();

    }

    @When("^Get the status of spec service '(.*)' and '(.*)' and '(.*)' and '(.*)'")
    public void get_the_status_of_spec_service_http_staging_atsspec_local_spec_v_and_status_and(String url, String endpoint, String appid, String code) throws Throwable {
        RestAssured.baseURI = url;
        given().urlEncodingEnabled(true).header("x-ATS-TOKEN", response).header("X-ATS-APP-ID", appid).then().statusCode(Integer.parseInt(code));
    }

    @When("^Insert the specname '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)'")
    public void insert_the_specname_http_staging_atsspec_local_spec_v_and_spec_and_test_and(String url, String endpoint, String appid, String specname, String statuscode) throws Throwable {
        RestAssured.baseURI = url;
        given().urlEncodingEnabled(true).header("x-ATS-TOKEN", response).header("X-ATS-APP-ID", appid).contentType("multipart/form-data").multiPart("name", specname).
                post(endpoint).then().statusCode(Integer.parseInt(statuscode));
    }


    @When("^Insert the '(.*)' and endpoint '(.*)' and '(.*)' and '(.*)' search by specname '(.*)'")
    public void insert_the_http_staging_atsspec_local_spec_v_and_endpoint_specs_and_search_by_specname_test(String url, String endpoint, String appid, String contenttype, String spec) throws Throwable {
        given().header("x-ATS-TOKEN", response).header("X-ATS-APP-ID", appid).when().get(url + endpoint).then().assertThat().body("payload.spec.specs.name", equalTo(spec));
        // body("payload.spec.specs.name", equalTo(specname));
    }

}
// }

// given().when().get("http://staging.atsspec.local/dashboard2/v2/status").then().body(containsString("up"));

// given().when().get("http://staging.atsspec.local/auth2/v2/status").then().body("payload.auth.status", equalTo("down"));
// RestAssured.baseURI = "http://staging.atsspec.local/auth2/v2";
//given().urlEncodingEnabled(true).param("username", "peter@atsspec.co").param("password", "Ats123456")
// .post("/login").then().statusCode(200);








