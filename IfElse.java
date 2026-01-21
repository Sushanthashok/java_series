
import java.io.*;

public class IfElse {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number for a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter a number for b  : ");
        int b= Integer.parseInt(br.readLine());
        System.out.println("valueof a "+a +" :");
        System.out.println("valueof b " +b +" :");
        if(a>b){
            System.out.println("a is greater");
        }else if (b>a) {
            System.out.println("b is greater");

            
        }else{
            System.out.println("Both are equal");
        }
    }
}
