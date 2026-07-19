package topic_15_array.L03_medium_problems;

import java.util.Arrays;

public class Q6_subarrays_with_given_sum {
    static void main(String[] args) {
        int arr[] = {1,2,2,4,5};
        int n = arr.length;
        int target = 9;
        int count = 0;
        // brute force :- Time: O(n2), Space: O(1)
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                if(sum==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
