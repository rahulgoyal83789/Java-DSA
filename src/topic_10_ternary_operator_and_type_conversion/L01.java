package topic_10_ternary_operator_and_type_conversion;

import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :- ");
        int a =  sc.nextInt();
        System.out.print("Enter b :- ");
        int b = sc.nextInt();
        int max;
        max = a>b?a:b;
        int min;
        min = a<b?a:b;
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);
        System.out.print("Enter marks :- ");
        int marks = sc.nextInt();
        String result = marks>35? "Pass":"Fail";
        System.out.println(result);
        System.out.println(marks>35? "Pass":"Fail");
        // Nested ternary operator
        String grade = marks>35? (marks>90?"O":(marks>80?"A":(marks>60?"B":"C"))):"F";
        System.out.println(grade);
        
    }
}
