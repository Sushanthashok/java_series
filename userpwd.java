import java.io.*;

public class userpwd {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String username = "";
        String pwd = "";

        try {
            System.out.println("Enter Username : ");
            username = br.readLine();

            System.out.println("Enter Password : ");
            pwd = br.readLine();

            if (username.equals("admin") && pwd.equals("1234")) {
                System.out.println("Login Successfully");
            } else {
                System.out.println("Invalid Username or Password");
            }

        } catch (Exception e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}

