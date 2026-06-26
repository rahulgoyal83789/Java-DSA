package topic_08_control_flow_statements;

import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Valid Voter!!");
        } else{
            System.out.println("Invalid Voter!!");
        }
        System.out.print("Enter your marks:- ");
        int marks = sc.nextInt();
        if(marks>90){
            System.out.println("A+");
        } else if(marks>80){
            System.out.println("A");
        } else if(marks>70){
            System.out.println("B");
        } else if(marks>60){
            System.out.println("Fair");
        } else{
            System.out.println("Fail");
        }
        int x=11, y=22;
        if(x++ == 11 || ++y == 23){ // 1st condition is true toh aage wale ko dekh abhi nhi jaayega
            System.out.println(x + " " + y);
        }else{
            System.out.println(x + " " + y);
        }
        // compile time error
        /*
        int hops = 0;
        int jumps = 0;
        jumps = hops++;
        if(jumps)
            System.out.print("Jump!");
        else
            System.out.print("Hop!");
         */
        // numbers are not boolean in java only true and false works , no 0 and 1
        
    }
}
