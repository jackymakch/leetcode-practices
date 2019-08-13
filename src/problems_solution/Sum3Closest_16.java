package problems_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Closest_16 {
    /*
    Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
    Return the sum of the three integers. You may assume that each input would have exactly one solution.

    Example :
    Given array nums = [-1, 2, 1, -4], and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    * */

    //Completed solution
    /*
    Runtime: 31 ms, faster than 80.53% of Java online submissions for 3Sum.
    Memory Usage: 46.5 MB, less than 94.31% of Java online submissions for 3Sum.
    * */

    public int solution(int[] nums, int target) {
        //int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        //[[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]

        //Argurments
        //int target = 2;
        //int[] nums = new int[] {-1, 2, 1, -4, -5};
        //
        int result = target;
        int dest = -1;
        Arrays.sort(nums);
        System.out.println("Sorted nums : "+Arrays.toString(nums));
        for (int i=0 ; i<nums.length-2; i++){
            System.out.println("i:"+i);
            int j = i+1;
            int k = nums.length-1;
            System.out.println("First Number : "+nums[i]);
            System.out.println("Target : "+target);
            if (i>0 && nums[i] == nums[i-1]){
                System.out.println("pass:"+nums[i]+","+nums[i-1]);
                continue;
            }
             while (j < k) {
                 int sum = nums[i] + nums[j] + nums[k];
                 System.out.println("Sum :"+sum+",i:"+i+",j:"+j+",k:"+k);
                 System.out.println("Sum :"+sum+",i:"+nums[i]+",j:"+nums[j]+",k:"+nums[k]);

                 if (sum == target) {
                     return sum;
                 } else if (sum < target) {
                     if (dest == -1 ||  target-sum < dest) {dest = target - sum; result = sum;};
                     System.out.println("sum < target:"+dest);
                     j++;
                 } else {
                     if (dest == -1 ||  sum-target < dest) {dest = sum - target; result = sum;};
                     System.out.println("sum > target:"+dest);
                     k--;
                 }
             }
        }
        System.out.println("Result : " + result);
        return result;
    }
}
