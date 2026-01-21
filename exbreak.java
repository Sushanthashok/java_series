import java.util.Scanner;

public class exbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Mark:");
        int mark = sc.nextInt();

        if (mark > 80) {
            System.out.println("MACBOOK");
        } 
        else if (mark > 50) {
            System.out.println("IPHONE");
        } 
        else if (mark > 35) {
            System.out.println("VIDEO GAME");
        } 
        else {
            System.out.println("No gift");
        }

        sc.close();
    }
}
