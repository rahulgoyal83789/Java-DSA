package topic_09_conditionals_practice;
import java.util.Scanner;
public class valid_voter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        if(age>=18){
            System.out.println(name+" is a valid voter.");
        } else{
            System.out.println(name+" is not a valid voter.");
            int diff = 18 - age;
            if (diff == 1) {
                System.out.println(name+" will be eligible in 1 year.");
            }else{
                System.out.println(name+" will be eligible in "+diff+" years.");
            }
        }
    }
}
