package topic_15_array.L01_intro_and_memory_architecture_of_array;

import java.util.Arrays;
import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaration of array
        int[] arr1;
        int arr2[];
        int[] arr = new int[5];
        arr[0] =  1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] brr = new int[]{1,2,3,4,5};
        for(int i = 0; i < brr.length; i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        for(int temp : brr){
            System.out.print(temp+" ");
        }
        System.out.println();
        int[] arr3 = new int[]{8,3,7,8,9};
        System.out.println(Arrays.toString(arr3));
        int[] arr5 = {1,2,3,4,5};
        int[] defarr = new int[5];
        float[] defarr2 = new float[5];
        char[] defarr3 = new char[5];
        boolean[] defarr4 = new boolean[5];
        String[] defarr5 = new String[5];
        System.out.println(Arrays.toString(defarr));
        System.out.println(Arrays.toString(defarr2));
        System.out.println(Arrays.toString(defarr3));
        System.out.println(Arrays.toString(defarr4));
        System.out.println(Arrays.toString(defarr5));
        System.out.println("\u0000");

        int[]  x = {120, 200, 016};
        for(int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");
    }
}
