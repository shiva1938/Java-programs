package String_programs;

public class StringsInJava {
    public static void main(String[] args) {
        String lan1 = "python";
        String lan2 = "javascript";
        String lan3 = "Java";

        //Find string length

        int stringLength = lan2.length();
        System.out.println(stringLength);

        int stringln = lan3.length();
        System.out.println(stringln);

        //Join two strings

        String str1 = "java";
        String str2 = " programming";
        String result = str1.concat(str2);
        System.out.println(result);

        //compare two strings

        String programmigLanguage1 = "java programming";
        String programmingLanguage2 = "java programming";
        String ProgrammingLanguage3 = "Python proramming";

        boolean result1 = programmigLanguage1.equalsIgnoreCase(programmingLanguage2);
        System.out.println("First and second strings are equal: " + result1);

        boolean result2 = programmigLanguage1.equals(ProgrammingLanguage3);
        System.out.println("First and third string are equal: " + result2);

        //Escape charecters in java
        String example = "This is \"string\" class";
        System.out.println(example);

        //creating string with new keyword
        String exString = new String("Java strings");
        System.out.println(exString);

        //convert to string lowercase
        String convetLowercase = "StrINg";
        String resultLowerCase = convetLowercase.toLowerCase();
        System.out.println(resultLowerCase);

        //convert to string uppercase
        String convertUppercase = "strings";
        String resultUppercase = convertUppercase.toUpperCase();
        System.out.println(resultUppercase);
    }
}
