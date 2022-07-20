package Tests;

import Response.GetUserListResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetUserListTest {

    @Test
    public void getUserList(){
        APIEndpoints apiEndpoints = new APIEndpoints();
        RestAssured.baseURI = apiEndpoints.getBaseURL();

        GetUserListResponse response = RestAssured.given()
                .get(apiEndpoints.getListUsers())
                .getBody().as(GetUserListResponse.class);

        System.out.println(response.toString());
    }
}
