package Response;

import java.util.HashMap;
import java.util.Map;
public class LoginResponse {
    private String token;

    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return this.token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}
