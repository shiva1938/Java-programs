package String_programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "reverse";
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println("The reverse of a string is: " + result);
    }
}
