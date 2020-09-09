public class Super {
    protected String string = "Super Class Field";
    // private method not accessible in the sub class
  /*  private void myMethod () {
        System.out.println(myField);
    }*/
    protected void myMethod () {
        System.out.println(string);
    }

    protected void print (String string) {
        System.out.println (string + "printed from super class print method");
    }
}
