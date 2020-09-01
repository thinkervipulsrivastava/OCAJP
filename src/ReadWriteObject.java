// Read and write Inside a Object
public class ReadWriteObject {
    // If we change modifier from private to other, read and write also object allowed outside the class/object
    private int integer;
    // We can access the integer variable without using this keyword as there is no local variable
    public int getInteger () {
        return integer;
    }
    // parameter is having same name as parameter which we need to modify, so this keyword is required because of shadowing)
    public void setInteger (int integer) {
        this.integer = integer;
    }

    public static void main (String [] args) {
        ReadWriteObject myObject = new ReadWriteObject();
        myObject.setInteger(1);
        System.out.println(myObject.getInteger());


    }

}
