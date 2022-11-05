package String_programs;

public class LexicographicallyEqualOrNot {
    public static void main(String[] args) {
        String str1 = "This is exercise";
        String str2 = "This is exercise";

         int result = str1.compareTo(str2);
        // case ignare str1.compareToIgnoreCase(str2);

        if(result < 0 || result > 0) {
            System.out.println("Both strings are not lexicographical");
        } else {
            System.out.println("Both strings are lexicographically");
        }
    }
}