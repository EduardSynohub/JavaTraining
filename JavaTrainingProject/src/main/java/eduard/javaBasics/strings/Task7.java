package eduard.javaBasics.strings;

public class Task7 {
    public static void main(String[] args) {
        String palindrome = "level";
        String palindrome1 = " A to kanapa pana kota";
        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(palindrome1));
    }

    public static boolean isPalindrome(String string) {
        string = string.trim();
        string = string.replaceAll(" ", "");
        string = string.toLowerCase();
        String str = Task6.reverseString(string);
        return string.equals(str);
    }
}
