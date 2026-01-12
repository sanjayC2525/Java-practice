package basics;
import java.util.Scanner;
public class Problem8 {
    public static int max(int a, int b){
        if(a > b){
           return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        int result = max(num1,num2);

        System.out.printf("%d is the largest!",result);
        scanner.close();
    }
}
