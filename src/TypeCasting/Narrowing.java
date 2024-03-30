package TypeCasting;

public class Narrowing {
    public static void main ( String[] args ) {
        int j ;
        byte i;
        j = 134;
//        i=j; it can't convert it is only applicable when we passed before byte in the code;
        i = (byte)j;
        System.out.println (i);

    }
}
