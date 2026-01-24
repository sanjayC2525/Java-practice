import java.util.Arrays;
public class TwoSum {
    public static void main(String [] args){
        int[] arr = new int[2];
        int target = 15;
        int[]  nums = new int[]{2,5,11,10,13};

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
