package Requests;

public class CreateUserRequest
{
    private String name;

    private String job;

    public String getName(){
        return this.name;
    }
    public String getJob(){
        return this.job;
    }

    public CreateUserRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
