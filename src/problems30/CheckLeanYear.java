package problems30;
import java.util.Scanner;
public class CheckLeanYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else if(year % 4 == 0 && !(year % 100 ==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
        scanner.close();
    }
}
