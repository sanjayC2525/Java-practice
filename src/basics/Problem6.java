package basics;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
