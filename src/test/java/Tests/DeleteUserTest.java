package Tests;

import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeleteUserTest {

    @Test
    public void deleteUser(){
        APIEndpoints apiEndpoints = new APIEndpoints();
        RestAssured.baseURI = apiEndpoints.getBaseURL();

        RequestSpecification request = RestAssured.given();
        Response response = request.delete(apiEndpoints.getDeleteUsers());
        System.out.println(response.statusCode());
    }
}
