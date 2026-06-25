package topic_07_packages_and_math_api;
import java.util.Scanner;
public class area_and_perimeter_of_rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        System.out.println("Enter length of rectangle:- ");
        int length =sc.nextInt();
        System.out.println("Enter width of rectangle:- ");
        int width =sc.nextInt();
        int area = length * width;
        int perimeter = 2*(length+width);
        System.out.println(area);
        System.out.println(perimeter);

    }
}
