package topic_12_jump_statements;

import java.util.Scanner;

public class vowel_consonant {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
//        switch (ch){
//            case 'A','E','I','O','U','a','e','i','o','u'-> System.out.println("Vowel");
//            case 'B' ->  System.out.println("Consonant");
//        }

        // Convert the character to lowercase to handle both uppercase and lowercase inputs
        ch = Character.toLowerCase(ch);

        // Initialize a variable to hold the result
        String result = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> "Vowel";  // Case for vowels
            default -> Character.isLetter(ch) ? "Consonant" : "Not a letter";
        };

        // Use a switch statement to determine if the character is a vowel or consonant

        // Print the result
        System.out.println(result);
    }
}
