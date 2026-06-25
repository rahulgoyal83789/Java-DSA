package topic_07_packages_and_math_api;

import java.util.Scanner;

public class area_of_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
        // surface area of sphere
        double r = sc.nextDouble();
        double sa = 4* Math.PI *r*r;
        System.out.print(sa);
        // circumference and area
        float radius = sc.nextFloat();
        double circumference = 2*Math.PI*radius;
        double areac = Math.PI*radius*radius;
        System.out.printf("%.2f\n",circumference);
        System.out.printf("%.2f\n",areac);


    }
}
