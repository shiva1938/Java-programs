package String_programs;

import java.sql.SQLOutput;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String wwords = "Reverse the given string";
        String[] wordSplit = wwords.split(" ");
        String finalResult = "";
        for(int i = wordSplit.length - 1; i >= 0; i--) {
            finalResult = finalResult + wordSplit[i] + " ";
        }
        System.out.println(finalResult);
        System.out.println("String reversed");
    }
}
