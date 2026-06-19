package Data_types_in_depth;

public class L01 {
    static void main(String[] args) {
        int a = 10;
        float b = 9.8f;
        byte bt = 127;
        long l = 127; // it is ok
        long l2 = 2147487265489565653L;
        // if the number is too large (out of int range) then we need to add "L" in the last of that number to store it in  long but if the number is in the rangge of int then it is not required
        System.out.println(l2);

        // number system
        int d = 0b10;
        // binary number start with 0b or 0B aage number original value like in this case d = 10(binary) = 2 (Decimal)
        int f = 012;
        // Octal number start with 0, aage number original value like in this case d = 012(octal) = 10 (Decimal)
        // Hexadecimal number start with 0x or 0X, aage number original value
        int ab = 0X12f;
        System.out.println(ab);


        // by default all decimal numbers in java are double
        double a1 = 17.8;
        float a2 = 14.9f;

        boolean b1 = true;

        char c1 = 'a';
//        for(int i =0; i<=65535;i++){
//            System.out.print((char)i+" ");
//            if(i%20==0){
//                System.out.println();
//            }
//        }
        int ac = '9';
        char ca = 48; // 0

        System.out.println(ac);
        System.out.println(ca);
        double d1 = 5f; // p1
        double d2 = 5.0f; // p2
        float f1 = 5f; // p3
//        float f2 = 5.0; // p4

    }
}
