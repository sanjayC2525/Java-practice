package problems30;

public class PrimeToPrintThree {
    public static void main(String[] args) {
        int n = 50;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrimeeee = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeeee = false;
                    break;
                }
            }
            if (isPrimeeee && i % 10 == 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
