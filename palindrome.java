import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        String reverse = "";
        for(int i=num.length()-1;i>=0;i--){
            reverse=reverse+num.charAt(i);
        }
        if (num.equals(reverse))
            System.out.println("It is a Palindrome");

        else
            System.out.println("It is not a Palindrome");
    }
}
