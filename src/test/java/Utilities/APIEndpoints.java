package Utilities;

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
    String loginUser = "/api/login";

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
}
