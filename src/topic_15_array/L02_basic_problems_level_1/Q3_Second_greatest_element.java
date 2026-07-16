package topic_15_array.L02_basic_problems_level_1;

import java.util.Scanner;

public class Q3_Second_greatest_element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{10,5,2,37,37, 37,8,36};
        int greatest = Math.max(nums[0],nums[1]);
        int secondGreatest = Math.min(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(nums[i] > greatest){
                secondGreatest = greatest;
                greatest = nums[i];
            } else if(nums[i] > secondGreatest && nums[i]!=greatest) secondGreatest = nums[i];
        }
        System.out.println("The second greatest element is " + secondGreatest);
    }
}
