package topic_15_array.L03_medium_problems;

import java.util.Arrays;
import java.util.Scanner;

public class right_rotate_array_by_k {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int k = sc.nextInt();
        int n = arr.length;
        k = k % n;
        for(int j = 1; j<= k; j++){
            int last =  arr[n -1];
            for(int i = n -1; i>=1; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
