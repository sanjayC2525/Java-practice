package basics;
import java.util.Scanner;
public class Problem1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        System.out.printf("Hello %s , you will be %d next year.",name , age +1);
        scanner.close();
    }
}
