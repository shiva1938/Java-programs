package String_programs;

public class SpecifiedStringBuffer {
    public static void main(String[] args) {
        String str1 = "Example.com";
        String str2 = "example.com";
        StringBuffer sbf = new StringBuffer(str1);
        System.out.println(str2.contentEquals(sbf));
        System.out.println(str1.contentEquals(sbf));
    }
}
