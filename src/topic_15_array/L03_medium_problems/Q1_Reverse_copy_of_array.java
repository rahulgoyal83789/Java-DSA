package topic_15_array.L03_medium_problems;

import java.util.Arrays;

public class Q1_Reverse_copy_of_array {
    static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int n = nums.length-1;
        int revArr[] = new int[nums.length];
        for(int i = n;i>=0;i--){
            revArr[n-i] = nums[i];
        }
        System.out.println("Original Array:"+ Arrays.toString(nums));
        System.out.println("Reverse Array:"+ Arrays.toString(revArr));

        /*
        for(int i = 0;i<=n;i++){
            revArr[i] = nums[n];
            n--;
        }
        */

    }
}
