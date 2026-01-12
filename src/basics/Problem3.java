package basics;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        scanner.close();
    }
}
