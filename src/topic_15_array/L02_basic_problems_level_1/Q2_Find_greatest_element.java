package topic_15_array.L02_basic_problems_level_1;

import java.util.Scanner;

public class Q2_Find_greatest_element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{10,5,2,37,8};
        int max = nums[0];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                idx = i;
            }
        }
        System.out.println("The greatest element is " + max +" at index "+idx);
    }
}
