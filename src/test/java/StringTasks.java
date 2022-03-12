import java.util.Locale;

public class StringTasks {
    public static void reverseString(String string) {
        System.out.println(string + ", reverse: " + new StringBuilder(string).reverse());
    }

    public static String changeChar(String string, Character character, Character newCharacter) {
        return string.replace(character, newCharacter);
    }

    public static String deletChar(String str, String character) {
        return str.replace(character, "");
    }

    public static void getCharCount(String str, Character character) {
        String newStr = str.toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < newStr.length() - 1; i++) {
            if (newStr.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Number of chars: " + character + " in: " + str + " = " + count);
    }

    public static void printStr(String str, String separator, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
            if (i + 1 != count) {
                System.out.print(separator);
            }
        }
    }

    public static boolean isStrPalindrome(String str){
        String newStr = str.replace(" ", "").toLowerCase(Locale.ROOT);
        return newStr.equals(new StringBuilder(newStr).reverse().toString());
    }

    public static int getFactorial(int num) {
        if (num <= 1) {
            return num;
        } else {
            return num * getFactorial(num - 1);
        }
    }
}