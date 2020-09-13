public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("d");
        stringBuffer.insert(4, "e");
        stringBuffer.replace(0, stringBuffer.length(),"ABCDE");
        stringBuffer.delete(0,stringBuffer.length() - 1);
        stringBuffer.deleteCharAt(0);

        System.out.println(stringBuffer);
    }
}
