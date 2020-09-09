public class MethodOverloading {
    public static void main (String [] args) {
        short s1 = 1, s2 = 2;
        int sum = calculate (s1, s2);
        System.out.println("The result is " + sum);
    }
    // 1st priority
      static int calculate (int s1, int s2) {
        System.out.println("Calculation int sum");
        return s1 + s2;
    }
    // 2nd priority
    static int calculate (long s1, long s2) {
        System.out.println("Calculating long sum(casting)");
        return (int) (s1 + s2);
    }
    // 3rd priority
    static int calculate (Short s1, Short s2) {
        System.out.println("Calculating short sum (Boxing and AutoBoxing");
        return Short.valueOf(s1) + Short.valueOf(s2);
    }
    // 4th priority
    static  int calculate (short ...s1) {
        System.out.println("Calculating short two argument sum (varargs");
        return s1[0] + s1[1];
    }
}
