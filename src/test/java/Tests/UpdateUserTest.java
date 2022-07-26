package Tests;

import Requests.CreateUserRequest;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import Response.UpdateUserResponse;

public class UpdateUserTest {

    @Test
    public void updateUser(){
        CreateUserRequest updateUser = new CreateUserRequest("Nikhil", "Zion Resident");

        APIEndpoints apiEndpoints = new APIEndpoints();
        RestAssured.baseURI = apiEndpoints.getBaseURL();

        UpdateUserResponse response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(updateUser)
                .put(apiEndpoints.getUpdateUsers())
                .getBody().as(UpdateUserResponse.class);

        System.out.println(response.toString());

    }
}
