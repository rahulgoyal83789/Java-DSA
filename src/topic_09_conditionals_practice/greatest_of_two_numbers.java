package topic_09_conditionals_practice;

import java.util.Scanner;

public class greatest_of_two_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:- ");
        int a = sc.nextInt();
        System.out.print("Enter b:- ");
        int b = sc.nextInt();
        if(a>=b){
            System.out.println(a);
        } else{
            System.out.println(b);
        }
    }
}
