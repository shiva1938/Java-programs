package String_programs;

public class NewStringObj {
    public static void main(String[] args) {
        char[] chr = {'1','2','3','4','5'};
        String str = String.copyValueOf(chr, 1, 3);
        System.out.println(str);
    }
}
