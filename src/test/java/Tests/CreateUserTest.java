package Tests;

import Requests.CreateUserRequest;
import Response.CreateUserResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class CreateUserTest {

    @Test
    public void createUser(){
        CreateUserRequest newUser = new CreateUserRequest("Nikhil", "SDET 1");

        APIEndpoints apiEndpoints = new APIEndpoints();
        RestAssured.baseURI = apiEndpoints.getBaseURL();

        CreateUserResponse response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(newUser)
                .post(apiEndpoints.getCreateUsers())
                .getBody().as(CreateUserResponse.class);

        System.out.println(response.toString());
    }


}
