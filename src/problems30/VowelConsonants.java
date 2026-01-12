package problems30;
import java.util.Scanner;
public class VowelConsonants {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] vowels = {'a','e','i','o','u'};
        char character  = scanner.next().charAt(0);
        boolean isFound = false;

        for(int i = 0; i < vowels.length; i++){

              if(Character.toLowerCase(character) == vowels[i]){
                  isFound = true;
                  break;
              }
              else{
                  isFound = false;
              }
        }
        if(isFound){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
