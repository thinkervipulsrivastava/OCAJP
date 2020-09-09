import java.io.OutputStream;

public class BreakContinue {
    public static void main(String[] args) {
        int i, j;
        // break statement without label
        for (i = 0; i < 4; i++) {
            j = 1;
            while (j < 4) {
                if (j % 2 == 0) {
                    break;
                }
                j++;
                System.out.println("Inner While loop");
            }
            System.out.println("Outer for loop");
        }
        /*Output
        Inner While loop
        Outer for loop
        Inner While loop
        Outer for loop
        Inner While loop
        Outer for loop
        Inner While loop
        Outer for loop*/

    // break statement with label
       a: for (i = 0; i < 4; i++) {
            j = 1;
             while (j < 4) {
                if (j % 2 == 0) {
                    break a;
                }
                j++;
                System.out.println("Inner While loop");
            }
            System.out.println("Outer for loop");
        }
    // Output : Inner While loop

    }
}

