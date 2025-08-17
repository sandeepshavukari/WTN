public class IterateCharacters {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Characters in '" + str + "':");
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }
}