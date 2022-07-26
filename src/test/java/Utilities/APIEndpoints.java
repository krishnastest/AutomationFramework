package Utilities;

import Requests.CreateUserRequest;
import Requests.LoginUserRequest;
import io.restassured.RestAssured;
import Response.LoginResponse;

public class APIEndpoints {

    //This file will contain the APIs for usage.

    String BaseURL = "https://reqres.in/";
    String listUsers = "/api/users?page=2";
    String users = "/api/users/2";
    String singleResource = "/api/unknown/2";
    String createUsers = "/api/users";
    String updateUsers = "/api/users/2";
    String deleteUsers = "/api/users/2";
    String registerUser = "/api/register";
    private static String loginUser = "/api/login";

    public String getBaseURL() {
        return BaseURL;
    }

    public String getListUsers() {
        return listUsers;
    }

    public String getUsers() {
        return users;
    }

    public String getSingleResource() {
        return singleResource;
    }

    public String getCreateUsers() {
        return createUsers;
    }

    public String getUpdateUsers() {
        return updateUsers;
    }

    public String getDeleteUsers() {
        return deleteUsers;
    }

    public String getRegisterUser() {
        return registerUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    private static final String BASE_URL = "https://reqres.in/";

    public static LoginResponse Login(LoginUserRequest newUser) {
        RestAssured.baseURI = BASE_URL;

        var response = RestAssured.given()
                .header("Content-Type","application/json")
                .body(newUser)
                .post(loginUser)
                .getBody().as(LoginResponse.class);
        return response;
    }
}
