public class ObjectPolymorphism {
    public static void main(String[] args) {
        SuperObject superObject = new SuperObject();
        superObject.print();
        superObject = new Object1();
        superObject.print();
        superObject = new Object2();
        superObject.print();
    }
}
