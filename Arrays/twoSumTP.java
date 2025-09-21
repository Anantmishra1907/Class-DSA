
import java.util.*;


public class twoSumTP {
    public int[] findTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;    
     while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};  
            } else if (sum < target) {
                left++;
            } else {       
                right--;
                }
            }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSumTP twoSum = new twoSumTP();
        int[] result = twoSum.findTwoSum(nums, target);
        if (result[0] != -1) {
            System.out.println( result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
    
}