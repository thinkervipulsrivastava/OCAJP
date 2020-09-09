public class This {
    //this method invocation
    /*private String variable = "Instance Field";

    public void print (String string) {
        System.out.println(string);
    }

    public  void execute () {
        String variable = "Local Variable";
        print(this.variable);
        // print(variable); Local Variable
    }*/

    //this constructor invocation
    public String url;

    public This() {
        this("AB");
        System.out.println("Constructor with no argument");
    }
    public This(String url) {
        this.url = url;
        System.out.println("Constructor with 1 argument");
    }
}
