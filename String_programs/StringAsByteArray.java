package String_programs;

public class StringAsByteArray {
    public static void main(String[] args) {
        String str = "This is simple array";
        byte[] bytes = str.getBytes();
        String newStr = new String(bytes);
        System.out.println(newStr);
    }
}
