package basics;

import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = scanner.nextInt();

        for(int i=1; i <= n; i++){
            System.out.println(i);
        }
        scanner.close();
    }
}
