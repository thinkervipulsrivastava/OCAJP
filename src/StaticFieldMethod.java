public class StaticFieldMethod {
    public static int value = 0;
    /*Instance method can access static field as well as non static field*/
    /*Static method can access static field only*/
    public static void incrementValue () {
        value ++;
    }
}
