package Tests;

import Requests.LoginUserRequest;
import Response.LoginResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class LoginUserTest {

    @Test
    public void loginUser(){

        LoginUserRequest newUser = new LoginUserRequest("eve.holt@reqres.in", "cityslicka");

        APIEndpoints apiEndpoints = new APIEndpoints();
        RestAssured.baseURI = apiEndpoints.getBaseURL();

        var response = RestAssured.given()
                .header("Content-Type","application/json")
                .body(newUser)
                .post(apiEndpoints.getLoginUser())
                .getBody().as(LoginResponse.class);

        System.out.println(response.toString());
    }
}
