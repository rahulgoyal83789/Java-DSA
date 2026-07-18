package topic_15_array.L03_medium_problems;

import java.util.Arrays;

public class Q5_Move_negatives_to_left_positives_to_right {
    static void main(String[] args) {
        // we have to move negative elements to left and positive elements to right
        int arr[] = {10,20,-56,19,-12,19,-10};
        int i = 0, j = 0;
        while(i<arr.length){
            if(arr[i]<0){
                //swap i and j
                arr[j] = (arr[i]-arr[j]) + (arr[i]=arr[j]);
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
