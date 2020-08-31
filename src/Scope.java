/*
Author Vipul Srivastava
Practice Question
 */
public class Scope {
    /*
    Class lever Scope variable
     */
    static int number1 = 0;

    public static void main(String[] args) {
        {
            // Block level Scope
            int number2 = 0;
        }
        System.out.println(number1);
        int number3 = 0;
    }
}
