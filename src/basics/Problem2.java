package basics;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.printf("%d is greater than %d", num1 ,num2);
        } else if(num2 > num1){
            System.out.printf("%d is greater than %d",num2 , num1);
        }
        else{
            System.out.println("Both numbers are equal");
        }
        scanner.close();
    }
}
