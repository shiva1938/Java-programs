package String_programs;

public class EndsWithGivenString {
    public static void main(String[] args) {
        String str1 = "Java exercises";
        String str2 = "java exer";
        String given = "es";
        System.out.println(str1.endsWith(given));
        System.out.println(str2.endsWith(given));
    }
}
