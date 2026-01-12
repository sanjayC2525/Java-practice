package basics;
import java.util.Scanner;
public class Problem10 {
    static double average(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum/arr.length;
    }
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Number " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        double result = average(arr);

        System.out.printf("The Average of all Numbers is %.0f",result);
        scanner.close();
    }
}
