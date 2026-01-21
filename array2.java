import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (size % 2 == 0) {
            int mid1 = size / 2 - 1;
            int mid2 = size / 2;
            System.out.println("Middle elements are: " + arr[mid1] + " and " + arr[mid2]);
        } else {
            int mid = size / 2;
            System.out.println("Middle element is: " + arr[mid]);
        }
    }
}

