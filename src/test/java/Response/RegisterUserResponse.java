package Response;


public class RegisterUserResponse
{
    private int id;

    private String token;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return this.token;
    }

    @Override
    public String toString() {
        return "RegisterUserResponse{" +
                "id=" + id +
                ", token='" + token + '\'' +
                '}';
    }
}
