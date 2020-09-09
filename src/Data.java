public class Data {
    // Not using Encapsulation because of PrimitiveObjectParameterPassing
    public int value = 0;

    public Data (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    /*    public boolean equals (Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return  this.value == (( Data) obj).value;
    }*/
}
