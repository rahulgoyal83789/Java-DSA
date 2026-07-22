package topic_16_methods_and_arguements;

public class L01 {
    static void systemCheck() {
        System.out.println("System check");
    }
    static void swapping(int[] arr) {
        int start = 0, end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        systemCheck();
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        systemCheck();
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        systemCheck();
    }
}
