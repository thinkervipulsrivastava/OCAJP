public class Casting {
    // Class level variable so default value
    static int classVar;
    public static void main(String[]args) {
        //Local level variable so don't have default value
      int intVar = 1;
      //Widening so only need implicit casting
      float longVar = intVar;
      System.out.println(("Widening: int converted into float primitive data type: " + longVar));
      //Narrowing so need to have explicit casting
      intVar = (int)longVar;
      System.out.println("Narrowing : float converted into int primitive data type: " + intVar);
    }
}
