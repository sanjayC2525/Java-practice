package basics;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number " + (1 + i) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter Number you want to find: ");
        int key = scanner.nextInt();

        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                found = true;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        scanner.close();
    }
}
