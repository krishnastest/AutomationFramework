package Tests;

import Requests.CreateUpdateUserRequest;
import Response.CreateUserResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class CreateUserTest {

    @Test
    public void createUser(){
        CreateUpdateUserRequest newUser = new CreateUpdateUserRequest("Nikhil", "SDET 1");

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
