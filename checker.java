import java.util.Scanner;

public class checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter anything: ");
        String input = sc.nextLine();

        // Only digits
        if (input.matches("\\d+")) {
            System.out.println("You entered Digits: " + input);
        }
        // Only uppercase letters
        else if (input.matches("[A-Z]+")) {
            System.out.println("You entered an Uppercase String: " + input);
        }
        // Only lowercase letters
        else if (input.matches("[a-z]+")) {
            System.out.println("You entered a Lowercase String: " + input);
        }
        // Only special characters
        else if (input.matches("[^a-zA-Z0-9]+")) {
            System.out.println("You entered Special Characters: " + input);
        }
        // Mixed input
        else {
            System.out.println("You entered Mixed values: " + input);
        }

        sc.close();
    }
}
