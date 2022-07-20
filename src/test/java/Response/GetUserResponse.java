package Response;


import java.util.HashMap;
import java.util.Map;

public class GetUserResponse {
    private Data data;

    private Support support;

    public void setData(Data data){
        this.data = data;
    }
    public Data getData(){
        return this.data;
    }
    public void setSupport(Support support){
        this.support = support;
    }
    public Support getSupport(){
        return this.support;
    }

    @Override
    public String toString() {
        return "GetUserResponse{ \n" +
                "data=" + data + "\n" +
                ", support=" + support +
                '}';
    }
}


