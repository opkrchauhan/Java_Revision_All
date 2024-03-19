package WrapperClass;

public class Task1 {
    public static void main ( String[] args ) {
        //xxxValueOf()
        Integer i1= Integer.valueOf ("1010001",2);
        Double d1 = Double.valueOf ("3.14");
        System.out.println (i1);

        // parseXXX() return xxx
      int a = Integer.parseInt ("123");
      double d = Double.parseDouble ("13.25");
        System.out.println (a);

        // xxxValue() instance Method of wrapper class return xxx
        int c = i1.intValue ();
        System.out.println (c);
    }
}
