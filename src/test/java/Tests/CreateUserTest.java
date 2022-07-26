package Tests;

import Requests.CreateUserRequest;
import Response.CreateUserResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import org.testng.Assert;
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
                .when()
                .post(apiEndpoints.getCreateUsers())
                .getBody().as(CreateUserResponse.class);
        Assert.assertEquals(response.getName(), "Nikhil");
        Assert.assertEquals(response.getJob(), "SDET 1");

        System.out.println(response.toString());
    }


}
