public class Lession1 {   
    public static void main(String[] args) {
        
        System.out.println("Bingo!!!");

        System.out.println("Max numbers");

        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println(byteMax);
        System.out.println(shortMax);
        System.out.println(intMax);
        System.out.println(longMax);

        System.out.println("Inc");

        byte byteInc = (byte) (byteMax + 1);
        short shortInc = (short) (shortMax + 1);
        int intInc = intMax + 1;
        long longInc = longMax + 1;

        System.out.println(byteInc);
        System.out.println(shortInc);
        System.out.println(intInc);
        System.out.println(longInc);
        
    }
}
