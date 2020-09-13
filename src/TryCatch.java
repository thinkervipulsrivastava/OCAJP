public class TryCatch {
    public static void main (String[] args) {
        try {
            throwException ();
            System.out.println ("Normal Program flow");
        } catch (Exception e) {
            System.out.println ("Exception branch");
        }

    }

    public static void throwException () {
        throw new RuntimeException();
    }
}
