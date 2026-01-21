/*public class rough {
public static void main(String[]args){
    int num=1234;
    int rev=0;
    while (num!=0) {
        
    
    int digit=num%10;
    rev=(rev*10)+digit;
    num=num/10;
   
    } System.out.println(rev);
}
}
*/
import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum = " + sum);
    }
}
