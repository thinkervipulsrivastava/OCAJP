public class StaticFieldMethodMain {
    public static void main(String[] args) {
        //StaticFieldMethod.incrementValue();
        StaticFieldMethod object1 = new StaticFieldMethod();
        StaticFieldMethod object2 = new StaticFieldMethod();
        object1.incrementValue();
        //StaticFieldMethod.incrementValue();;

        System.out.println(object2.value);
    }
}
