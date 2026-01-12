package problems30;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isPrime = true;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                isPrime = false;
                break ;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        scanner.close();
    }
}
