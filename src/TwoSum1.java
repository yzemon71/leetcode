import java.util.Arrays;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] output = twoSum(nums, target);

        System.out.println(Arrays.toString(output));
    }
}