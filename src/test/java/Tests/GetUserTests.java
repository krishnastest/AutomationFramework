package Tests;

import Response.GetUserResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserTests {

    @BeforeTest
    public void setup(){
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void getSingleUser() {
        APIEndpoints apiEndpoints = new APIEndpoints();

        RequestSpecification request = RestAssured.given();

        var response = request.get(apiEndpoints.getUsers());

        // Deserializing the Response body into Books class
        GetUserResponse getUser = response.getBody().as(GetUserResponse.class);
        System.out.println(getUser.toString());
    }




}
