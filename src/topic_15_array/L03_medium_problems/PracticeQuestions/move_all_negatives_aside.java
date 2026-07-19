package topic_15_array.L03_medium_problems.PracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class move_all_negatives_aside {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1, 2, -3, 4, 5, -6, -7, 8};
        int n = arr.length;
        int[] result = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
