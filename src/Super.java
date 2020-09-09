public class Super {
    protected String myField = "A";
    // private method not accessible in the sub class
  /*  private void myMethod () {
        System.out.println(myField);
    }*/
    protected void myMethod () {
        System.out.println(myField);
    }
}
