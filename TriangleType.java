import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // First check if it is a valid triangle
        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("It is an Equilateral Triangle");
            } 
            else if (a == b || b == c || a == c) {
                System.out.println("It is an Isosceles Triangle");
            } 
            else {
                System.out.println("It is a Scalene Triangle");
            }

        } else {
            System.out.println("Not a valid Triangle");
        }

        sc.close();
    }
}
