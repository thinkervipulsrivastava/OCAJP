

public class LoopingConstruct {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        // For loop
        for (int i = 0; i < intArray.length; i ++) {
            System.out.print(intArray[i]);

        }

        System.out.println();
        // Enhanced For loop
        for (int arrayElement : intArray) {
            System.out.print(arrayElement);
        }

        System.out.println();
        //While loop
        int i = 0;
        while (i < 5) {
            System.out.print(intArray[i]);
            i ++;
        }

        System.out.println();
        //do while loop
        i = 0;
        do {
            System.out.print(intArray[i]);
            i ++;
        } while (i < 5);
    }
}
