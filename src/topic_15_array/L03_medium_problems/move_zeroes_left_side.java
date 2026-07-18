package topic_15_array.L03_medium_problems;

import java.util.Arrays;

public class move_zeroes_left_side {
    static void main(String[] args) {
        // we have to move negative elements to left and positive elements to right
        int arr[] = {1, 1, 0, 1, 0, 0, 1,1,0};
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                //swap i and j
                arr[j] = (arr[i] - arr[j]) + (arr[i] = arr[j]);
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
