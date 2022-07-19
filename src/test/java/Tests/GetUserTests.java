package Tests;


import Response.GetUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetUserTests {

    public static void main(String[] args) throws IOException, InterruptedException {
        getUser();
    }

    public static void getUser() throws IOException {
        // Create a neat value object to hold the URL
        URL url = new URL("https://reqres.in/api/users/2");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        InputStream responseStream = connection.getInputStream();

        ObjectMapper mapper = new ObjectMapper();
        GetUserResponse response = mapper.readValue(responseStream, GetUserResponse.class);

        System.out.println(response);

    }

}
