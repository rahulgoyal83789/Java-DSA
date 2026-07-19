package topic_15_array.L03_medium_problems.PracticeQuestions;

import java.util.Scanner;

public class right_rotate_by_k {
    public static void reverseArray(int[] arr,int start, int end) {
        while(start<end){
            arr[end] = (arr[start]-arr[end])+(arr[start]=arr[end]);
            start++;
            end--;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int k = sc.nextInt();
        int n = arr.length;
        k = k % n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
    }
}
