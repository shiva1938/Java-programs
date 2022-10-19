package String_programs;

public class CountAlphabetsAndConsonants {
    public static void main(String[] args) {
        String str = "Think something big";
        str = str.toLowerCase();
        int vowelCount = 0;
        int consantCount = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if(ch >= 'a' || ch <= 'z') {
                consantCount++;
            }
        }
        System.out.println("The total number vowels in string are: " + vowelCount);
        System.out.println("The total number of consonants in string are: " + consantCount);
    }
}
