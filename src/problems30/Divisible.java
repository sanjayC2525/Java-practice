package problems30;
import java.util.Scanner;
public class Divisible {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            if((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)){
                System.out.println(" " + i);
            }
        }
    }
}
