package String_programs;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String  str1 = "Care";
        String str2 = "Race";
        if(str1.length() != str2.length()) {
            System.out.println("Both strings are not anagrams");
        } else {

            String string1 = str1.toLowerCase();
            String string2 = str2.toLowerCase();

            char[] ch1 = string1.toCharArray();
            char[] ch2 = string2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1, ch2)) {
                System.out.println("Both strings are anagrams");
            } else {
                System.out.println("Both strings are not anagrams");
            }
        }
    }
}
