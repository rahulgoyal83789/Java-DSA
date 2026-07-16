package topic_15_array.L02_basic_problems_level_1;

import java.util.Scanner;

public class Q1_Sum_and_average_of_array_elements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        int sum = 0;
        System.out.print("Enter the elements of the array : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float mean = (float)sum / n;
        System.out.println("The mean of the array is : "+ mean);
        System.out.println("The sum of the array is : "+ sum);

    }
}
