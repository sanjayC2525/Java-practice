package problems30;
import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if(marks >= 90 && marks <= 100) {
            System.out.println("A");
        }
        else if(marks >= 75){
            System.out.println("B");
        }
        else if(marks >= 50){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
