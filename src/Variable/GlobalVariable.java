package Variable;

public class GlobalVariable {
    static  int x = 10;
    int y = 20;

    public static void main ( String[] args ) {
        System.out.println (x);              // static variable
//        System.out.println (y);       this is the global non-static variable. so we can't access
    }
}
