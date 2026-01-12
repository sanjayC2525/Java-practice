package problems30;

public class Divisible1 {
    public static void main(String[] args){
        int n = 20;
        int count = 0;
        for(int i = 0; i <= n; i++){
            if(i % 4 == 0 && !(i % 8 == 0)){
                count ++;
            }
        }
        System.out.println(count);
    }

}
