package topic_15_array.L03_medium_problems;

import java.util.Arrays;

public class Q2_left_rotate_array_by_1 {
    static void main(String[] args) {
        // left rotation of array by 1
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int first = arr[0];
        for(int i=0;i<n;i++){
            if(i!=n-1) arr[i]=arr[i+1];
            else arr[i]=first;
        }
        System.out.println(Arrays.toString(arr));

        // right rotation of array by 1
        int[] arr2 = {1,2,3,4,5};
        n = arr2.length;
        int last = arr2[n-1];
        for(int i=n-1;i>=0;i--){
            if(i!=0) arr2[i]=arr2[i-1];
            else arr2[i]=last;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
