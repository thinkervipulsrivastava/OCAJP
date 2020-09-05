public class IfElseSwitch {
    public static void main (String [] args) {
        int i = 1;

        // Ternary constructs
        String output = i > 0 ? "Positive" : "Non Positive";
        System.out.println(output);

        // if-then-else construct
        if (i > 0) {
            System.out.println ("Positive");
        } else {
            System.out.println("Non Positive");
        }

       // Switch statement
        String a = "A";
        switch (a ) {
            case "a" :
                System.out.println(a);
                break;
            default:
                System.out.println("Default");

        }
    }
}
