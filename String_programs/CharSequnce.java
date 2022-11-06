package String_programs;

public class CharSequnce {
    public static void main(String[] args) {
        String str1 = "Example.com", str2 = "example.com";
        String ch = "example.com";
        System.out.println(str1.contentEquals(ch));
        System.out.println(str2.contentEquals(ch));
    }
}
