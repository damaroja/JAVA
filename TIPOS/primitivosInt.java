

//Tipos primitivos en java para integers

public class Main {
    public static void main(String args[]) {
        /* 
         * Tipos primitivos enteros
         * byte, short, int, long, boolean, char
         * float, double son flotantes
         */

        //Byte
        short b = 10;
        System.out.println(b);  //10
        System.out.println(Short.MAX_VALUE);  // 32767
        System.out.println(Short.MIN_VALUE);  // -32768
        System.out.println(Short.SIZE); //16

        int i = 23423;
        System.out.println(i);  // 23423
        System.out.println(Integer.MAX_VALUE);  // 2147483647
        System.out.println(Integer.MIN_VALUE);  // -2147483648
        System.out.println(Integer.SIZE);  // 32

        long l = 123123123123123123L;
        System.out.println(l);  // 123123123123123123
        System.out.println(Long.MAX_VALUE);  // 9223372036854775807
        System.out.println(Long.MIN_VALUE);  // -9223372036854775808
        System.out.println(Long.SIZE);  // 64
        System.out.println(Long.BYTES);  // 8
 

}
}
