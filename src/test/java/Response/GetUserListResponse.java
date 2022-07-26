package Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;

public class GetUserListResponse
{
    private int page;

    private int per_page;

    private int total;

    private int total_pages;

    private List<Data> data;

    private Support support;

    public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setPer_page(int per_page){
        this.per_page = per_page;
    }
    public int getPer_page(){
        return this.per_page;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setTotal_pages(int total_pages){
        this.total_pages = total_pages;
    }
    public int getTotal_pages(){
        return this.total_pages;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
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
        return "GetUserListResponse{ \n" +
                "page=" + page + "\n" +
                ", per_page=" + per_page + "\n" +
                ", total=" + total + "\n" +
                ", total_pages=" + total_pages + "\n" +
                ", data=" + data + "\n" +
                ", support=" + support +
                '}';
    }
}



