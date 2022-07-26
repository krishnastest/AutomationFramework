package Tests;

import Requests.LoginUserRequest;
import Response.LoginResponse;
import Utilities.APIEndpoints;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserTest {

    @Test
    public void loginUser(){

        LoginUserRequest newUser = new LoginUserRequest("eve.holt@reqres.in", "cityslicka");

        APIEndpoints apiEndpoints = new APIEndpoints();
        LoginResponse loginResponse = apiEndpoints.Login(newUser);

        Assert.assertEquals(loginResponse.getToken(), "QpwL5tke4Pnpja7X4");
        System.out.println(loginResponse.getToken());

    }
}
