package String_programs;

public class PrintDuplicateCharecters {
    public static void main(String[] args) {
        int count;
        String str = "qwerftyerdffgvcb";
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            count = 1;
            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] == ch[j]) {
                    ch[j] = 'o';
                    count++;
                }
            }
            if(ch[i] != 'o' && count > 1) {
                System.out.println(ch[i] + " repeated " + count + " times");
            }
        }
    }
}
