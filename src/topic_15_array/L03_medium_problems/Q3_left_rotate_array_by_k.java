package topic_15_array.L03_medium_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_left_rotate_array_by_k {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int k = sc.nextInt();
        int n = arr.length;
        k = k%n;
        for(int j=1;j<=k;j++){
            int first = arr[0];
            for (int i = 0; i < n-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n-1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
