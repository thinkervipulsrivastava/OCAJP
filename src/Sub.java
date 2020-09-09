public class Sub extends Super {

        public String string = "Sub class field";
        public void print (String string) {
            System.out.println(string + " printed from the sub class print method");
        }



        public  void execute () {
            //super.print(super.string);
            // O/P : Super Class Field printed from super class print method
              print(super.string);
            // O/p : Super Class Field printed from the sub class print method
            // print(string);
            //Sub class Field printed from the sub class print method


        }
    public static void main(String[] args) {
            new Sub(). execute();
         /*   Sub sub = new Sub();
        sub.myMethod();*/

    }
}
