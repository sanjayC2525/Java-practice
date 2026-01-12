package problems30;
import java.util.Scanner;
public class PrimeCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        for(int i = 2; i <= n; i++){
            boolean isPrimee = true;
            for(int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimee = false;
                    break;
                }
            }
            if(isPrimee){
                count ++;
            }
        }
        System.out.println(count);
    }
}
