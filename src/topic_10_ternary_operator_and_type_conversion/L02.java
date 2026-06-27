package topic_10_ternary_operator_and_type_conversion;

public class L02 {
    static void main(String[] args) {
        // widening conversion or implicit casting
        byte a = 10;
        int b  = a;

        // Narrowing conversion or explicit casting
        double d = 19.8;
        int e = (int)d;

        //type promotion
        byte a1 = 19;
        short b1 = 180;
        int c1 = 23253;
        int d1 = a1+b1+c1;
    }
}
