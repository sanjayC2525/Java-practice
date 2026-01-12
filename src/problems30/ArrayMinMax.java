package problems30;
import java.util.Scanner;
public class ArrayMinMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if(max < arr[i] ) max = arr[i];
        }
        System.out.println(min);
        System.out.println(max);

        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
