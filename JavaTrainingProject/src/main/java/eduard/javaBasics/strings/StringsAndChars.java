package eduard.javaBasics.strings;

public class StringsAndChars {
    public static void main(String[] args) {
//        task 1
        System.out.println("task 1:");
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        char secondToLastChar = str.charAt(str.length() - 2);
        char[] charArr = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == secondToLastChar) {
                counter++;
            }
        }
        System.out.println(counter);

//        task 2
        System.out.println("task 2:");
        String string = "coding";
        char ch = 'a';
        char ch2 = 'i';
        System.out.println(charPos(string, ch));
        System.out.println(charPos(string, ch2));

//        task 3
        System.out.println("task 3:");
        String string1 = "sometext";
        System.out.println(firstHalf(string1));

//        task 4
        System.out.println("task 4:");
        String string2 = "sometexttocheck";
        String toSearch = "to";
        String toSearch2 = "no";
        System.out.println(containsStr(string2, toSearch));
        System.out.println(containsStr(string2, toSearch2));

//        task 5
        System.out.println("task 5:");
        String[] strings = {"John", "have", "a", "dog"};
        System.out.println(stringFromArray(strings));

//        task 6
        System.out.println("task 6:");
        String string3 = "Cat";
        String string4 = "reverse";
        System.out.println(reverseString(string3));
        System.out.println(reverseString(string4));

//        task 7
        System.out.println("task 7:");
        String palindrome = "level";
        String palindrome1 = " A to kanapa pana kota";
        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(palindrome1));

//        task 8
        System.out.println("task 8:");
        String string5 = "AbfdnHDHJfdjIDHdh";
        System.out.println(toggleChar(string5));
    }

//    task 2
    public static int charPos(String str, char c) {
        return str.indexOf(c);
    }

//    task 3
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

//    task 4
    public static boolean containsStr(String str, String search) {
        return str.toLowerCase().contains(search);
    }

//    task 5
    public static String stringFromArray(String[] str) {
        return String.join(" ", str);
    }

//    task 6
    public static String reverseString(String string) {
        char[] chars = string.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;
    }

//    task 7
    public static boolean isPalindrome(String string) {
        string = string.trim();
        string = string.replaceAll(" ", "");
        string = string.toLowerCase();
        String str = reverseString(string);
        return string.equals(str);
    }

//    task 8
    public static String toggleChar(String str) {
        String result = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result += Character.toLowerCase(chars[i]);
            } else {
                result += Character.toUpperCase(chars[i]);
            }
        }
        return result;
    }
}
