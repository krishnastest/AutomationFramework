package Tests;

import Requests.RegisterUserRequest;
import Response.RegisterUserResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RegisterUserTest {

    @Test
    public void registerUser(){

        APIEndpoints apiEndpoints = new APIEndpoints();
        RestAssured.baseURI = apiEndpoints.getBaseURL();

        RegisterUserRequest registerUser = new RegisterUserRequest
                ("eve.holt@reqres.in", "yehbhichalega1");

        RegisterUserResponse response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(registerUser)
                .post(apiEndpoints.getRegisterUser())
                .getBody().as(RegisterUserResponse.class);

        System.out.println(response.toString());
    }
}
