package problems30;
import java.util.Scanner;
public class OddPrimeCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        for(int i = 2; i <= n; i++){
            boolean isPrimeee = true;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrimeee = false;
                    break;
                }
            }
            if(isPrimeee){
                if(i % 2 != 0){
                    count ++ ;
                }
            }
        }
        System.out.println(count);
    }
}
