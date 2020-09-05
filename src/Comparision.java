public class Comparision {
    public static void main (String [] args) {
        compareObjectsUsingOperator ();
        compareObjectsUsingEquals ();
        compareStringsUsingEquals ();
    }
    public static void compareObjectsUsingOperator () {
        String string1 = new String ("Hi");
        String string2 = "Hi";
        String string3 = "Hi";
        System.out.println (string1 == string2);
        System.out.println (string2 == string3);
    }
    public static void compareObjectsUsingEquals () {
        Data data1 = new Data(0);
        Data data2 = new Data( 0);
        System.out.println( data1.equals((data2)));

    }
    public static void compareStringsUsingEquals () {
        String string1 = new String("Hi");
        String string2 = new String("Hi");
        String string3 = "Hi";
        System.out.println(string1.equals((string2)));
        System.out.println(string2.equals(string3));
    }
}
