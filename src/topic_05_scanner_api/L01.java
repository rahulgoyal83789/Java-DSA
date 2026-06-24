package topic_05_scanner_api;

import java.util.Scanner;

public class L01 {
    public static void main(String[] args) {
         int age = 19;
//         scanner api :- helps to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name :- ");
        String name = sc.next();
        sc.nextLine(); // to fix nextLine buffer issue i had to add this extra nextLine
        System.out.print("Enter your Full Name :- ");
        String fullname = sc.nextLine();
        System.out.print("Enter your Name :- ");
        char ch = sc.nextLine().charAt(2);
        System.out.println(ch);
        System.out.print("Enter your age :- ");
        age = sc.nextInt();
        System.out.println(name+"'s full name is "+fullname+" and his age is "+age);
        // hasnext() method
        /*
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        */
        sc.close();
    }
}
