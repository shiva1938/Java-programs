package String_programs;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        if(str.equals(result)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}
