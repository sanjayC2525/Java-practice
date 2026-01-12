package basics;
import java.util.Scanner;
public class ArrayBasics {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Number " + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();
        printArray(arr);
        int total = sum(arr);
        System.out.println("Total: " + total);
        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));
        int index =linearSearch(arr,target);
        if(index != -1){
            System.out.println("Found at index: " + index);
        }
        else{
            System.out.println("Not Found");
        }

        scanner.close();
    }
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static int sum(int[] arr){
        int sum =0;
        for(int num : arr){
             sum += num;
        }
        return sum;
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}

