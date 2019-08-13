package problems_solution;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class callMethod {

    public static void main(String[] args) {
        int call_solution = 999;
        if (call_solution == 5) {
            LongPalindrSubstring ans = new LongPalindrSubstring();
            String result = ans.longestPalindrome("abba");
            System.out.println("[callMethod - "+call_solution+"] Return String : "+result);
        } else if (call_solution == 15) {
            Sum3_15 ans = new Sum3_15();
            List<List<Integer>> result = ans.solution();
            System.out.println("[callMethod - "+call_solution+"] Return List Array : "+result);
        } else if (call_solution == 16) {
            int target = -1;
            int[] nums = new int[] {1,1,-1,-1,3};
            //[-1,2,1,-4]
            //[-1, 2, 1, -4], and target = 1 => Result : 2
            //[1,1,-1,-1,3], and target = -1 => Result : -1
            Sum3Closest_16 ans = new Sum3Closest_16();
            int result = ans.solution(nums, target);
            System.out.println("[callMethod - "+call_solution+"] Return int : "+result);
        } else if (call_solution == 771) {
            JewelsAndStones_771 771 = new JewelsAndStones_771();
            771.
            Sum3Closest_16 ans = new Sum3Closest_16();
            int result = ans.solution(nums, target);
            System.out.println("[callMethod - "+call_solution+"] Return int : "+result);
        }else if (call_solution == 999) {
            System.out.println("[callMethod] Start "+call_solution+".");
            TerminalCommand tc = new TerminalCommand();
            try {
                tc.testing();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("[callMethod] End "+call_solution+".");
        }
        return;
    }
}
