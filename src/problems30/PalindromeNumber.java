package problems30;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int originalNum = n;
        int digit = 0;
        int rev = 0;
        while(n != 0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if(originalNum == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
