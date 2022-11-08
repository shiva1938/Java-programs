package String_programs;

public class GetIndexOfAllChars {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy fox";
        int indexres1 = string.indexOf("b");
        int indexres2 = string.indexOf("u");
        int indexres3 = string.indexOf("o");
        int indexres4 = string.indexOf("t");
        System.out.println(indexres1);
        System.out.println(indexres2);
        System.out.println(indexres3);
        System.out.println(indexres4);
    }
}
