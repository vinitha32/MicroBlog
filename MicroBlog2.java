package MicroBlog2;


import java.util.Scanner;
import java.util.ArrayList;


public class MicroBlog2 {


    public void display_menu () {

        System.out.println("Main Menu");
        System.out.println("1) Create a new user");
        System.out.println("2) Become an existing user");
        System.out.println("3) Create a post as the current user");
        System.out.println("4) Print all posts");
        System.out.println("5) Print all users");
        System.out.println("6) Exit menu");
    }

    public  MicroBlog2() {
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Posts> contents = new ArrayList<Posts>();

            String user="pug" ;

        while (true) {

            display_menu();
            Scanner in = new Scanner(System.in);
            System.out.println("You are currently user " +user+" What would you like to do?");
            switch (in.nextInt()) {

                case 1:

                    System.out.println("#####Create a new user#######");
                    System.out.println("What is your username?");
                    in.nextLine();
                    String userName = in.nextLine();
                    System.out.println("What is your Firstname?");
                    String firstName = in.nextLine();
                    System.out.println("What is your Lastname?");
                    String lastName = in.nextLine();
                    System.out.println("What is your url to the avatar picture");
                    String url = in.nextLine();
                    System.out.println("What is your email?");
                    String email = in.nextLine();
                    users.add(new User(userName, firstName, lastName, url, email));
                    for(int i=0;i<users.size();i++)
                    user=users.get(i).getUsername();

                    break;

                case 2:

                    System.out.println("#####Become an existing user######");
                   if(users.size() == 0)
                    {
                        System.out.println("No existing users currently");
                      //display_menu();
                    }

else{
                    System.out.println("The existing users are shown below.Which user name you want to pick?");


                    for (int j = 0; j < users.size(); j++) {
                        System.out.println((users.get(j).getUsername() + " "));
                    }

                    in.nextLine();
                    user = in.nextLine();


                    boolean status = false;
                    for (int i = 0; i < users.size(); i++) {
                        if (user.equals(users.get(i).getUsername())) {

                            System.out.println("The user is now " + user);

                            status = true;

                        }
                    }

                    if (!status)
                    {
                        System.out.println(user + "  is not a valid user");
                        user = "pug";
                    }}

                    break;

                case 3:

                    System.out.println("#####Creating post as existing user######");
                    if(users.size()==0)
                   {
                       System.out.println("No post found");
                    }
                    else{

                        System.out.println("Last post by user "+user);
                        String userPost = "Post not found";
                        for (int i = 0; i < contents.size(); i++) {
                            if (contents.get(i).getUsername().equals(user)) {
                                userPost = contents.get(i).getPosts();
                            }
                        }
                        System.out.println(userPost);

                        System.out.println("What is the OrderNumber ");
                        int ordernumber = in.nextInt();
                        System.out.println("What is your webaddress");
                        in.nextLine();
                        String webaddress = in.nextLine();
                        System.out.println("Type the new post ");
                        String post = in.nextLine();
                        contents.add(new Posts(user, ordernumber, webaddress, post));}

                    break;

                case 4:
                    System.out.println("######Print all posts######");
                    for (int j = 0; j < contents.size(); j++) {
                        System.out.println(" UserName " +contents.get(j).getUsername()+" OrderNumber "+contents.get(j).getOrdernumber()+" Web address "+contents.get(j).getWebaddress()+"  Posts  " +contents.get(j).getPosts()+"\n");
                    }
                    break;

                case 5:

                    System.out.println("#####Print all users#####");



                    for (int i = 0; i < users.size(); i++) {
                        System.out.println("\n"+"UserName " + users.get(i).getUsername()+" "+users.get(i).getUser());

                    }
                    System.out.println(" ");

                    break;
                default:
                    System.err.println("Unrecognized option");
                    break;
                case 6:
                {
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String args[]) {

        while (true)
        {

            new MicroBlog2();


        }

    }
}
