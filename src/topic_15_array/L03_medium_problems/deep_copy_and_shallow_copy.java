package topic_15_array.L03_medium_problems;

import java.util.Arrays;
import java.util.Scanner;

public class deep_copy_and_shallow_copy {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // deep copy
        int arr[] = {10,20,30,40,50};
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        temp[1]=69;
        System.out.println("Original Array:"+ Arrays.toString(arr));
        System.out.println("Copy Array:"+ Arrays.toString(temp));
        // shallow copy
        int arr2[] = {10,20,30,40,50};
        int temp2[] = arr2;
        temp2[1] = 69;
        System.out.println("Original Array:"+ Arrays.toString(arr2));
        System.out.println("Copy Array:"+ Arrays.toString(temp2));


    }
}
