public class WrapperClass {
    public static void main( String [] args) {
        // Boolean
        booleanExample();
        // Byte, Short, Integer, Long , they have field and method with the same name and functionality
        integralExample();
        // Float and Double , they have field and method with the same name and functionality
        floatingPointExample();
        // Character
        characterExample();

    }
    public static void booleanExample () {
        Boolean bool = Boolean.logicalAnd(true, false);
        int compare = bool.compareTo(false);
        System.out.println(compare);
    }
    public static void integralExample () {
        int sum = Integer.sum(1, 2);
        System.out.println(sum);
    }
    public static void floatingPointExample () {
        double max = Double.max(1.1, 2.1);
        System.out.println(max);
    }
    public static void characterExample () {
        int codePoint = Character.codePointAt("OCAJP ", 2);
        System.out.println(codePoint);
    }
}
