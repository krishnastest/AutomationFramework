package Requests;

public class CreateUserRequest
{
    private String name;

    private String job;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return this.job;
    }

    public CreateUserRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
