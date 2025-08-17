public class EvenLengthWords {
    public static void main(String[] args) {
        String input = "This is a test string with even length words";
        String[] words = input.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even length words: " + count);
    }
}
