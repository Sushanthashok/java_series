import java.io.*;

public class SalaryBonus {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter Salary: ");
            int salary = Integer.parseInt(br.readLine());

            System.out.print("Enter Experience (in years): ");
            int exp = Integer.parseInt(br.readLine());

            int bonus;

            if (exp >= 5) {
                bonus = 5000;
            } else {
                bonus = 2000;
            }

            int totalSalary = salary + bonus;

            System.out.println("Bonus: " + bonus);
            System.out.println("Total Salary after Bonus: " + totalSalary);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
    }
}
