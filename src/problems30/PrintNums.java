package problems30;

public class PrintNums {
    public static void main(String[] args){
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(j);
            }
            System.out.print("|");
        }
    }
}
