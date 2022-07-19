package Tests;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetUserTests {

    @BeforeTest
    public void setup(){
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void shouldGetUsers() {
        //1. Act
        //2. Arrange
        //3. Assert

        assertApiResponse(given()
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200));


    }

    private ValidatableResponse assertApiResponse(ValidatableResponse body) {
        return body
                .body("data.id", Matchers.equalTo(2));

    }


}
