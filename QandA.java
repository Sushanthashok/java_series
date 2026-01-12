/* program01: QandA.java
import java.util.Scanner;
public class QandA {
    public static void main(String[]args){
       
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=sc.nextLine();
    System.out.println(name);
    System.out.println("Enter your age:");
    int age=sc.nextInt();
    System.out.println(age);
    System.out.println(" name:"+name+" age: "+age);
    
 }
}
*/
//program02
/*import java.util.Scanner;
public class QandA {
    public static void main(String[]args){
       
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a:");
    int a=sc.nextInt();
    System.out.println("Enter b:");
    int b=sc.nextInt();
    System.out.println("Enter c:");
    int c=sc.nextInt();
    int d=a*b*c;
    System.out.println("The multiplication of a,b,c is:"+d);
    int e=a+b+c;
    System.out.println("The addition of a,b,c is:"+e);
    int f=d/e;
    System.out.println("The division of multiplication and addition is:"+f);
    }
}
*/
//program03
import java.util.Scanner;
public class QandA {
    public static void main(String[]args){
       
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name:");
    String name=sc.nextLine();
    System.out.println("Enter Score for 100 marks:");
    double score=sc.nextInt();
    System.out.println("Enter dept:");
    String dept=sc.next();
    System.out.println("Name:"+name+" Score:"+score+" Dept:"+dept);
    System.out.println("marks/10:"+(score/10));
}
}
