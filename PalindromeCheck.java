public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madams";
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println( str + " is a palindrome.");
        } else {
            System.out.println( str + " is not a palindrome.");
        }
    }
}