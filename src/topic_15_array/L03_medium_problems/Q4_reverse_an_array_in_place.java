package topic_15_array.L03_medium_problems;

import java.util.Arrays;

public class Q4_reverse_an_array_in_place {
    static void main(String[] args) {
        // reversing an array without any extra space
        int[] arr = {1,2,3,4,5};
        int start = 0, end = arr.length-1;
        while(start<end){
            // swap i and j
            arr[end] = (arr[start]-arr[end])+(arr[start]=arr[end]);
            // a = b-a+(b=a);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
