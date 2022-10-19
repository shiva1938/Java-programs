package String_programs;


public class CountPunctuations {
    public static void main(String[] args) {
        String string = "si**mp@@@@l!./,puns*&*^";
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch == '!' || ch == '.' || ch == ',' || ch == '*' || ch == '^' || ch == '@') {
                count++;
            }
        }
        System.out.println("The total number of punctuations are: " + count);
    }
}
