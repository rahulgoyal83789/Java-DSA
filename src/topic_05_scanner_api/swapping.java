package topic_05_scanner_api;

import java.util.Scanner;

public class swapping {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:- ");
        int a =  sc.nextInt();
        System.out.print("Enter b:- ");
        int b = sc.nextInt();
        // without a temp variable
        a = a +b;
        b = a - b;
        a = a - b;
        // with a temp variable
        int c = a;
        a = b;
        b = c;
        // arithmetics
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("Value of a is "+a+" and b is "+b);
    }
}
