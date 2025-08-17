public class SwapPairs {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuilder swapped = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i += 2) {
            swapped.append(str.charAt(i + 1));
            swapped.append(str.charAt(i));
        }
        if (str.length() % 2 != 0) {
            swapped.append(str.charAt(str.length() - 1));
        }

        System.out.println("Original string: " + str);
        System.out.println("Swapped string: " + swapped.toString());
    }
}