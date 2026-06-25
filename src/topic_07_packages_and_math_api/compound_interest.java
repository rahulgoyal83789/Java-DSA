package topic_07_packages_and_math_api;

import java.util.Scanner;

public class compound_interest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter principal:- ");
        double p = sc.nextDouble();
        System.out.print("Enter interest rate:- ");
        double r = sc.nextDouble();
        System.out.print("Enter time period:- ");
        int n = sc.nextInt();
        double amount = p*Math.pow(1+r/100,n);
        System.out.println("The amount is "+amount);
        System.out.println("The CI is "+(amount-p));
        */
        System.out.print("Enter principal amount:- ");
        int p = sc.nextInt();
        System.out.print("Enter annual interest rate:- ");
        double r = sc.nextDouble();
        System.out.print("Enter number of years:- ");
        int t = sc.nextInt();
        System.out.print("Enter number of times interest is compounded per year:- ");
        int n = sc.nextInt();
        double CI = (p* Math.pow(1+r/n,n*t)) - p;
        System.out.printf("%.2f",CI);
    }
}
