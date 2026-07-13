package topic_11_loops.do_while;

import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do while syntax
        /*
        do{
            //code
        }while(condition/true/false);
         */
        int n;
        do{
            System.out.println("Hello");
            System.out.print("Enter 1 for printing Hello, Otherwise enter press any number:- ");
            n =  sc.nextInt();
        }while(n==1);
    }
}
