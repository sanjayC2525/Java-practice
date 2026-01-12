package basics;
import java.util.Scanner;
public class Problem9 {
    static int sumArray(int[] arr){
        int sum = 0;

        for(int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number" + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }

        int result = sumArray(arr);

        System.out.println(result);
    }
}
