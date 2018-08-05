package MicroBlog2;



public class User {

    String firstname;
    String lastname;
    String url;
    String email;
    String username;

    public User(String username, String firstname, String lastname, String url, String email)

    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.url = url;
        this.email = email;
        this.username = username;



    }

    public String getUser() {
        return " FirstName "+firstname +" Last Name "+ lastname +" URL "+ url +" Email "+ email;
    }




    public String getUsername() {
        return username;
    }

}



