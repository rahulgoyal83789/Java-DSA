package topic_11_loops.do_while;

import java.util.Scanner;

public class menu_driven_calc {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , num1, num2;
        do {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for division");
            System.out.println("Enter 4 for multiplication");
            System.out.print("Enter choice:- ");
            n = sc.nextInt();
            if(n>4||n<1){
                System.out.println("Exiting....");
                System.exit(0);
            }
            System.out.print("Enter 1st number:- ");
            num1 = sc.nextInt();
            System.out.print("Enter 2nd number:- ");
            num2 = sc.nextInt();
            if(n==1){
                System.out.println("Addition :- "+ (num1+num2));
            }else if(n==2){
                System.out.println("Subtraction :- "+ (num1-num2));
            } else if (n==3) {
                if(num2==0) System.out.println("Divide by Zero is not possible");
                else System.out.println("Division :- "+ ((double)num1/num2));
            } else if (n==4) {
                System.out.println("Multiplication :- "+ (num1*num2));
            }else {
                System.exit(0);
            }
        }while(true);
    }
}
