package basics;
import java.util.Scanner;
public class AverageOfThree {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int small = arr[0];
        int large = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
            if(arr[i] > large){
                large = arr[i];
            }
        }
        System.out.println();
        System.out.println("Smallest:" +" "+ small);
        System.out.println("Largest:" + " "+large);
    }
}
