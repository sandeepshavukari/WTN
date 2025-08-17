public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
    }
}
