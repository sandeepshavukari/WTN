public class StringToArray {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] charArray = str.toCharArray();
        // System.out.println(charArray);
        System.out.println("Character array:");
        for (char ch : charArray) {
            System.out.println(ch);
        }
    }
}
