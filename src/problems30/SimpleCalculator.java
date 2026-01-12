package problems30;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        char op = scanner.next().charAt(0);

        switch(op){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
            default -> System.out.println("Invalid operator");
        }
        scanner.close();
    }
}
