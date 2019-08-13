package problems_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_15 {
    /*
    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

    Note:
    The solution set must not contain duplicate triplets.

    Example:

    Given array nums = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]
    * */

    //Completed solution
    /*
    Runtime: 31 ms, faster than 80.53% of Java online submissions for 3Sum.
    Memory Usage: 46.5 MB, less than 94.31% of Java online submissions for 3Sum.
    * */

    public List<List<Integer>> solution() {
        //int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        int[] nums = new int[] {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        //[[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println("Sorted nums : "+Arrays.toString(nums));
        for (int i=0 ; i<nums.length-2; i++){
            System.out.println("i:"+i);
            int j = i+1;
            int k = nums.length-1;
            System.out.println("First Number : "+nums[i]);
            int target = -nums[i];
            System.out.println("Target : "+target);
            if (i>0 && nums[i] == nums[i-1]){
                System.out.println("pass:"+nums[i]+","+nums[i-1]);
                continue;
            }
             while (j < k) {
                 int sum = nums[j] + nums[k];
                 System.out.println("Sum :" + sum);
                 if (sum == target) {
                     System.out.println("Result :"+nums[i]+","+nums[j]+","+nums[k]);
                     result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                     j++; k--;
                     while (j<k && nums[j] == nums[j-1]){
                         j++;
                     }
                     while (j<k && nums[k] == nums[k+1]){
                        k--;
                     }
                 } else if (sum < target) {
                     j++;
                 } else {
                     k--;
                 }
             }
        }
        //System.out.println("Result : "+Arrays.toString(result.toArray()));
        return result;
    }
}
