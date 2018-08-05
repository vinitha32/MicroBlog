package MicroBlog2;

public class Posts {
    String username;
    int ordernumber;
    String webaddress;
    String post;


    public Posts(String username, int ordernumber,String webaddress, String post) {
        this.username = username;
        this.ordernumber=ordernumber;
        this.webaddress = webaddress;
        this.post = post;

    }


    public String getPosts() {
        return post;


    }
public String getWebaddress()
{
    return webaddress;
}


    public String getUsername() {
        return username;
    }
        public int getOrdernumber()
    {
        return ordernumber;
    }}

