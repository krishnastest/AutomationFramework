package Response;

public class CreateUserResponse
{
    private String name;

    private String job;

    private String id;

    private String createdAt;

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
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }
    public String getCreatedAt(){
        return this.createdAt;
    }

    @Override
    public String toString() {
        return "CreateUserResponse{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
