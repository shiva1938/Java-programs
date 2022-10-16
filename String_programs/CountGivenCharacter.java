package String_programs;

public class CountGivenCharacter {
    public static void main(String[] args) {
        String str = "ahaksdfhsdgfsakjdfashdfgh";
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'f') {
                count++;
            }
        }
        System.out.println("The given string is number of appeared times is: " + count);
    }
}
