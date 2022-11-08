package String_programs;

public class ConicalRepresentation {
    public static void main(String[] args) {
        String str1 = "Java strings";
        String str2 = new StringBuffer("Java").append("strings").toString();
        String str3 = str2.intern();
        System.out.println(str1 == str2);
    }
}
