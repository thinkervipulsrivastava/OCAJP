public class PrimitiveObjectParameterPassing {
    public static void main (String[] args) {
        int value = 5;
        Data object = new Data(0);
        System.out.println("primitive: " + value);
        incrementValuePrimitive(value);
        System.out.println("primitive: " + value);
        System.out.println ("object: "+ object.value);
        incrementValue(object);
       // incrementValuePrimitive (object);
        System.out.println ("object: "+ object.value);

    }
    static  void incrementValuePrimitive (int value) {
        value ++;
    }
    static void incrementValue (Data object) {
        object.value ++ ;
    }
}
